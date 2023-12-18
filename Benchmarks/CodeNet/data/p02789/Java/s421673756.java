//package com.company;

import java.util.*;
import java.io.*;

public class Main{
    private static Scanner sc = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out, true);
    private static int n, m;

    private static void Input() {
        n = sc.nextInt();
        m = sc.nextInt();
    }

    private static void Solve() {
        if (n == m) out.println("Yes");
        else out.println("No");
    }

    public static void main(String[] args)  {
        Input();
        Solve();
    }
}
