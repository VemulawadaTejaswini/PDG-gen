// package app;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        final String N = sc.next();

        // final int X = sc.nextInt();
        // final int N = sc.nextInt();
        // final int D = sc.nextInt();
        // System.out.println();

        StringBuffer sb = new StringBuffer(N);

        System.out.println(N.equals(sb.reverse().toString()) ? "Yes" : "No");

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}