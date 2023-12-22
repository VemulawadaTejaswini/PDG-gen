
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    static class Solver {
        long[] factorial;
        long[] facInverse;
        long[] inverse;

        void solve(int n, int m, int k) {
            init(n);
            int sum = 0;
            for (int i = 0; i <= k; i++) {
                final long edge = ncr(n - 1, i);
                sum = (int) ((sum + (edge * (m * modpow(m - 1, n - 1 - i) % MOD)) % MOD) % MOD);
            }
            System.out.println(sum);
        }

        void init(int n) {
            final int MAX = n + 2;
            factorial = new long[MAX];
            facInverse = new long[MAX];
            inverse = new long[MAX];
            factorial[0] = factorial[1] = 1;
            facInverse[0] = facInverse[1] = 1;
            inverse[1] = 1;
            for (int i = 2; i < MAX; i++) {
                factorial[i] = factorial[i - 1] * i % MOD;
                final long inv = inverse[i] = MOD - inverse[MOD % i] * (MOD / i) % MOD;
                facInverse[i] = facInverse[i - 1] * inv % MOD;
            }
        }

        long ncr(int n, int r) {
            if (n < r) { return 0; }
            if (n < 0 || r < 0) { return 0; }
            return factorial[n] * (facInverse[r] * facInverse[n - r] % MOD) % MOD;
        }

        long modpow(long a, long n) {
            long res = 1;
            while (n > 0) {
                if (n % 2 == 1) {
                    res = res * a % MOD;
                }
                a = a * a % MOD;
                n /= 2;
            }
            return res;
        }
    }

    private static final int MOD = (int) (1e9 + 7);

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int k = Integer.parseInt(in.nextLine());
        final int n = in.nextLine().length();
        final Solver solver = new Solver();
        solver.init(2 * (int) 1e6);
        long res = 0;
        for (int i = 0; i <= k; ++i) {
            final long add = solver.modpow(26, k - i) *
                             solver.ncr(n - 1 + i, i) % MOD *
                             solver.modpow(25, i) % MOD;
            res = (res + add) % MOD;
        }
        System.out.println(res % MOD);
    }

    // Duplicates
    // https://www.hackmath.net/en/calculator/combinations-and-permutations?n=26&k=5&order=0&repeat=1
    public static long nhr(Solver s, int n, int r) {
        return (n | r) == 0 ? 1 : s.ncr(n + r - 1, r);
    }
}
