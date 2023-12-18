import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
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
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        var pt = new LongLazySegmentTree(n, Infty.LONG, 0, Long::min, Long::sum, Long::sum, (e, l) -> e);
        var nt = new LongLazySegmentTree(n, Infty.LONG, 0, Long::min, Long::sum, Long::sum, (e, l) -> e);
        var dp = new LongLazySegmentTree(n, Infty.LONG, 0, Long::min, Long::sum, Long::sum, (e, l) -> e);
        var init = new long[n];
        Arrays.fill(init, Infty.LONG);
        init[b] = 0;
        dp.build(init);
        for (int i = 0; i < n; i++) {
            init[i] += i;
        }
        pt.build(init);
        for (int i = 0; i < n; i++) {
            init[i] -= 2 * i;
        }
        nt.build(init);
        int pre = a;
        while (m --> 0) {
            int now = sc.nextInt() - 1;
            long nq = nt.query(0, now) + now;
            long pq = pt.query(now, n) - now;
            long min = Math.min(nq, pq);
            dp.apply(0, n, Math.abs(now - pre));
            pt.apply(0, n, Math.abs(now - pre));
            nt.apply(0, n, Math.abs(now - pre));
            dp.update(pre, min);
            pt.update(pre, min + pre);
            nt.update(pre, min - pre);
            pre = now;
        }
        out.writeln(dp.query(0, n));
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

final class Infty {
    public static final long   LONG   = 1l << 59;
    public static final int    INT    = 1  << 30;
    public static final double DOUBLE = 1e150;
    private Infty(){}
}



class LongLazySegmentTree {
    private final long[] dat, laz;
    private final int n;
    private final long e0, e1;
    private final LongBinaryOperator f, g, h;
    private final LongIntToLongFunction p;
    private final int[] st = new int[64];
    public LongLazySegmentTree(int n, long e0, long e1, LongBinaryOperator f, LongBinaryOperator g, LongBinaryOperator h, LongIntToLongFunction p) {
        this.e0 = e0;
        this.e1 = e1;
        this.f = f; this.g = g; this.h = h; this.p = p;
        int k = 1; while (k < n) k <<= 1;
        this.dat = new long[k << 1];
        this.laz = new long[k << 1];
        this.n = k;
        Arrays.fill(dat, e0);
        Arrays.fill(laz, e1);
    }
    public void build(long[] a) {
        System.arraycopy(a, 0, dat, n, a.length);
        for (int i = n - 1; i > 0; i--) dat[i] = f.applyAsLong(dat[i << 1 | 0], dat[i << 1 | 1]);
    }
    public long update(int i, long newValue) {
        return apply(i, e -> newValue);
    }
    public long apply(int i, LongUnaryOperator f) {
        long ret = get(i);
        int k = i + n;
        dat[k] = f.applyAsLong(ret);
        while ((k >>= 1) > 0) dat[k] = this.f.applyAsLong(dat[k << 1 | 0], dat[k << 1 | 1]);
        return ret;
    }
    public void apply(int l, int r, long v) {
        if (l >= r) return;
        int m = updown(l, r);
        l += n; r += n;
        for (; l < r; l >>= 1, r >>= 1) {
            if ((l & 1) != 0) {laz[l] = h.applyAsLong(laz[l], v); l++;}
            if ((r & 1) != 0) {r--; laz[r] = h.applyAsLong(laz[r], v);}
        }
        for (int i = 0; i < m; i++) {
            int k = st[i];
            dat[k] = f.applyAsLong(calcDat(k << 1 | 0), calcDat(k << 1 | 1));
        }
    }
    public long get(int i) {
        int k = 1;
        calcDat(k);
        int l = 0, r = n;
        while (k < n) {
            int kl = k << 1 | 0;
            int kr = k << 1 | 1;
            dat[k] = f.applyAsLong(calcDat(kl), calcDat(kr));
            int m = (l + r) >> 1;
            if (m > i) {r = m; k = kl;} 
            else {l = m; k = kr;}
        }
        return dat[k];
    }
    public long query(int l, int r) {
        if (l >= r) return e0;
        updown(l, r);
        long resL = e0, resR = e0;
        for (l += n, r += n; l < r; l >>= 1, r >>= 1) {
            if ((l & 1) != 0) resL = f.applyAsLong(resL, calcDat(l++));
            if ((r & 1) != 0) resR = f.applyAsLong(calcDat(--r), resR);
        }
        return f.applyAsLong(resL, resR);
    }
    private int updown(int l, int r) {
        if (l >= r) return 0;
        int i = 0;
        int kl = l + n, kr = r + n;
        for (int x = kl / (kl & -kl) >> 1, y = kr / (kr & -kr) >> 1; 0 < kl && kl < kr; kl >>= 1, kr >>= 1) {
            if (kl <= x) st[i++] = kl;
            if (kr <= y) st[i++] = kr;
        }
        for (; kl > 0; kl >>= 1) st[i++] = kl;
        int m = i;
        while (i > 0) calcDat(st[--i]);
        return m;
    }
    private long calcDat(int k) {
        long lz = laz[k];
        if (lz != e1) {
            int w = n / Integer.highestOneBit(k);
            dat[k] = g.applyAsLong(dat[k], p.apply(lz, w));
            if (k < n) {
                int l = k << 1 | 0, r = k << 1 | 1;
                laz[l] = h.applyAsLong(laz[l], lz);
                laz[r] = h.applyAsLong(laz[r], lz);
            }
            laz[k] = e1;
        }
        return dat[k];
    }
    public void reset() {
        Arrays.fill(dat, e0);
        Arrays.fill(laz, e1);
    }

    @Override
    public String toString() {
        return toString(1, 0);
    }

    String toString(int k, int space) {
        String s = "";
        if (k < n) s += toString(k << 1 | 1, space + 6) + "\n";
        s += " ".repeat(space) + datToString(k) + "/" + lazToString(k);
        if (k < n) s += "\n" + toString(k << 1 | 0, space + 6);
        return s;
    }

    String datToString(int k) {
        return 2 * dat[k] > e0 ? "e" : "" + dat[k];
    }

    String lazToString(int k) {
        return laz[k] == e1 ? "e" : "" + laz[k];
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
@FunctionalInterface
interface LongIntToLongFunction {
    public long apply(long l, int i);
    public default IntToLongFunction curry(final long l) {return i -> apply(l, i);}
}
