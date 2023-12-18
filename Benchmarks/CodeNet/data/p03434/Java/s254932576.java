package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        Scanner sc = new Scanner(System.in);
        int alice = 0;
        int bob = 0;

        int N = sc.nextInt();
        Integer[] cards = new Integer[N];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }
        Arrays.sort(cards, Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                alice += cards[i];
            } else {
                bob += cards[i];
            }
        }
        System.out.println(alice - bob);

    }

}