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

        final int x = sc.nextInt();
        final int y = sc.nextInt();
        // final int N = sc.nextInt();
        // final int D = sc.nextInt();
        // System.out.println();
        System.out.println(Solve(x) == Solve(y) ? "Yes" : "No");

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }

    static int Solve(int val){
        if (val == 2) {
            return 3;
        } else if ("135781012".contains(String.valueOf(val))){
            return 1;
        } else {
            return 2;
        }


    }

}