package com.go.atcoder.contest.oneseventhree;

import java.util.Scanner;  // Import the Scanner class

 class Payment {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amt = in.nextInt();
        int res = solve(amt);
        System.out.println("res :" + res);
    }

    public static int solve(int inp) {
        System.out.println("given money : " + inp);
        int rem = inp % 1000;
        return (rem != 0) ? 1000 - rem : 0;
    }
}
