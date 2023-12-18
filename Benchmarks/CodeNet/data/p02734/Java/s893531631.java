import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.function.BiFunction;
import java.io.BufferedOutputStream;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BinaryOperator;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        FKnapsackForAllSegments solver = new FKnapsackForAllSegments();
        solver.solve(1, in, out);
        out.close();
    }

    static class FKnapsackForAllSegments {
        private static final int MOD = (int) 1e9 + 7;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            // out.setCaseLabel(LightWriter.CaseLabel.NONE);
            int n = in.ints(), s = in.ints();
            long[][] a = new long[n][3001];
            for (int i = 0; i < n; i++) a[i][0] = a[i][in.ints()] = 1;
            SparseTable<long[]> table = new SparseTable<>(
                    a,
                    (x, y) -> {
                        long[] r = Arrays.copyOf(FFT.convolve(x, y), 3001);
                        for (int i = 0; i <= 3000; i++) r[i] %= MOD;
                        return r;
                    }
            );
            long ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    ans += table.query(i, j)[s];
                    ans %= MOD;
                }
            }
            out.ans(ans).ln();
        }

    }

    static class Reflection {
        public static <T> Class<? extends T> getComponentClass(T[] a) {
            return (Class<? extends T>) a.getClass().getComponentType();
        }

        public static <T> Class<? extends T> getClass(T t) {
            return (Class<? extends T>) t.getClass();
        }

        public static <T> T[] newInstance(Class<T> clazz, int length) {
            return (T[]) Array.newInstance(clazz, length);
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new OutputStreamWriter(new BufferedOutputStream(out), Charset.defaultCharset()));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static final class BitMath {
        private BitMath() {
        }

        public static int count(int v) {
            return Integer.bitCount(v);
        }

        public static int msb(int v) {
            if (v == 0) {
                throw new IllegalArgumentException("Bit not found");
            }
            v |= (v >> 1);
            v |= (v >> 2);
            v |= (v >> 4);
            v |= (v >> 8);
            v |= (v >> 16);
            return count(v) - 1;
        }

    }

    static class FFT {
        public static void fft(double[] a, double[] b, boolean invert) {
            int count = a.length;
            for (int i = 1, j = 0; i < count; i++) {
                int bit = count >> 1;
                for (; j >= bit; bit >>= 1) j -= bit;
                j += bit;
                if (i < j) {
                    ArrayUtil.swap(a, i, j);
                    ArrayUtil.swap(b, i, j);
                }
            }
            for (int len = 2; len <= count; len <<= 1) {
                int halfLen = len >> 1;
                double angle = 2 * Math.PI / len;
                if (invert) angle = -angle;
                double wLenA = Math.cos(angle);
                double wLenB = Math.sin(angle);
                for (int i = 0; i < count; i += len) {
                    double wA = 1;
                    double wB = 0;
                    for (int j = 0; j < halfLen; j++) {
                        double uA = a[i + j];
                        double uB = b[i + j];
                        double vA = a[i + j + halfLen] * wA - b[i + j + halfLen] * wB;
                        double vB = a[i + j + halfLen] * wB + b[i + j + halfLen] * wA;
                        a[i + j] = uA + vA;
                        b[i + j] = uB + vB;
                        a[i + j + halfLen] = uA - vA;
                        b[i + j + halfLen] = uB - vB;
                        double nextWA = wA * wLenA - wB * wLenB;
                        wB = wA * wLenB + wB * wLenA;
                        wA = nextWA;
                    }
                }
            }
            if (invert) {
                for (int i = 0; i < count; i++) {
                    a[i] /= count;
                    b[i] /= count;
                }
            }
        }

        public static long[] convolve(long[] a, long[] b) {
            int len = Math.max(Integer.highestOneBit(Math.max(a.length, b.length) - 1) << 2, 1);
            double[] aRe = new double[len], aIm = new double[len];
            double[] bRe = new double[len], bIm = new double[len];
            for (int i = 0; i < a.length; i++) aRe[i] = a[i];
            fft(aRe, aIm, false);
            for (int i = 0; i < b.length; i++) bRe[i] = b[i];
            fft(bRe, bIm, false);

            for (int i = 0; i < len; i++) {
                double real = aRe[i] * bRe[i] - aIm[i] * bIm[i];
                aIm[i] = aIm[i] * bRe[i] + bIm[i] * aRe[i];
                aRe[i] = real;
            }
            fft(aRe, aIm, true);

            long[] result = new long[len];
            for (int i = 0; i < len; i++) result[i] = Math.round(aRe[i]);
            return result;
        }

    }

    static class SparseTable<T> {
        private final int n;
        private final BinaryOperator<T> f;
        private final T[][] table;

        public SparseTable(T[] a, BinaryOperator<T> f) {
            this.n = a.length;
            this.f = f;
            this.table = Reflection.newInstance(Reflection.getClass(a), 30);
            table[0] = a.clone();
            for (int i = 1; (1 << i) < n; i++) {
                table[i] = Reflection.newInstance(Reflection.getComponentClass(a), n);
                int r = 1 << i, d = r + r;
                for (int j = r - 1; j < n; j += d) {
                    table[i][j] = a[j];
                    for (int k = 1; k < r; k++)
                        table[i][j - k] = f.apply(a[j - k], table[i][j - k + 1]);
                }
                for (int j = r; j < n; j += d) {
                    table[i][j] = a[j];
                    for (int k = j + 1; k < j + r && k < n; k++)
                        table[i][k] = f.apply(a[k], table[i][k - 1]);
                }
            }
        }

        public T query(int l, int r) {
            if (r <= l || l < 0 || n < r) throw new RuntimeException();
            if (l == --r) return table[0][l];
            int k = BitMath.msb(l ^ r);
            return f.apply(table[k][l], table[k][r]);
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void swap(double[] a, int x, int y) {
            double t = a[x];
            a[x] = a[y];
            a[y] = t;
        }

    }

    static class LightScanner implements AutoCloseable {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }
}

