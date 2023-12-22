// 提出時に消す
// package app;

import java.util.Scanner;
import java.util.stream.LongStream;

// 提出時にMainに変更する
public class Main {
// public class ABC177C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        final long MOD = 1000000007L;

        int n = sc.nextInt();

        long[] a = LongStream.range(0, n).map(e -> sc.nextLong()).toArray();

        long ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ans += a[i] * a[j] % MOD;
                ans = ans % MOD;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}