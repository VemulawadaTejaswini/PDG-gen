import sun.reflect.generics.tree.Tree;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        TreeMap<Integer, Integer> primes = new TreeMap<>();
        for (int i = 1; i <= N; i++) {
            primes = factorize(i, primes);
        }

        int c74 = 0, c2 = 0, c4 = 0, c14 = 0, c24 = 0;
        for (Map.Entry<Integer, Integer> entry : primes.entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();
            if (v >= 74) {
                c74++;
            }
            if (v >= 24) {
                c24++;
            }
            if (v >= 14) {
                c14++;
            }
            if (v >= 4) {
                c4++;
            }
            if (v >= 2) {
                c2++;
            }
        }

        int ans = c74;

        Combination combination = new Combination(N, 1_000_000_007);
        ans += combination.kFromN(1, c24) * combination.kFromN(1, c2 - 1);
        ans += combination.kFromN(1, c14) * combination.kFromN(1, c4 - 1);
        ans += combination.kFromN(2, c4) * combination.kFromN(1, c2 - 2);
        System.out.println(ans);

    }

    static TreeMap<Integer, Integer> factorize(int n, TreeMap<Integer, Integer> primes) {
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                primes.put(i, primes.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n != 1) {
            primes.put(n, primes.getOrDefault(n, 0) + 1);
        }
        return primes;
    }
}


class Combination {

    private final int MOD;
    private final int MAX;

    private final long[] fac, facInv, inv;

    public Combination(int max, int mod) {
        this.MAX = max + 1;
        this.MOD = mod;
        fac = new long[MAX];
        facInv = new long[MAX];
        inv = new long[MAX];

        fac[0] = fac[1] = 1;
        facInv[0] = facInv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            facInv[i] = facInv[i - 1] * inv[i] % MOD;
        }
    }

    public long kFromN(int k, int n) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (facInv[k] * facInv[n - k] % MOD) % MOD;
    }
}

