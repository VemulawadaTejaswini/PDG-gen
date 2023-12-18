// package app;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        // final String N = sc.next();
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        final int C = sc.nextInt();
        // final int N = sc.nextInt();
        // final int D = sc.nextInt();
        // System.out.println();
        int result = 0;
        if (A == B){
            result = C;
        } else if(A == C) {
            result = B;
        } else {
            result = A;
        }

        System.out.println(result);

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}