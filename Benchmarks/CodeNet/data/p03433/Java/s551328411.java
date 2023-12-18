// package app;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        // final String S = sc.next();
        // final int A = sc.nextInt();
        // final int A = sc.nextInt();
        // final int B = sc.nextInt();
        // final int C = sc.nextInt();
        int N = sc.nextInt();
        int A = sc.nextInt();

        boolean result = N % 500 == 0 || N % 500 <= A;

        // System.out.println();
        System.out.println(result ? "Yes" : "No");

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}