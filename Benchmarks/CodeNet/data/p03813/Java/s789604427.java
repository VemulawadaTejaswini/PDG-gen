package com.company.abc053;

import java.io.*;
import java.util.Scanner;

/**
 * Created by ueda on 2017/01/28.
 */
public class A {
    public static void main(String[] args) {
        out.println(in.nextInt() < 1200 ? "ABC" : "ARC");
    }
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;
}
