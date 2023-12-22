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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DAnythingGoesToZero solver = new DAnythingGoesToZero();
        solver.solve(1, in, out);
        out.close();
    }

    static class DAnythingGoesToZero {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] x = in.readBitString();

            int popcountPlus1 = 0;
            for (int i : x)
                popcountPlus1 += i;
            int popcountMinus1 = popcountPlus1 - 1;
            popcountPlus1++;
            if (popcountMinus1 <= 0)
                popcountMinus1 = Integer.MAX_VALUE;

            int valPlus = 0;
            int valMinus = 0;
            for (int i : x) {
                valPlus *= 2;
                valPlus += i;
                valPlus %= popcountPlus1;
            }
            if (popcountMinus1 != Integer.MAX_VALUE)
                for (int i : x) {
                    valMinus *= 2;
                    valMinus += i;
                    valMinus %= popcountMinus1;
                }
            else
                valMinus = -1;

            NumberTheory.ModM modPlus = new NumberTheory.ModM(popcountPlus1);
            NumberTheory.ModM modMinus = new NumberTheory.ModM(popcountMinus1);

            for (int i = 0; i < x.length; i++) {
                if (x[i] == 1 && popcountMinus1 == Integer.MAX_VALUE) {
                    out.println(0);
                    continue;
                }

                int v = x[i] == 1 ? (int) modMinus.subtract(valMinus, modMinus.pow(2, n - i - 1))
                                  : (int) modPlus.add(valPlus, modPlus.pow(2, n - i - 1));

                out.println(1 + f(v));
            }
        }

        private static int f(int v) {
            int r = 0;
            while (v > 0) {
                v = v % Integer.bitCount(v);
                r++;
            }
            return r;
        }

    }

    static class NumberTheory {
        private static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
        }

        public abstract static class Modulus<M extends NumberTheory.Modulus<M>> {
            final ArrayList<Long> factorial = new ArrayList<>();
            final ArrayList<Long> invFactorial = new ArrayList<>();

            public abstract long modulus();

            public Modulus() {
                super();
                factorial.add(1L);
                invFactorial.add(1L);
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

            public long pow(long x, int e) {
                if (e < 0) {
                    x = inv(x);
                    e *= -1;
                }
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

    static class InputReader {
        public final BufferedReader reader;
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

        public int[] readBitString() {
            char[] chars = next().toCharArray();
            int[] x = new int[chars.length];
            for (int i = 0; i < x.length; i++) {
                x[i] = chars[i] - '0';
            }
            return x;
        }

    }
}

