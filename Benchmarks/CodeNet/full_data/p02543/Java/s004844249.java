import java.io.InputStream;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) throws Exception {
        ExtendedScanner sc = new ExtendedScanner();
        FastPrintStream pw = new FastPrintStream();
        solve(sc, pw);
        sc.close();
        pw.flush();
        pw.close();
    }

    public static void solve(ExtendedScanner sc, FastPrintStream pw) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] x = sc.ints(n);
        int[] next = new int[n + 1];
        int[] prev = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int l = i, r = n;
            while (r - l > 1) {
                int m = (l + r) >> 1;
                if (x[m] < x[i] + k) l = m;
                else r = m;
            }
            next[i] = r;
            l = -1; r = i;
            while (r - l > 1) {
                int m = (l + r) >> 1;
                if (x[m] <= x[i] - k) l = m;
                else r = m;
            }
            prev[i] = l;
        }
        next[n] = n;
        Doubling nd = new Doubling(next, n);
        // Doubling pd = new Doubling(prev, n);
        int q = sc.nextInt();
        while (q --> 0) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt();
            int s = 0, t = r - l;
            while (t - s > 1) {
                int m = (s + t) >> 1;
                if (nd.query(l, m) >= r) {
                    t = m;
                } else {
                    s = m;
                }
            }
            int ans = 0;
            for (int i = l; i < r; i++) {
                int cnt = -1;
                int cur = i;
                while (cur < r) {
                    cur = next[cur];
                    cnt++;
                }
                cur = i;
                while (cur >= l) {
                    cur = prev[cur];
                    cnt++;
                }
                if (cnt == t) {
                    ans++;
                }
            }
            pw.println(ans);
        }
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class FastScanner implements AutoCloseable {
    private final java.io.InputStream in;
    private final byte[] buf = new byte[2048];
    private int ptr = 0;
    private int buflen = 0;

    public FastScanner(java.io.InputStream in) {
        this.in = in;
    }

    public FastScanner() {
        this(System.in);
    }

    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {
            buflen = in.read(buf);
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
        return buflen > 0;
    }

    private int readByte() {
        return hasNextByte() ? buf[ptr++] : -1;
    }

    public boolean hasNext() {
        while (hasNextByte() && !(32 < buf[ptr] && buf[ptr] < 127)) ptr++;
        return hasNextByte();
    }

    private StringBuilder nextSequence() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        for (int b = readByte(); 32 < b && b < 127; b = readByte()) {
            sb.appendCodePoint(b);
        }
        return sb;
    }

    public String next() {
        return nextSequence().toString();
    }

    public String next(int len) {
        return new String(nextChars(len));
    }

    public char nextChar() {
        if (!hasNextByte()) throw new java.util.NoSuchElementException();
        return (char) readByte();
    }

    public char[] nextChars() {
        StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (32 < b && b < 127 && i < len) {
            s[i++] = (char) b; b = readByte();
        }
        if (i != len) {
            throw new java.util.NoSuchElementException(
                String.format("Next token has smaller length than expected.", len)
            );
        }
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') {
                n = n * 10 + b - '0';
            } else if (b == -1 || !(32 < b && b < 127)) {
                return minus ? -n : n;
            } else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {
        return Math.toIntExact(nextLong());
    }
    public double nextDouble() {
        return Double.parseDouble(next());
    }
    public void close() {
        try {
            in.close();
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class ExtendedScanner extends FastScanner {
    public ExtendedScanner() {super();}
    public ExtendedScanner(InputStream in) {super(in);}
    public int[] ints(final int n) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> nextInt());
        return a;
    }
    public int[] ints(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> f.applyAsInt(nextInt()));
        return a;
    }
    public int[][] ints(final int n, final int m) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m));
        return a;
    }
    public int[][] ints(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m, f));
        return a;
    }
    public long[] longs(final int n) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> nextLong());
        return a;
    }
    public long[] longs(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> f.applyAsLong(nextLong()));
        return a;
    }
    public long[][] longs(final int n, final int m) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m));
        return a;
    }
    public long[][] longs(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m, f));
        return a;
    }
    public char[][] charArrays(final int n) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars());
        return c;
    }
    public char[][] charArrays(final int n, final int m) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars(m));
        return c;
    }
    public double[] doubles(final int n) {
        final double[] a = new double[n];
        Arrays.setAll(a, $ -> nextDouble());
        return a;
    }
    public double[][] doubles(final int n, final int m) {
        final double[][] a = new double[n][];
        Arrays.setAll(a, $ -> doubles(m));
        return a;
    }
    public String[] strings(final int n) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next());
        return s;
    }
    public String[] strings(final int n, final int m) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next(m));
        return s;
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class FastPrintStream implements AutoCloseable {
    private static final int BUF_SIZE = 1 << 15;
    private final byte[] buf = new byte[BUF_SIZE];
    private int ptr = 0;
    private final java.lang.reflect.Field strField;
    private final java.nio.charset.CharsetEncoder encoder;

    private java.io.OutputStream out;

    public FastPrintStream(java.io.OutputStream out) {
        this.out = out;
        java.lang.reflect.Field f;
        try {
            f = java.lang.String.class.getDeclaredField("value");
            f.setAccessible(true);
        } catch (NoSuchFieldException | SecurityException e) {
            f = null;
        }
        this.strField = f;
        this.encoder = java.nio.charset.StandardCharsets.US_ASCII.newEncoder();
    }

    public FastPrintStream(java.io.File file) throws java.io.IOException {
        this(new java.io.FileOutputStream(file));
    }

    public FastPrintStream(java.lang.String filename) throws java.io.IOException {
        this(new java.io.File(filename));
    }

    public FastPrintStream() {
        this(System.out);
        try {
            java.lang.reflect.Field f = java.io.PrintStream.class.getDeclaredField("autoFlush");
            f.setAccessible(true);
            f.set(System.out, false);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException e) {
            // ignore
        }
    }

    public FastPrintStream println() {
        if (ptr == BUF_SIZE) internalFlush();
        buf[ptr++] = (byte) '\n';
        return this;
    }

    public FastPrintStream println(java.lang.Object o) {
        return print(o).println();
    }

    public FastPrintStream println(java.lang.String s) {
        return print(s).println();
    }

    public FastPrintStream println(char[] s) {
        return print(s).println();
    }

    public FastPrintStream println(char c) {
        return print(c).println();
    }

    public FastPrintStream println(int x) {
        return print(x).println();
    }

    public FastPrintStream println(long x) {
        return print(x).println();
    }

    public FastPrintStream println(double d, int precision) {
        return print(d, precision).println();
    }

    private FastPrintStream print(byte[] bytes) {
        int n = bytes.length;
        if (ptr + n > BUF_SIZE) {
            internalFlush();
            try {
                out.write(bytes);
            } catch (java.io.IOException e) {
                throw new RuntimeException();
            }
        } else {
            System.arraycopy(bytes, 0, buf, ptr, n);
            ptr += n;
        }
        return this;
    }

    public FastPrintStream print(java.lang.Object o) {
        return print(o.toString());
    }

    public FastPrintStream print(java.lang.String s) {
        if (strField == null) {
            return print(s.getBytes());
        } else {
            try {
                Object value = strField.get(s);
                if (value instanceof byte[]) {
                    return print((byte[]) value);
                } else {
                    return print((char[]) value);
                }
            } catch (IllegalAccessException e) {
                return print(s.getBytes());
            }
        }
    }

    public FastPrintStream print(char[] s) {
        try {
            return print(encoder.encode(java.nio.CharBuffer.wrap(s)).array());
        } catch (java.nio.charset.CharacterCodingException e) {
            byte[] bytes = new byte[s.length];
            for (int i = 0; i < s.length; i++) {
                bytes[i] = (byte) s[i];
            }
            return print(bytes);
        }
    }

    public FastPrintStream print(char c) {
        if (ptr == BUF_SIZE) internalFlush();
        buf[ptr++] = (byte) c;
        return this;
    }

    public FastPrintStream print(int x) {
        if (x == 0) {
            if (ptr == BUF_SIZE) internalFlush();
            buf[ptr++] = '0';
            return this;
        }
        int d = len(x);
        if (ptr + d > BUF_SIZE) internalFlush();
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr += d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        return this;
    }

    public FastPrintStream print(long x) {
        if (x == 0) {
            if (ptr == BUF_SIZE) internalFlush();
            buf[ptr++] = '0';
            return this;
        }
        int d = len(x);
        if (ptr + d > BUF_SIZE) internalFlush();
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr += d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        return this;
    }

    public FastPrintStream print(double d, int precision) {
        if (d < 0) {
            print('-');
            d = -d;
        }
        d += Math.pow(10, -precision) / 2;
        print((long) d).print('.');
        d -= (long) d;
        for(int i = 0; i < precision; i++){
            d *= 10;
            print((int) d);
            d -= (int) d;
        }
        return this;
    }

    private void internalFlush() {
        try {
            out.write(buf, 0, ptr);
            ptr = 0;
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void flush() {
        try {
            out.write(buf, 0, ptr);
            out.flush();
            ptr = 0;
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            out.close();
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int len(int x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        int p = -10;
        for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
        return 10 + d;
    }

    private static int len(long x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        long p = -10;
        for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
        return 19 + d;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
@FunctionalInterface
interface IntBiPredicate {
    static final int INT_BIT = 32;
    static final long MASK = 0xffff_ffffl;
    public boolean test(int x, int y);
    default public IntPredicate curry(final int x) {return y -> test(x, y);}
    default public LongPredicate toLongPredicate() {return l -> test((int) (l >>> INT_BIT), (int) (l & MASK));}
    default public IntBiPredicate negate() {return (x, y) -> !test(x, y);}
    default public IntBiPredicate and(final IntBiPredicate other) {return (x, y) -> test(x, y) && other.test(x, y);}
    default public IntBiPredicate or(final IntBiPredicate other) {return (x, y) -> test(x, y) || other.test(x, y);}
    default public IntBiPredicate xor(final IntBiPredicate other) {return (x, y) -> test(x, y) ^ other.test(x, y);}
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class Longs {
    private Longs(){}
    public static long max(long a, long b) {
        return Math.max(a, b);
    }
    public static long max(long a, long b, long c) {
        return Math.max(Math.max(a, b), c);
    }
    public static long max(long a, long b, long c, long d) {
        return Math.max(Math.max(Math.max(a, b), c), d);
    }
    public static long max(long a, long b, long c, long d, long e) {
        return Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
    }
    public static long max(long a, long b, long c, long d, long e, long f) {
        return Math.max(Math.max(Math.max(Math.max(Math.max(a, b), c), d), e), f);
    }
    public static long max(long a, long b, long c, long d, long e, long f, long g) {
        return Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(a, b), c), d), e), f), g);
    }
    public static long max(long a, long b, long c, long d, long e, long f, long g, long h) {
        return Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(a, b), c), d), e), f), g), h);
    }
    public static long max(long a, long... vals) {
        long ret = a; for (long e : vals) ret = Math.max(ret, e);
        return ret;
    }
    public static long min(long a, long b) {
        return Math.min(a, b);
    }
    public static long min(long a, long b, long c) {
        return Math.min(Math.min(a, b), c);
    }
    public static long min(long a, long b, long c, long d) {
        return Math.min(Math.min(Math.min(a, b), c), d);
    }
    public static long min(long a, long b, long c, long d, long e) {
        return Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
    }
    public static long min(long a, long b, long c, long d, long e, long f) {
        return Math.min(Math.min(Math.min(Math.min(Math.min(a, b), c), d), e), f);
    }
    public static long min(long a, long b, long c, long d, long e, long f, long g) {
        return Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(a, b), c), d), e), f), g);
    }
    public static long min(long a, long b, long c, long d, long e, long f, long g, long h) {
        return Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(a, b), c), d), e), f), g), h);
    }
    public static long min(long a, long... vals) {
        long ret = a; for (long e : vals) ret = Math.min(ret, e);
        return ret;
    }
    public static long fold(final LongBinaryOperator func, final long... a) {
        long ret = a[0]; for (int i = 1; i < a.length; i++) ret = func.applyAsLong(ret, a[i]);
        return ret;
    }
    public static boolean isPowerOfTwo(final long n) {return n != 0 && (-n & n) == n;}
    public static int ceilExponent(final long n) {return 63 - Long.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);}
    public static int floorExponent(final long n) {return 63 - Long.numberOfLeadingZeros(n) + (n == 0 ? 1 : 0);}
    public static int ceilExponent(final long n, final int base) {
        if (base == 2) return ceilExponent(n);
        int i = 0;
        long m = 1;
        while (m < n) {
            i++;
            final long r = m * base;
            if ((m | base) >> 31 != 0 && r / base != m) break;
            m = r;
        }
        return i;
    }
    /**
     * Caluculate the ceil of a/b. Returns the smallest integer greater than or
     * equal to a/b while 'a/b' rounds fractional parts to ZERO.
     * @param a
     * @param b
     * @return the smallest integer greater than or equal to a/b
     */
    public static long cld(final long a, final long b) {
        if (a > 0 && b > 0) return (a + b - 1) / b;
        if (a < 0 && b < 0) return (a + b + 1) / b;
        return a / b;
    }

    /**
     * Caluculate the floor of a/b. Returns the largest integer less than or equal
     * to a/b while 'a/b' rounds fractional parts to ZERO.
     * @param a
     * @param b
     * @return the largest integer less than or equal to a/b
     */
    public static long fld(final long a, final long b) {
        if (a <= 0 && b > 0) return (a - b + 1) / b;
        if (a > 0 && b <= 0) return (a - b - 1) / b;
        return a / b;
    }
    public static String join(final String sep, final long... a) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
