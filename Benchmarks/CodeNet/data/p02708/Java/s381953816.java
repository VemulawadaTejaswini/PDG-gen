

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextInt();
        long k = sc.nextInt();
        long mod = (long) Math.pow(10, 9) + 7;
        long count = 0;
        for (long i = k; i <= n + 1; i++) {
            long min = sum(0, i - 1);
            long max = sum(n - i + 1, n);
            count += (max - min + 1);
            count %= mod;
        }
        System.out.println(count);

    }

    private static long sum(long left, long right) {
        return (left + right) * (right - left + 1) / 2;
    }
}
