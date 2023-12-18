import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        FManyManyPaths solver = new FManyManyPaths();
        solver.solve(1, in, out);
        out.close();
    }

    static class FManyManyPaths {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int r1 = in.nextInt();
            int c1 = in.nextInt();
            int r2 = in.nextInt();
            int c2 = in.nextInt();

            r1--;
            c1--;

            FManyManyPaths.Combination comb = new FManyManyPaths.Combination(2000005);
            FManyManyPaths.ModInt a = g(comb, r2, c2);
            FManyManyPaths.ModInt b = g(comb, r2, c1);
            FManyManyPaths.ModInt c = g(comb, r1, c2);
            FManyManyPaths.ModInt d = g(comb, r1, c1);

            FManyManyPaths.ModInt e = FManyManyPaths.ModInt.add(a, d);
            FManyManyPaths.ModInt f = FManyManyPaths.ModInt.add(b, c);
            FManyManyPaths.ModInt ans = FManyManyPaths.ModInt.subtract(e, f);

            out.println(ans.x);
        }

        public FManyManyPaths.ModInt g(FManyManyPaths.Combination comb, int r, int c) {
            return FManyManyPaths.ModInt.subtract(comb.calculate(r + c + 2, r + 1), new FManyManyPaths.ModInt(1));
        }

        public static class Combination {
            private static final int mod = 1000000007;
            public FManyManyPaths.ModInt[] fact;
            public FManyManyPaths.ModInt[] ifact;

            public Combination(int n) {
                fact = new FManyManyPaths.ModInt[n + 1];
                ifact = new FManyManyPaths.ModInt[n + 1];

                assert (n < mod);
                fact[0] = new FManyManyPaths.ModInt(1);
                for (int i = 1; i <= n; i++) {
                    fact[i] = FManyManyPaths.ModInt.multiply(fact[i - 1], new FManyManyPaths.ModInt(i));
                }

                ifact[n] = fact[n].inv();
                for (int i = n; i >= 1; i--) {
                    ifact[i - 1] = FManyManyPaths.ModInt.multiply(ifact[i], new FManyManyPaths.ModInt(i));
                }
            }

            public FManyManyPaths.ModInt calculate(int n, int k) {
                if (k < 0 || k > n) return new FManyManyPaths.ModInt(0);
                return FManyManyPaths.ModInt.multiply(fact[n], FManyManyPaths.ModInt.multiply(ifact[k], ifact[n - k]));
            }

        }

        public static class ModInt {
            private static final int mod = 1000000007;
            public long x;

            public ModInt(long x) {
                this.x = (x % mod + mod) % mod;
            }

            public static FManyManyPaths.ModInt add(FManyManyPaths.ModInt a, FManyManyPaths.ModInt b) {
                FManyManyPaths.ModInt c = new FManyManyPaths.ModInt(a.x);
                if ((c.x += b.x) >= mod) c.x -= mod;
                return c;
            }

            public static FManyManyPaths.ModInt subtract(FManyManyPaths.ModInt a, FManyManyPaths.ModInt b) {
                FManyManyPaths.ModInt c = new FManyManyPaths.ModInt(a.x);
                if ((c.x += mod - b.x) >= mod) c.x -= mod;
                return c;
            }

            public static FManyManyPaths.ModInt multiply(FManyManyPaths.ModInt a, FManyManyPaths.ModInt b) {
                FManyManyPaths.ModInt c = new FManyManyPaths.ModInt(a.x);
                c.x *= b.x;
                c.x %= mod;
                return c;
            }

            public FManyManyPaths.ModInt multiply(FManyManyPaths.ModInt a) {
                x *= a.x;
                x %= mod;
                return new FManyManyPaths.ModInt(x);
            }

            public FManyManyPaths.ModInt inv() {
                return pow(mod - 2);
            }

            public FManyManyPaths.ModInt pow(long p) {
                if (p == 0) return new FManyManyPaths.ModInt(1);
                FManyManyPaths.ModInt r = pow(p >> 1);
                r = r.multiply(r);
                if ((p & 1) == 1)
                    r = r.multiply(this);
                return r;
            }

        }

    }
}

