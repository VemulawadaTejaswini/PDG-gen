import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long s = sc.nextLong();
        if (n < s) {
            System.out.println(-1);
            return;
        }
        if (n == s) {
            System.out.println(n + 1);
            return;
        }
        for (long b = 2; b * b <= n; b++) {
            if (f(b, n) == s) {
                System.out.println(b);
                return;
            }
        }
        long ans = 1000_000L;
        boolean found = false;
        for (long p = 1; p * p < n; p++) {
            if ((n - s) % p != 0) continue;
            long b = (n - s) / p + 1;
            if (f(b, n) == s) {
                found = true;
                ans = b;
            }
        } 
        if (found) System.out.println(ans);
        else System.out.println(-1);
    }

    public static long f(long b, long n) {
        if (n < b) return n;
        return f(b, n / b) + n % b;
    }
}