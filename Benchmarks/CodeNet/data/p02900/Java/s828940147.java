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
            System.err.printf("--%s \n", i);
            if (gcd % i != 0) {
                continue;
            }
            while (gcd % i == 0) {
                System.err.printf("  %s ÷ %s \n", gcd, i);
                gcd /= i;
                m.put(i, m.getOrDefault(i, 0L) + 1);
            }
        }
        // 最後に余った数
        m.put(gcd, 1L);

        System.err.println(m);
        return m.keySet().size() + 1;
    }

    static long gcd(long x, long y) {
        // gcd ワンライナー。x < yの場合x%yはxの値になり、gcdの引数はswapされる
        return y == 0 ? x : gcd(y, x % y);
    }
}
