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
        ENoNeed solver = new ENoNeed();
        solver.solve(1, in, out);
        out.close();
    }

    static class ENoNeed {
        NumberTheory.Mod998 mod = new NumberTheory.Mod998();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = in.readIntArray(n);
            Polynomial<NumberTheory.Mod998>[] polys = new Polynomial[n];
            for (int i = 0; i < n; i++) {
                polys[i] = new Polynomial<>(k, mod);
                polys[i].coeff[0] = 1;
                if (a[i] < k)
                    polys[i].coeff[a[i]] = 1;
            }
            SegmentTree.Combiner<Polynomial<NumberTheory.Mod998>> combiner = (x, y) -> {
                Polynomial<NumberTheory.Mod998> result = x.multFFT(y).truncateDegree(k);
                for (int i = 0; i < result.coeff.length; i++) {
                    result.coeff[i] = result.coeff[i] > 0 ? 1 : 0;
                }
                return result;
            };

            Polynomial<NumberTheory.Mod998> one = new Polynomial<>(k, mod);
            one.coeff[0] = 1;

            Polynomial<NumberTheory.Mod998>[] prefix = new Polynomial[n + 1];
            prefix[0] = one;
            for (int i = 0; i < n; i++) {
                prefix[i + 1] = combiner.combine(prefix[i], polys[i]);
            }

            Polynomial<NumberTheory.Mod998>[] suffix = new Polynomial[n + 1];
            suffix[n] = one;
            for (int i = n; i > 0; i--) {
                suffix[i - 1] = combiner.combine(suffix[i], polys[i - 1]);
            }

            int answer = n;
            for (int i = 0; i < n; i++) {
                if (a[i] >= k) {
                    answer--;
                    continue;
                }

                Polynomial<NumberTheory.Mod998> other = combiner.combine(prefix[i], suffix[i + 1]);
                for (int j = k - a[i]; j < k; j++) {
                    if (other.coeff[j] > 0) {
                        answer--;
                        break;
                    }
                }
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

        public int[] readIntArray(int n) {
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = nextInt();
            }
            return x;
        }

    }

    static class SegmentTree<T> {
        public int size;
        public T[] value;
        private final SegmentTree.Combiner<T> combiner;
        private final T identityElement;

        public SegmentTree(int size, SegmentTree.Combiner<T> combiner, T identityElement) {
            this.size = size;
            value = (T[]) new Object[2 * size];
            Arrays.fill(value, identityElement);
            this.combiner = combiner;
            this.identityElement = identityElement;
        }

        public interface Combiner<T> {
            T combine(T a, T b);

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

        public Polynomial<M> truncateDegree(int newDegree) {
            if (newDegree >= n)
                return this;
            long[] result = new long[newDegree + 1];
            System.arraycopy(this.coeff, 0, result, 0, result.length);
            return m.create(result);
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

        private Util() {
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

    }
}

