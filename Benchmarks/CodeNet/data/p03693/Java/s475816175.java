// package app;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        // final String N = sc.next();

        final int r = sc.nextInt();
        final int g = sc.nextInt();
        final int b = sc.nextInt();
        // final int N = sc.nextInt();
        // final int D = sc.nextInt();
        // System.out.println();
        System.out.println(( r * 100 + g * 10 + b ) % 4 == 0 ? "YES" : "NO");

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}