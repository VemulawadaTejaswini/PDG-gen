// package app;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        // final String x = sc.next();
        // final String y = sc.next();

        final String A = sc.next();
        final String B = sc.next();
        final String C = sc.next();
        // final int N = sc.nextInt();
        // final int D = sc.nextInt();
        // System.out.println();

        System.out.println(A.charAt(A.length() - 1) == B.charAt(0) && B.charAt(B.length() - 1) == C.charAt(0) ? "YES" : "NO");

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}