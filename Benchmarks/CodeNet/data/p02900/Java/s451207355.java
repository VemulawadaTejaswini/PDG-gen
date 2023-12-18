import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 解説youtube後
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long ans = solve(a, b);
        System.out.println(ans);
    }

    static long solve(long a, long b) {
        long gcd = gcd(a, b);
        long ans = primeFactorize(gcd);
        return ans;
    }

    private static long primeFactorize(long gcd) {
        // 素因数分解の数値をキー、回数をバリューで保持る
        Map<Long, Long> m = new HashMap<>();
        for (long i = 2; i * i <= gcd; i++) {
            // System.err.printf("--%s \n", i);
            if (gcd % i != 0) {
                continue;
            }
            while (gcd % i == 0) {
                // System.err.printf(" %s ÷ %s \n", gcd, i);
                gcd /= i;
                m.put(i, m.getOrDefault(i, 0L) + 1);
            }
        }

        if (gcd > 1) {
            m.put(gcd, m.getOrDefault(gcd, 0L) + 1);
        }

        // System.err.println(m);
        return m.keySet().size() + 1;
    }

    static long gcd(long x, long y) {
        // y != 0 の場合、再帰的に実行される。
        if (y == 0) {
            return x;
        }

        if (x >= y) {
            x = x % y;
        }
        return gcd(y, x);
    }
}
