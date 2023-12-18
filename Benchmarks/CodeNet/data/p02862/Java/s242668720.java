import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        System.out.println(solve(X, Y));
    }

    private static long solve(int X, int Y) {
        if ((2*X-Y)%3 != 0 || (2*Y-X)%3 != 0) {
            return 0;
        }

        int a = (2*X-Y)/3;
        int b = (2*Y-X)/3;
        return combinationSimple(a+b, a, MOD);
    }

    public static long combinationSimple(int n, int r, int p) {
        if (n == 0 && r == 0) return 1;
        if (n < r || n < 0)   return 0;

        r = Math.min(r, n-r);
        long x = 1;
        long y = 1;
        for (int i=1; i<=r; i++) {
            x = x * (n-i+1) % p;
            y = y * i % p;
        }

        return x * power(y, p-2, p) % p;
    }

    public static long power(long base, long t, long p) {
        long ans = 1;

        while (t > 0) {
            if (t%2 == 1) {
                ans = ans * base % p;
            }

            t /= 2;
            base = base * base % p;
        }

        return ans;
    }
}