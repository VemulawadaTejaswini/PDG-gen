import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        EHandshake solver = new EHandshake();
        solver.solve(1, in, out);
        out.close();
    }

    static class EHandshake {
        private static final int MAX = 100_000;
        NumberTheory.Modulus[] mods = {new NumberTheory.Mod998(), new NumberTheory.SpecialMod469()};

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long m = in.nextLong();
            int[] a = in.readIntArray(n);

            Polynomial[] people = new Polynomial[mods.length];
            Polynomial[] handshakes = new Polynomial[mods.length];
            for (int i = 0; i < mods.length; i++) {
                people[i] = new Polynomial(MAX, mods[i]);
                for (int x : a) {
                    people[i].coeff[x]++;
                }
                handshakes[i] = people[i].powFFT(2);
            }

            long[][] coeffs = new long[2 * MAX + 1][mods.length];
            for (int i = 0; i <= 2 * MAX; i++) {
                for (int j = 0; j < mods.length; j++) {
                    coeffs[i][j] = handshakes[j].coeff[i];
                }
            }
            long[] coeff = NumberTheory.crt(mods, coeffs);

            long answer = 0;
            for (int i = 2 * MAX; i >= 0; i--) {
                long num = Math.min(m, coeff[i]);
                m -= num;
                answer += num * i;
            }

            out.println(answer);
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

        public int[] readIntArray(int n) {
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = nextInt();
            }
            return x;
        }

    }

    static class Polynomial<M extends NumberTheory.Modulus<M>> {
        public final long[] coeff;
        public final int n;
        public final M m;

        public Polynomial(int degree, M modulus, long... coeff) {
            m = modulus;
            n = degree;
            this.coeff = new long[n + 1];
            for (int i = 0; i < Math.min(this.coeff.length, coeff.length); i++) {
                this.coeff[i] = coeff[i];
            }
        }

        public Polynomial(M modulus, long... coeff) {
            m = modulus;
            n = coeff.length - 1;
            this.coeff = new long[n + 1];
            for (int i = 0; i <= n; i++) {
                this.coeff[i] = coeff[i];
            }
        }

        public Polynomial<M> mult(Polynomial<M> other) {
            long[] result = new long[n + other.n + 1];
            long threshold = Long.MAX_VALUE - m.modulus() * m.modulus();
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= other.n; j++) {
                    result[i + j] += coeff[i] * other.coeff[j];
                    if (result[i + j] >= threshold) {
                        result[i + j] %= m.modulus();
                    }
                }
            }
            for (int i = 0; i < result.length; i++) {
                result[i] %= m.modulus();
            }
            return m.create(result);
        }

        public Polynomial<M> powFFT(int e) {
            if (e == 0)
                return m.create(new long[]{1});
            if (e == 1)
                return this;
            if ((e & 1) > 0)
                return this.multFFT(this.powFFT(e - 1));
            Polynomial<M> half = this.powFFT(e / 2);
            return half.multFFT(half);
        }

        public Polynomial<M> multFFT(Polynomial<M> other) {
            if (Math.min(n, other.n) < 100) {
                return this.mult(other);
            }

            int resultDegree = n + other.n;
            int resultLength = resultDegree + 1;
            int resultLengthBig = Integer.highestOneBit(resultLength);
            if (resultLengthBig == resultLength)
                resultLengthBig *= 2;
            resultLengthBig *= 2;
            int resultDegreeBig = resultLengthBig - 1;

            boolean eq = Arrays.equals(coeff, other.coeff);
            Polynomial<M> a = new Polynomial<>(resultDegreeBig, m, coeff);
            a.inPlaceFFT(false);
            if (!eq) {
                Polynomial<M> b = new Polynomial<>(resultDegreeBig, m, other.coeff);
                b.inPlaceFFT(false);
                for (int i = 0; i < a.coeff.length; i++) {
                    a.coeff[i] = m.mult(a.coeff[i], b.coeff[i]);
                }
            } else {
                for (int i = 0; i < a.coeff.length; i++) {
                    a.coeff[i] = m.mult(a.coeff[i], a.coeff[i]);
                }
            }
            a.inPlaceFFT(true);
            return new Polynomial<>(resultDegree, m, a.coeff);
        }

        public void inPlaceFFT(boolean inverse) {
            Util.ASSERT(Integer.bitCount(n + 1) == 1);

            for (int i = 1, j = 0; i < n + 1; i++) {
                for (int k = (n + 1) >> 1; (j ^= k) < k; k >>= 1)
                    ;

                if (i < j)
                    Util.swap(coeff, i, j);
            }

            for (int l = 1; l < n + 1; l <<= 1) {
                long[] unityRoots = new long[2 * l + 1];
                unityRoots[0] = 1;
                unityRoots[1] = m.unityRoot(2 * l);
                for (int i = 2; i < unityRoots.length; i++) {
                    unityRoots[i] = m.mult(unityRoots[i - 1], unityRoots[1]);
                }
                for (int i = 0; i < n + 1; i += 2 * l) {
                    for (int j = 0; j < l; j++) {
                        int wIndex = inverse ? 2 * l - j : j;
                        long w = unityRoots[wIndex];
                        long u = coeff[i + j];
                        long v = m.mult(coeff[i + j + l], w);
                        coeff[i + j] = m.add(u, v);
                        coeff[i + j + l] = m.subtract(u, v);
                    }
                }
            }

            if (inverse) {
                long nInv = m.inv(n + 1);
                for (int i = 0; i < n + 1; i++) {
                    coeff[i] = m.mult(coeff[i], nInv);
                }
            }
        }

        public String toString() {
            return Arrays.toString(coeff);
        }

    }

    static class Util {
        public static void swap(long[] x, int i, int j) {
            long t = x[i];
            x[i] = x[j];
            x[j] = t;
        }

        public static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
        }

    }

    static class NumberTheory {
        public static long[] crt(NumberTheory.Modulus[] mods, long[][] residues) {
            Util.ASSERT(mods.length == residues[0].length);
            final int m = mods.length;

            long[] result = new long[residues.length];
            long[][] inverses = new long[m][m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (i == j)
                        continue;
                    inverses[i][j] = mods[i].inv(mods[i].normalize(mods[j].modulus()));
                }
            }
            for (int k = 0; k < residues.length; k++) {
                long[] x = new long[m];
                for (int i = 0; i < m; i++) {
                    x[i] = residues[k][i];
                    for (int j = 0; j < i; j++) {
                        x[i] = mods[i].mult(mods[i].subtract(x[i], x[j]), inverses[i][j]);
                    }
                }

                long v = 0;
                for (int i = m - 1; i >= 0; i--) {
                    v = mods[i].modulus() * v + x[i];
                }
                result[k] = v;
            }

            return result;
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

            public long pow(long x, long e) {
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

            public Polynomial<M> create(long... coeff) {
                return new Polynomial(this, coeff);
            }

            public long totient() {
                throw new UnsupportedOperationException("need to implement this");
            }

            public long generator() {
                throw new UnsupportedOperationException("need to implement this");
            }

            public long unityRoot(int degree) {
                ASSERT(totient() % degree == 0);
                return pow(generator(), totient() / degree);
            }

        }

        public static class Mod998 extends NumberTheory.Modulus<NumberTheory.Mod998> {
            public long modulus() {
                return 998_244_353L;
            }

            public long totient() {
                return modulus() - 1;
            }

            public long generator() {
                return 3;
            }

        }

        public static class SpecialMod469 extends NumberTheory.Modulus<NumberTheory.SpecialMod469> {
            public long modulus() {
                return 469762049;
            }

            public long totient() {
                return modulus() - 1;
            }

            public long generator() {
                return 3;
            }

        }

    }
}

