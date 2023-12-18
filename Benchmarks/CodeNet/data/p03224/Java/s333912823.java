import java.util.*;

/**
 * Copyright © 2018 Chris. All rights reserved.
 *
 * @author Chris
 * 2018/7/5 22:51
 */
public class Main {

    final static int MOD = 1000000007;
    static Scanner sc;

    private static int comb(int n, int m) {
        return 1;
    }

    static void getDiv(Map<Integer, Integer> map, int n) {
        int sqrt = (int) Math.sqrt(n);
        for (int i = sqrt; i >= 2; i--) {
            if (n % i == 0) {
                getDiv(map, i);
                getDiv(map, n / i);
                return;
            }
        }
        map.put(n, map.getOrDefault(n, 0) + 1);
    }

    @SuppressWarnings("unchecked")
    private static void solve() {
        int n = nextInt();
        System.out.println("Yes");
        if (n == 1) {
            System.out.println("1 1");
            System.out.print("1 1");
            return;
        }
        for (int i = 1; i < n; i++) {
            System.out.println("2 " + i + " " + (i + 1));
        }
        System.out.print("2 " + n + " 1");
    }

    static long gcd(long a, long b) {
        if (a < b) {
            a ^= b;
            b ^= a;
            a ^= b;
        }
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String args[]) {
        sc = new Scanner(System.in);
        solve();
    }

    private static int nextInt() {
        return sc.nextInt();
    }

    private static long nextLong() {
        return sc.nextLong();
    }

    private static String next() {
        return sc.next();
    }

    private static double nextDouble() {
        return sc.nextDouble();
    }
}
