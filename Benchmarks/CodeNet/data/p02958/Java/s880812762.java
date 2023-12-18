// package app;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // long N = sc.nextLong();
        // long K = sc.nextLong();
        int N = sc.nextInt();

        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        int result = BubbleSort(P);

        System.out.println(result < 2 ? "YES" : "NO");
    }

    static int BubbleSort(int[] arr) {
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                tmp = i;
            } else {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > arr[tmp] || j + 1 == arr.length) {
                        int t = arr[tmp];
                        arr[tmp] = arr[j];
                        arr[j] = t;
                        cnt++;
                        max = arr[tmp];
                        break;
                    }
                }
            }
        }

        return cnt;
    }
}