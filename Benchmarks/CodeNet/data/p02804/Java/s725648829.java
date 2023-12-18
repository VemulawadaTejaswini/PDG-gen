import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author varunvats32
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EMaxMinSums solver = new EMaxMinSums();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMaxMinSums {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            Integer[] arr = new Integer[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }

            Arrays.sort(arr);

            EMaxMinSums.Combination comb = new EMaxMinSums.Combination(n);
            EMaxMinSums.ModInt ans = new EMaxMinSums.ModInt(0);

            for (int j = 0; j < n; j++) {
                EMaxMinSums.ModInt c1 = comb.calculate(j, k - 1);
                EMaxMinSums.ModInt c2 = comb.calculate(n - j - 1, k - 1);
                ans = ans.add(EMaxMinSums.ModInt.multiply(new EMaxMinSums.ModInt(arr[j]), EMaxMinSums.ModInt.add(c1, c2.negative())));
            }

            out.println(ans.x);
        }

        private static class Combination {
            private static final int mod = 1000000007;
            public EMaxMinSums.ModInt[] fact;
            public EMaxMinSums.ModInt[] ifact;

            public Combination(int n) {
                fact = new EMaxMinSums.ModInt[n + 1];
                ifact = new EMaxMinSums.ModInt[n + 1];

                assert (n < mod);
                fact[0] = new EMaxMinSums.ModInt(1);
                for (int i = 1; i <= n; i++) {
                    fact[i] = EMaxMinSums.ModInt.multiply(fact[i - 1], new EMaxMinSums.ModInt(i));
                }

                ifact[n] = fact[n].inv();
                for (int i = n; i >= 1; i--) {
                    ifact[i - 1] = EMaxMinSums.ModInt.multiply(ifact[i], new EMaxMinSums.ModInt(i));
                }
            }

            public EMaxMinSums.ModInt calculate(int n, int k) {
                if (k < 0 || k > n) return new EMaxMinSums.ModInt(0);
                return EMaxMinSums.ModInt.multiply(fact[n], EMaxMinSums.ModInt.multiply(ifact[k], ifact[n - k]));
            }

        }

        private static class ModInt {
            private static final int mod = 1000000007;
            public long x;

            public ModInt(long x) {
                this.x = (x % mod + mod) % mod;
            }

            public EMaxMinSums.ModInt negative() {
                return new EMaxMinSums.ModInt(-x);
            }

            public static EMaxMinSums.ModInt add(EMaxMinSums.ModInt a, EMaxMinSums.ModInt b) {
                EMaxMinSums.ModInt c = new EMaxMinSums.ModInt(a.x);
                if ((c.x += b.x) >= mod) c.x -= mod;
                return c;
            }

            public static EMaxMinSums.ModInt multiply(EMaxMinSums.ModInt a, EMaxMinSums.ModInt b) {
                EMaxMinSums.ModInt c = new EMaxMinSums.ModInt(a.x);
                c.x *= b.x;
                c.x %= mod;
                return c;
            }

            public EMaxMinSums.ModInt add(EMaxMinSums.ModInt a) {
                if ((x += a.x) >= mod) x -= mod;
                return new EMaxMinSums.ModInt(x);
            }

            public EMaxMinSums.ModInt multiply(EMaxMinSums.ModInt a) {
                x *= a.x;
                x %= mod;
                return new EMaxMinSums.ModInt(x);
            }

            public EMaxMinSums.ModInt inv() {
                return pow(mod - 2);
            }

            public EMaxMinSums.ModInt pow(long p) {
                if (p == 0) return new EMaxMinSums.ModInt(1);
                EMaxMinSums.ModInt r = pow(p >> 1);
                r = r.multiply(r);
                if ((p & 1) == 1)
                    r = r.multiply(this);
                return r;
            }

        }

    }
}

