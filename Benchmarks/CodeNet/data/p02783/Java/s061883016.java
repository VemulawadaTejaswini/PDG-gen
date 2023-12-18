//package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            int val;
            val = sc.nextInt();
            a.add(val);
        }
        for (int i = 0; i < N; i++) {
            H -= a.get(i);
        }
        if (H <= 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
