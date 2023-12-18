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
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EConvexScore solver = new EConvexScore();
        solver.solve(1, in, out);
        out.close();
    }

    static class EConvexScore {
        int[] x;
        int[] y;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            NumberTheory.ModM m = new NumberTheory.ModM(998244353L);

            long answer = 0;
            answer = m.add(answer, m.pow(2, n));
            answer = m.subtract(answer, m.ncr(n, 0));
            answer = m.subtract(answer, m.ncr(n, 1));
            answer = m.subtract(answer, m.ncr(n, 2));

            x = new int[n];
            y = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    EConvexScore.Slope s = from(i, j);
                    int count = 0;

                    for (int k = 0; k < n; k++) {
                        if (k == i || k == j)
                            continue;

                        if (from(i, k).eq(s)) {
                            count++;
                        }
                    }

                    if (count > 0) {
                        count += 2;
                        long overcount = m.pow(2, count);
                        overcount = m.subtract(overcount, m.ncr(count, 0));
                        overcount = m.subtract(overcount, m.ncr(count, 1));
                        overcount = m.subtract(overcount, m.ncr(count, 2));
                        overcount = m.div(overcount, m.ncr(count, 2));
                        answer = m.subtract(answer, overcount);
                    }
                }
            }

            out.println(answer);
        }

        private EConvexScore.Slope from(int i, int j) {
            int dx = x[j] - x[i];
            int dy = y[j] - y[i];
            return new EConvexScore.Slope(dx, dy);
        }

        static class Slope {
            final int x;
            final int y;

            Slope(int x, int y) {
                if (x < 0) {
                    x *= -1;
                    y *= -1;
                }

                int g = NumberTheory.gcd(x, y);
                x /= g;
                y /= g;

                this.x = x;
                this.y = y;
            }

            boolean eq(EConvexScore.Slope o) {
                return x == o.x && y == o.y;
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

    }

    static class NumberTheory {
        public static int gcd(int a, int b) {
            int c;
            while (a != 0) {
                c = a;
                a = b % a;
                b = c;
            }
            return b;
        }

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
                while (invFactorial.size() <= n) {
                    invFactorial.add(div(invFactorial.get(invFactorial.size() - 1), invFactorial.size()));
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
                return normalize(a + b);
            }

            public long subtract(long a, long b) {
                return normalize(a - b);
            }

            public long mult(long a, long b) {
                return normalize(a * b);
            }

            public long div(long a, long b) {
                return mult(a, inv(b));
            }

            public long pow(long x, int e) {
                if (e == 0)
                    return 1;
                if ((e & 1) > 0)
                    return mult(x, pow(x, e - 1));
                return pow(mult(x, x), e / 2);
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

        public static class ModM extends NumberTheory.Modulus<NumberTheory.ModM> {
            private final long modulus;

            public ModM(long modulus) {
                this.modulus = modulus;
            }

            public long modulus() {
                return modulus;
            }

        }

    }
}

