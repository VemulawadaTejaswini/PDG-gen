// package app;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        // final String N = sc.next();
        // final int M = sc.nextInt();
        // final int N = sc.nextInt();
        // final int D = sc.nextInt();

        String[] str = new String[2];
        for (int i = 0; i < 2; i++) {
            str[i] = sc.next();
        }
        StringBuffer firstStr = new StringBuffer(str[0]);
        firstStr.reverse();

        // System.out.println();
        System.out.println(str[1].equals(firstStr.toString()) ? "YES": "NO");

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}