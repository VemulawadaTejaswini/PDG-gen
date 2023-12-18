import java.util.*;

/**
 * Copyright © 2018 Chris. All rights reserved.
 *
 * @author Chris
 * 2018/7/5 22:51
 */
public class Main {

    final static int MOD = 1000000007;

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
    private static void solve(Scanner sc) {
        long n = sc.nextInt();
        long m = sc.nextInt();
        char s[] = sc.next().toCharArray();
        char t[] = sc.next().toCharArray();
        if (s[0] != t[0]) {
            System.out.println(-1);
            return;
        }
        long gcd = gcd(n, m);
        long lcm = n * m / gcd;
        int t1 = (int) (n / gcd);
        int t2 = (int) (m / gcd);
        while (t1 < n && t2 < m) {
            if (s[t1] != t[t2]) {
                System.out.println(-1);
                return;
            }
            t1 += (int) (n / gcd);
            t2 += (int) (m / gcd);
        }
        System.out.println(lcm);
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

        solve(new Scanner(System.in));
    }
}
