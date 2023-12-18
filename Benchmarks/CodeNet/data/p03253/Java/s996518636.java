import java.util.*;

public class main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int mod = (int)1e9 + 7;
        Map<Integer, Integer> primeFactors = new HashMap<>();
        for (int i = 2; i * i <= m; i++) {
            while (m % i == 0) {
                m /= i;
                primeFactors.put(i, primeFactors.getOrDefault(i, 0) + 1);
            }
        }
        if (!primeFactors.isEmpty() && m != 1) {
            primeFactors.put(m, primeFactors.getOrDefault(m, 0) + 1);
        }

        System.out.println(primeFactors);
        long ans = 1;
        for (int i : primeFactors.values()) {
            Util.println(n + i - 1, i, combinationAndMod(n + i - 1, i));
            ans = ans * combinationAndMod(i + n - 1, i) % mod;
        }
        System.out.println(ans);
    }

    static long combinationAndMod(long n, long r) {
        r = Math.min(r, n - r);
        long x = 1, y = 1;
        for (long i = 1; i <= r; i++) {
            x = x * (n - r + i) % 1000000007;
            y = y * i % 1000000007;
        }
        return x * powAndMod(y, 1000000005) % 1000000007;
    }

    static long powAndMod(long a, long b) {
        if (b == 0)
            return 1;
        if ((b & 1) == 1)
            return a * powAndMod(a, b - 1) % 1000000007;
        return powAndMod(a * a % 1000000007, b / 2);
    }
}