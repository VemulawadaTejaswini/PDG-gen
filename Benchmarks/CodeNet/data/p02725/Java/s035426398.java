// package app;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // String line = sc.next();
        int K = sc.nextInt();
        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt() % K;
        }

        Arrays.sort(A);

        // K - end + secondEnd
        int endToSecondEndCw = K - A[A.length - 1] + A[A.length - 2];

        // end - first
        int firstToEndCw = A[A.length - 1] - A[0];

        System.out.println(Math.min(endToSecondEndCw, firstToEndCw));
    }

}