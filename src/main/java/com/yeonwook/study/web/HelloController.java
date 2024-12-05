package com.yeonwook.study.web;

import com.yeonwook.study.web.dto.HelloResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
    public String hello(){
    //테스트
      return "hello";
  }

  @GetMapping("/hello/dto")
  public HelloResponseDto helloDto(@RequestParam("name") String  name, @RequestParam("amount") int amount){
    return new HelloResponseDto(name, amount);
  }
}

