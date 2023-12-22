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

        long[] a = LongStream.range(0, n).map(e -> sc.nextLong()).filter(e -> e != 0).toArray();

        long ans = 0;
        long sum = LongStream.of(a).sum();

        for (int i = 0; i < a.length; i++) {
            sum -= a[i];
            ans += a[i] * sum % MOD;
        }

        ans = ans % MOD;
        System.out.println(ans);

        sc.close();
    }
}