import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BRGBColoring solver = new BRGBColoring();
        solver.solve(1, in, out);
        out.close();
    }

    static class BRGBColoring {
        static final BRGBColoring.Mod mod = new BRGBColoring.Mod();
        NumberTheory.ModularNumber<BRGBColoring.Mod>[] fact;

        public NumberTheory.ModularNumber<BRGBColoring.Mod> ncr(int n, int r) {
            if (r < 0 || n < r) return mod.create(0);
            return fact[n].div(fact[r].mult(fact[n - r]));
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int aPoints = in.nextInt();
            int bPoints = in.nextInt();
            long k = in.nextLong();

            fact = new NumberTheory.ModularNumber[n + 1];
            fact[0] = mod.create(1);
            for (int i = 1; i <= n; i++) {
                fact[i] = fact[i - 1].mult(i);
            }

            NumberTheory.ModularNumber<BRGBColoring.Mod> answer = mod.create(0);

            for (int a = 0; a <= n && a * aPoints <= k; a++) {
                long b = (k - a * aPoints) / bPoints;
                if (b >= 0 && b <= n && a * aPoints + b * bPoints == k) {
                    answer = answer.add(ncr(n, a).mult(ncr(n, (int) b)));
                }
            }

            out.println(answer);
        }

        static class Mod extends NumberTheory.Modulus<BRGBColoring.Mod> {
            public long modulus() {
                return 998244353;
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }

    static class NumberTheory {
        public abstract static class Modulus<M extends NumberTheory.Modulus<M>> {
            public abstract long modulus();

            public NumberTheory.ModularNumber<M> create(long value) {
                return new NumberTheory.ModularNumber(value, this);
            }

        }

        public static class ModularNumber<M extends NumberTheory.Modulus<M>> {
            public final long value;
            public final M m;
            public final long MOD;

            public ModularNumber(long value, M m) {
                this.m = m;
                this.MOD = m.modulus();
                this.value = (value % MOD + MOD) % MOD;
            }

            public NumberTheory.ModularNumber<M> add(NumberTheory.ModularNumber<M> other) {
                return m.create(value + other.value);
            }

            public NumberTheory.ModularNumber<M> mult(NumberTheory.ModularNumber<M> other) {
                return m.create(value * other.value);
            }

            public NumberTheory.ModularNumber<M> mult(long other) {
                return m.create(value * other);
            }

            public NumberTheory.ModularNumber<M> div(NumberTheory.ModularNumber<M> other) {
                return this.mult(other.inv());
            }

            public NumberTheory.ModularNumber<M> inv() {
                long g = m.modulus(), x = 0, y = 1;
                for (long r = value; r != 0; ) {
                    long q = g / r;
                    g %= r;

                    long temp = g;
                    g = r;
                    r = temp;

                    x -= q * y;

                    temp = x;
                    x = y;
                    y = temp;
                }

                return m.create(x);
            }

            public String toString() {
                return String.valueOf(value);
            }

        }

    }
}