final class Doubling {
    private final int[][] doubling;
    private final int height;
    private final int n;
    public Doubling(final int[] a, final long maxStep) {
        this.n = a.length;
        this.height = Longs.ceilExponent(maxStep) + 2;
        this.doubling = new int[height][n];
        build(a);
    }
    public int getHeight() {return height;}
    public int query(int i, long step) {
        int h = height - 1;
        while (step > 0) {
            if ((step & (1l << h)) != 0) {
                i = doubling[h][i];
                step ^= 1l << h;
            }
            h--;
        }
        return i;
    }
    public int stepWhile(int i, final IntPredicate p) {
        int h = height - 1;
        while (h >= 0) {
            if (p.test(doubling[h][i])) i = doubling[h][i];
            h--;
        }
        return i;
    }
    public int stepUntil(final int i, final IntPredicate p) {return p.test(i) ? i : doubling[0][stepWhile(i, p.negate())];}
    public int[] biStep(final int u, final int v, final int exponent) {
        final int us = doubling[exponent][u];
        final int vs = doubling[exponent][v];
        return new int[]{us, vs};
    }
    private long biStep(final long uv, final int exponent) {
        final int u = (int) (uv >>> 32);
        final int v = (int) (uv & 0xffff_ffffl);
        return (long) doubling[exponent][u] << 32 | doubling[exponent][v];
    }
    public int[] biStepWhile(final int u, final int v, final IntBiPredicate p) {
        final long ret = biStepWhile((long) u << 32 | v, p.toLongPredicate());
        return new int[]{(int) (ret >> 32), (int) (ret & 0xffff_ffffl)};
    }
    private long biStepWhile(long uv, final LongPredicate p) {
        int h = height - 1;
        while (h >= 0) {
            final long step = biStep(uv, h);
            if (p.test(step)) {
                uv = step;
            }
            h--;
        }
        return uv;
    }
    public int[] biStepUntil(final int u, final int v, final IntBiPredicate p) {
        final long ret = biStepUntil((long) u << 32 | v, p.toLongPredicate());
        return new int[]{(int) (ret >> 32), (int) (ret & 0xffff_ffffl)};
    }
    private long biStepUntil(final long uv, final LongPredicate p) {return p.test(uv) ? uv : biStep(biStepWhile(uv, p.negate()), 0);}
    public int[] parallelStep(final int[] a, final int exponent) {
        final int[] ret = a.clone();
        for (int i = 0; i < a.length; i++) ret[i] = doubling[exponent][a[i]];
        return ret;
    }
    private void build(final int[] a) {
        doubling[0] = a;
        for (int h = 1; h < height; h++) for (int i = 0; i < n; i++) doubling[h][i] = doubling[h - 1][doubling[h - 1][i]];
    }
}
