// package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        String contestName = N >= 1000 ? "ABD" : "ABC";

        System.out.println(contestName);

    }
}