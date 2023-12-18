import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.function.BiFunction;
import java.io.BufferedOutputStream;
import java.nio.charset.Charset;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.util.function.BinaryOperator;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.io.Writer;
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
        LightScanner2 in = new LightScanner2(inputStream);
        LightWriter out = new LightWriter(outputStream);
        FKnapsackForAllSegments solver = new FKnapsackForAllSegments();
        solver.solve(1, in, out);
        out.close();
    }

    static class FKnapsackForAllSegments {
        private static final int MOD = (int) 1e9 + 7;

        public void solve(int testNumber, LightScanner2 in, LightWriter out) {
            int n = in.ints(), s = in.ints();
            long[][] a = new long[n][s + 1];
            for (int i = 0; i < n; i++) {
                a[i][0] = 1;
                int x = in.ints();
                if (x <= s) a[i][x] = 1;
            }
            NTT ntt = new NTT();
            SparseTable<long[]> table = new SparseTable<>(
                    a,
                    (x, y) -> Arrays.copyOf(ntt.convolve(x, y), s + 1)
            );
            if (true) return;
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

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void swap(long[] a, int x, int y) {
            long t = a[x];
            a[x] = a[y];
            a[y] = t;
        }

    }

    static class LightScanner2 extends LightScannerAdapter {
        private static final int BUF_SIZE = 32 * 1024;
        private final InputStream stream;
        private final byte[] buf = new byte[BUF_SIZE];
        private int ptr;
        private int len;

        public LightScanner2(InputStream stream) {
            this.stream = stream;
        }

        private int read() {
            if (ptr < len) return buf[ptr++];
            try {
                ptr = 0;
                len = stream.read(buf);
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            if (len == -1) return -1;
            return buf[ptr++];
        }

        private void skip() {
            while (isTokenSeparator(read())) ;
            ptr--;
        }

        public int ints() {
            skip();
            int b = read();
            boolean negate;
            if (b == '-') {
                negate = true;
                b = read();
            } else negate = false;
            int x = 0;
            for (; !isTokenSeparator(b); b = read()) {
                if ('0' <= b && b <= '9') x = x * 10 + b - '0';
                else throw new NumberFormatException("Unexpected character '" + b + "'");
            }
            return negate ? -x : x;
        }

        public void close() {
            try {
                stream.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        private static boolean isTokenSeparator(int b) {
            return b < 33 || 126 < b;
        }

    }

    static class Vec3i implements Comparable<Vec3i> {
        public int x;
        public int y;
        public int z;

        public Vec3i(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec3i vec3i = (Vec3i) o;
            return x == vec3i.x &&
                    y == vec3i.y &&
                    z == vec3i.z;
        }

        public int hashCode() {
            return Objects.hash(x, y, z);
        }

        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }

        public int compareTo(Vec3i o) {
            if (x == o.x) {
                if (y == o.y) {
                    return Integer.compare(z, o.z);
                }
                return Integer.compare(y, o.z);
            }
            return Integer.compare(x, o.x);
        }

    }

    static interface Verified {
    }

    static abstract class LightScannerAdapter implements AutoCloseable {
        public abstract void close();

    }

    static class ModMath {
        private static final int DEFAULT_MOD = 1_000_000_007;
        private final long mod;

        public ModMath(long mod, boolean unsafe) {
        /*if (!unsafe && !IntMath.isPrime(mod)) {
            throw new RuntimeException("This class is designed for primes!");
        }*/
            this.mod = mod;
        }

        public ModMath(long mod) {
            this(mod, false);
        }

        public ModMath() {
            this(DEFAULT_MOD, true);
        }

        public long mod(long x) {
            x %= mod;
            return x < 0 ? x + mod : x;
        }

        public long inv(long x) {
            //return pow(x, mod - 2);
            return mod(LongEuclidSolver.solve(x, mod).x);
        }

        public long pow(long x, long y) {
            y %= (mod - 1);
            if (y < 0) {
                return pow(inv(x), -y);
            } else if (y == 0) {
                return 1;
            } else if (y % 2 == 0) {
                long z = pow(x, y / 2);
                return (z * z) % mod;
            } else {
                return (x % mod) * pow(x, y - 1) % mod;
            }
        }

    }

    static class Vec3l implements Comparable<Vec3l> {
        public long x;
        public long y;
        public long z;

        public Vec3l(long x, long y, long z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec3i vec3i = (Vec3i) o;
            return x == vec3i.x &&
                    y == vec3i.y &&
                    z == vec3i.z;
        }

        public int hashCode() {
            return Objects.hash(x, y, z);
        }

        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }

        public int compareTo(Vec3l o) {
            if (x == o.x) {
                if (y == o.y) {
                    return Long.compare(z, o.z);
                }
                return Long.compare(y, o.z);
            }
            return Long.compare(x, o.x);
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

    static class NTT {
        private static final int DEFAULT_MOD = 998_244_353;
        private static final int DEFAULT_G = 3;
        private final ModMath mm;
        private final int mod;
        private final int g;

        private NTT(int mod, int g) {
            this.mm = new ModMath(mod);
            this.mod = mod;
            this.g = g;
        }

        public NTT() {
            this.mod = DEFAULT_MOD;
            this.g = DEFAULT_G;
            this.mm = new ModMath(DEFAULT_MOD);
        }

        public void fft(long[] a, boolean invert) {
            int count = a.length;
            long base = invert ? mm.inv(g) : g;
            for (int i = 0, j = 1; j < count; j++) {
                int k = count >> 1;
                for (; i >= k; k >>= 1) i -= k;
                i += k;
                if (j < i) ArrayUtil.swap(a, j, i);
            }
            int exp = mod - 1;
            for (int len = 2; len <= count; len <<= 1) {
                int halfLen = len >> 1;
                exp >>= 1;
                long angle = mm.pow(base, exp);
                long w = 1;
                for (int i = 0; i < halfLen; i++) {
                    for (int j1 = i, j2 = i + halfLen; j1 < count; j1 += len, j2 += len) {
                        long u = a[j1], v = w * a[j2] % mod;
                        a[j1] = u + v;
                        if (a[j1] >= mod) a[j1] -= mod;
                        a[j2] = u - v;
                        if (a[j2] < 0) a[j2] += mod;
                    }
                    w = w * angle % mod;
                }
            }
            if (invert) {
                long inv = mm.inv(count);
                for (int i = 0; i < count; i++) a[i] = a[i] * inv % mod;
            }
        }

        public long[] convolve(long[] aRaw, long[] bRaw) {
            int len = 1 << (32 - Integer.numberOfLeadingZeros(aRaw.length + bRaw.length - 2));
            long[] a = Arrays.copyOf(aRaw, len), b = Arrays.copyOf(bRaw, len);
            fft(a, false);
            fft(b, false);
            for (int i = 0; i < len; i++) a[i] = a[i] * b[i] % mod;
            fft(a, true);
            return a;
        }

    }

    static class LongEuclidSolver {
        private LongEuclidSolver() {
        }

        public static Vec3l solve(long a, long b) {
            LongEuclidSolver.ReferenceLong p = new LongEuclidSolver.ReferenceLong(), q = new LongEuclidSolver.ReferenceLong();
            long d = solve(a, b, p, q);
            return new Vec3l(p.val, q.val, d);
        }

        private static long solve(long a, long b, LongEuclidSolver.ReferenceLong p, LongEuclidSolver.ReferenceLong q) {
            if (b == 0) {
                p.val = 1;
                q.val = 0;
                return a;
            } else {
                long d = solve(b, a % b, q, p);
                q.val -= (a / b) * p.val;
                return d;
            }
        }

        private static class ReferenceLong {
            private long val;

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
                        table[i][k] = f.apply(table[i][k - 1], a[k]);
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
}

