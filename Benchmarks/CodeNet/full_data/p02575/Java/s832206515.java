import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) throws Exception {
        Field f = System.out.getClass().getDeclaredField("autoFlush");
        f.setAccessible(true);
        f.set(System.out, false);
        execute(System.in, System.out);
    }

    public static void execute(InputStream in, OutputStream out) {
        ExtendedScanner s = new ExtendedScanner(in);
        Out o = new Out(out);
        solve(s, o);
        o.flush();
        o.close();
    }

    public static void solve(ExtendedScanner sc, Out out) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[] a = new int[h];
        int[] b = new int[h];
        for (int i = 0; i < h; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt();
        }
        IntDualSegmentTree t = new IntDualSegmentTree(w, 0, -1, (u, v) -> v, (u, v) -> v);
        int[] x = new int[w];
        Arrays.setAll(x, i -> i);
        t.build(x);
        for (int k = 0; k < h; k++) {
            int l = -1, r = w;
            while (r - l > 1) {
                int m = (l + r) >> 1;
                if (t.get(m) < a[k]) l = m;
                else r = m;
            }
            int lft = r;
            l = -1; r = w;
            while (r - l > 1) {
                int m = (l + r) >> 1;
                if (t.get(m) >= b[k]) r = m;
                else l = m;
            }
            int rgt = r;
            t.apply(lft, rgt, b[k]);
            if (t.get(0) == w) {
                out.writeln(-1);
                return;
            }
            l = -1; r = w;
            while (r - l > 2) {
                int m1 = l + (r - l) / 3;
                int m2 = r - (r - l) / 3;
                if (t.get(m1) - m1 - (t.get(m2) - m2) < 0) {
                    l = m1;
                } else {
                    r = m2;
                }
            }
            int m = (l + r) >> 1;
            int vl = t.get(l) - l + k;
            int vm = t.get(m) - m + k;
            int vr = t.get(r) - r + k;
            out.writeln(Ints.min(vl, vm, vr) + 1);
        }
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class BasicScanner {
    private final InputStream in;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public BasicScanner(InputStream in) {this.in = in;}
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buf);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    private StringBuilder nextSequence() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb;
    }
    public char nextChar() {
        return (char) readByte();
    }
    public String next() {
        return nextSequence().toString();
    }
    public String next(int len) {
        return new String(nextChars(len));
    }
    public char[] nextChars() {
        final StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
        if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class Out {
    private final OutputStream out;
    private byte[] buf = new byte[1024];
    private int ptr = 0;
    private static final int AUTO_FLUSH_THRETHOLD = 1 << 17;

    public Out(OutputStream out) {
        this.out = out;
    }

    public void flush() {
        try {
            out.write(buf, 0, ptr);
            out.flush();
            ptr = 0;
        } catch (IOException e) {e.printStackTrace();}
    }

    public void close() {
        try {out.close();} catch (IOException e) {e.printStackTrace();}
    }

    public Out writeln() {return write('\n');}
    public Out writeln(Object o) {return write(o).write('\n');}
    public Out writeln(String s) {return write(s).write('\n');}
    public Out writeln(char[] c) {return write(c).write('\n');}
    public Out writeln(char   c) {return write(c).write('\n');}
    public Out writeln(byte   b) {return write(b).write('\n');}
    public Out writeln(int    x) {return write(x).write('\n');}
    public Out writeln(long   x) {return write(x).write('\n');}
    public Out writeln(double d) {return write(d).write('\n');}

    public Out writeSpace() {return write(' ');}
    
    public Out write(Object o) {
        return write(o.toString());
    }

    public Out write(String s) {
        try {
            Field strValueField = s.getClass().getDeclaredField("value");
            strValueField.setAccessible(true);
            byte[] b = (byte[]) strValueField.get(s);
            int l = s.length();
            if (l > AUTO_FLUSH_THRETHOLD) {
                flush();
                int i = 0;
                while (i + AUTO_FLUSH_THRETHOLD < l) {
                    out.write(b, i, AUTO_FLUSH_THRETHOLD);
                    out.flush();
                    i += AUTO_FLUSH_THRETHOLD;
                }
                ensureCapacity(l - i);
                System.arraycopy(b, i, buf, 0, l - i);
                ptr = l - i;
            } else {
                ensureCapacity(ptr + l);
                System.arraycopy(b, 0, buf, ptr, l);
                ptr += l;
            }
        } catch (Exception e) {e.printStackTrace();}
        return this;
    }

    public Out write(char[] c) {
        int l = c.length;
        if (l > AUTO_FLUSH_THRETHOLD) {
            flush();
            ensureCapacity(AUTO_FLUSH_THRETHOLD);
            int i = 0;
            while (i + AUTO_FLUSH_THRETHOLD < l) {
                for (int j = 0; j < AUTO_FLUSH_THRETHOLD; j++) {
                    buf[ptr++] = (byte) c[i + j];
                }
                flush();
                i += AUTO_FLUSH_THRETHOLD;
            }
            for (; i < l; i++) {
                buf[ptr++] = (byte) c[i];
            }
        } else {
            ensureCapacity(ptr + l);
            for (char ch : c) buf[ptr++] = (byte) ch;
        }
        return this;
    }

    public Out write(char c) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = (byte) c;
        return this;
    }

    public Out write(byte b) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = b;
        return this;
    }

    public Out write(int x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(long x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(double d) {
        return write(Double.toString(d));
    }

    private void ensureCapacity(int cap) {
        if (cap > AUTO_FLUSH_THRETHOLD) {
            flush();
        }
        if (cap >= buf.length) {
            int newLength = buf.length;
            while (newLength < cap) newLength <<= 1;
            byte[] newBuf = new byte[newLength];
            System.arraycopy(buf, 0, newBuf, 0, buf.length);
            buf = newBuf;
        }
    }
    private static int stringSize(long x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        long p = -10;
        for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
        return 19 + d;
    }
    private static int stringSize(int x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        int p = -10;
        for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
        return 10 + d;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class Ints {
    private Ints(){}
    public static int max(int a, int b) {
        return Math.max(a, b);
    }
    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
    public static int max(int a, int b, int c, int d) {
        return Math.max(Math.max(Math.max(a, b), c), d);
    }
    public static int max(int a, int b, int c, int d, int e) {
        return Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
    }
    public static int max(int a, int b, int c, int d, int e, int f) {
        return Math.max(Math.max(Math.max(Math.max(Math.max(a, b), c), d), e), f);
    }
    public static int max(int a, int b, int c, int d, int e, int f, int g) {
        return Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(a, b), c), d), e), f), g);
    }
    public static int max(int a, int b, int c, int d, int e, int f, int g, int h) {
        return Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(a, b), c), d), e), f), g), h);
    }
    public static int max(int a, int... vals) {
        int ret = a; for (int e : vals) ret = Math.max(ret, e);
        return ret;
    }
    public static int min(int a, int b) {
        return Math.min(a, b);
    }
    public static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
    public static int min(int a, int b, int c, int d) {
        return Math.min(Math.min(Math.min(a, b), c), d);
    }
    public static int min(int a, int b, int c, int d, int e) {
        return Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
    }
    public static int min(int a, int b, int c, int d, int e, int f) {
        return Math.min(Math.min(Math.min(Math.min(Math.min(a, b), c), d), e), f);
    }
    public static int min(int a, int b, int c, int d, int e, int f, int g) {
        return Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(a, b), c), d), e), f), g);
    }
    public static int min(int a, int b, int c, int d, int e, int f, int g, int h) {
        return Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(a, b), c), d), e), f), g), h);
    }
    public static int min(int a, int... vals) {
        int ret = a; for (int e : vals) ret = Math.min(ret, e);
        return ret;
    }
    public static int fold(final IntBinaryOperator func, final int... a) {
        int ret = a[0]; for (int i = 1; i < a.length; i++) ret = func.applyAsInt(ret, a[i]);
        return ret;
    }
    public static boolean isPowerOfTwo(final int n) {return n != 0 && (-n & n) == n;}
    public static int ceilExponent(final int n) {return 31 - Integer.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);}
    public static int floorExponent(final int n) {return 31 - Integer.numberOfLeadingZeros(n) + (n == 0 ? 1 : 0);}
    /**
     * Caluculate the ceil of a/b. Returns the smallest integer greater than or
     * equal to a/b while 'a/b' rounds fractional parts to ZERO.
     * @param a
     * @param b
     * @return the smallest integer greater than or equal to a/b
     */
    public static int cld(final int a, final int b) {
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
    public static int fld(final int a, final int b) {
        if (a <= 0 && b > 0) return (a - b + 1) / b;
        if (a > 0 && b <= 0) return (a - b - 1) / b;
        return a / b;
    }
    public static String join(final String sep, final int... a) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1)  sb.append(sep);
        }
        return sb.toString();
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class ExtendedScanner extends BasicScanner {
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


class IntDualSegmentTree {
    private final int[] dat, laz;
    private final int n;
    private final int e0, e1;
    private final IntBinaryOperator g, h;
    private final int[] st = new int[64];
    public IntDualSegmentTree(int n, int e0, int e1, IntBinaryOperator g, IntBinaryOperator h) {
        this.e0 = e0;
        this.e1 = e1;
        this.g = g; this.h = h;
        int k = 1; while (k < n) k <<= 1;
        this.dat = new int[k];
        this.laz = new int[k << 1];
        this.n = k;
        clear();
    }
    public void build(int[] a) {
        System.arraycopy(a, 0, dat, 0, a.length);
    }
    public void build(int len, IntUnaryOperator generator) {
        for (int i = 0; i < len; i++) dat[i] = generator.applyAsInt(i);
    }
    public void apply(int l, int r, int v) {
        if (l >= r) return;
        updown(l, r);
        l += n; r += n;
        for (; l < r; l >>= 1, r >>= 1) {
            if ((l & 1) != 0) {laz[l] = h.applyAsInt(laz[l], v); l++;}
            if ((r & 1) != 0) {r--; laz[r] = h.applyAsInt(laz[r], v);}
        }
    }
    public int get(int i) {
        int k = 1;
        int l = 0, r = n;
        while (k < n) {
            propagate(k);
            int kl = k << 1 | 0;
            int kr = k << 1 | 1;
            int m = (l + r) >> 1;
            if (m > i) {r = m; k = kl;} 
            else {l = m; k = kr;}
        }
        propagate(k);
        return dat[k - n];
    }
    private void updown(int l, int r) {
        if (l >= r) return;
        int i = 0;
        int kl = l + n, kr = r + n;
        for (int x = kl / (kl & -kl) >> 1, y = kr / (kr & -kr) >> 1; 0 < kl && kl < kr; kl >>= 1, kr >>= 1) {
            if (kl <= x) st[i++] = kl;
            if (kr <= y) st[i++] = kr;
        }
        for (; kl > 0; kl >>= 1) st[i++] = kl;
        while (i > 0) propagate(st[--i]);
    }
    private void propagate(int k) {
        int lz = laz[k];
        if (lz != e1) {
            if (k < n) {
                int l = k << 1 | 0, r = k << 1 | 1;
                laz[l] = h.applyAsInt(laz[l], lz);
                laz[r] = h.applyAsInt(laz[r], lz);
            } else {
                dat[k - n] = g.applyAsInt(dat[k - n], lz);
            }
            laz[k] = e1;
        }
    }
    public void clear() {
        Arrays.fill(dat, e0);
        Arrays.fill(laz, e1);
    }
}
