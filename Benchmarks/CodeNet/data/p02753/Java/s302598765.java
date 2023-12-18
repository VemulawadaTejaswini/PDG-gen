package com.company;

import java.util.Scanner;

public class Main {

    // https://atcoder.jp/contests/abc158/submissions/10588295
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a.equals("aaa") || a.equals("bbb")){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}