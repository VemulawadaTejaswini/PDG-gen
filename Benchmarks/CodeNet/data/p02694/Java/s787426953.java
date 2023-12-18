package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // 整数の入力
    int x = sc.nextInt();

    int year = 0;
    BigDecimal money = new BigDecimal(100);
    BigDecimal X = new BigDecimal(x);
    while (X.compareTo(money) > 0) {
      money = money.multiply(new BigDecimal("1.01"));
      year++;
    }

    // 出力
    System.out.println(year);
  }
}
