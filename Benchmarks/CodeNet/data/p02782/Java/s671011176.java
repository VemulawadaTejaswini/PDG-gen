import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FManyManyPaths solver = new FManyManyPaths();
        solver.solve(1, in, out);
        out.close();
    }

    static class FManyManyPaths {
        NumberTheory.Mod107 mod = new NumberTheory.Mod107();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int r1 = in.nextInt() - 1, c1 = in.nextInt() - 1;
            int r2 = in.nextInt(), c2 = in.nextInt();

            long answer = mod.subtract(mod.add(f(r2, c2), f(r1, c1)), mod.add(f(r2, c1), f(r1, c2)));

            out.println(answer);
        }

        private long f(int x, int y) {
            return mod.subtract(mod.ncr(x + y + 2, y + 1), 1);
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

    }

    static class NumberTheory {
        private static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
        }

        public abstract static class Modulus<M extends NumberTheory.Modulus<M>> {
            ArrayList<Long> factorial = new ArrayList<>();
            ArrayList<Long> invFactorial = new ArrayList<>();

            public abstract long modulus();

            public Modulus() {
                super();
                factorial.add(1L);
                invFactorial.add(1L);
            }

            public long fact(int n) {
                while (factorial.size() <= n) {
                    factorial.add(mult(factorial.get(factorial.size() - 1), factorial.size()));
                }

                return factorial.get(n);
            }

            public long fInv(int n) {
                int lastKnown = invFactorial.size() - 1;

                if (lastKnown < n) {
                    long[] fInv = new long[n - lastKnown];
                    fInv[0] = inv(fact(n));
                    for (int i = 1; i < fInv.length; i++) {
                        fInv[i] = mult(fInv[i - 1], n - i + 1);
                    }
                    for (int i = fInv.length - 1; i >= 0; i--) {
                        invFactorial.add(fInv[i]);
                    }
                }

                return invFactorial.get(n);
            }

            public long ncr(int n, int r) {
                ASSERT(n >= 0);
                if (r < 0 || n < r)
                    return 0;
                return mult(fact(n), mult(fInv(r), fInv(n - r)));
            }

            public long normalize(long x) {
                x %= modulus();
                if (x < 0)
                    x += modulus();
                return x;
            }

            public long add(long a, long b) {
                long v = a + b;
                return v < modulus() ? v : v - modulus();
            }

            public long subtract(long a, long b) {
                long v = a - b;
                return v < 0 ? v + modulus() : v;
            }

            public long mult(long a, long b) {
                return (a * b) % modulus();
            }

            public long inv(long value) {
                long g = modulus(), x = 0, y = 1;
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

                ASSERT(g == 1);
                ASSERT(y == modulus() || y == -modulus());

                return normalize(x);
            }

        }

        public static class Mod107 extends NumberTheory.Modulus<NumberTheory.Mod107> {
            public long modulus() {
                return 1_000_000_007L;
            }

        }

    }
}

