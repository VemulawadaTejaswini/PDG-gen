import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) throws Exception {
        System.err.close();
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
        var init = new long[n];
        Arrays.fill(init, Infty.LONG);
        init[b] = 0;
        var dp = new LongLazySegmentTree(init, Long::min, Infty.LONG, Long::sum, Long::sum, 0l);
        for (int i = 0; i < n; i++) {
            init[i] += i;
        }
        var pt = new LongLazySegmentTree(init, Long::min, Infty.LONG, Long::sum, Long::sum, 0l);
        for (int i = 0; i < n; i++) {
            init[i] -= 2 * i;
        }
        var nt = new LongLazySegmentTree(init, Long::min, Infty.LONG, Long::sum, Long::sum, 0l);
        int pre = a;
        while (m --> 0) {
            int now = sc.nextInt() - 1;
            long nq = nt.prod(0, now) + now;
            long pq = pt.prod(now, n) - now;
            long min = Math.min(nq, pq);
            dp.apply(0, n, Math.abs(now - pre));
            pt.apply(0, n, Math.abs(now - pre));
            nt.apply(0, n, Math.abs(now - pre));
            dp.set(pre, min);
            pt.set(pre, min + pre);
            nt.set(pre, min - pre);
            pre = now;
        }
        out.writeln(dp.prod(0, n));
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

    @FunctionalInterface
    public static interface FunMergerLR {
        public long apply(long func, int left, int right);
    }

    @FunctionalInterface
    public static interface FunMergerWidth {
        public long apply(long f, int w);
    }

    final int MAX;

    final int N;
    final int Log;
    final java.util.function.LongBinaryOperator Op;
    final long E;
    final java.util.function.LongBinaryOperator Mapping;
    final java.util.function.LongBinaryOperator Composition;
    final FunMergerLR ProdComposition;
    final long Id;

    final long[] Dat;
    final long[] Laz;

    public LongLazySegmentTree(int n, java.util.function.LongBinaryOperator op, long e, java.util.function.LongBinaryOperator mapping, java.util.function.LongBinaryOperator composition, FunMergerLR prodComposition, long id) {
        this.MAX = n;
        int k = 1;
        while (k < n) k <<= 1;
        this.N = k;
        this.Log = Integer.numberOfTrailingZeros(N);
        this.Op = op;
        this.E = e;
        this.Mapping = mapping;
        this.Composition = composition;
        this.ProdComposition = prodComposition;
        this.Id = id;
        this.Dat = new long[N << 1];
        this.Laz = new long[N];
        java.util.Arrays.fill(Dat, E);
        java.util.Arrays.fill(Laz, Id);
    }

    public LongLazySegmentTree(int n, java.util.function.LongBinaryOperator op, long e, java.util.function.LongBinaryOperator mapping, java.util.function.LongBinaryOperator composition, FunMergerWidth prodComposition, long id) {
        this(n, op, e, mapping, composition, (f, l, r) -> prodComposition.apply(f, r - l), id);
    }

    public LongLazySegmentTree(int n, java.util.function.LongBinaryOperator op, long e, java.util.function.LongBinaryOperator mapping, java.util.function.LongBinaryOperator composition, long id) {
        this(n, op, e, mapping, composition, (f, l, r) -> f, id);
    }

    public LongLazySegmentTree(long[] dat, java.util.function.LongBinaryOperator op, long e, java.util.function.LongBinaryOperator mapping, java.util.function.LongBinaryOperator composition, FunMergerLR prodComposition, long id) {
        this(dat.length, op, e, mapping, composition, prodComposition, id);
        build(dat);
    }

    public LongLazySegmentTree(long[] dat, java.util.function.LongBinaryOperator op, long e, java.util.function.LongBinaryOperator mapping, java.util.function.LongBinaryOperator composition, FunMergerWidth prodComposition, long id) {
        this(dat.length, op, e, mapping, composition, prodComposition, id);
        build(dat);
    }

    public LongLazySegmentTree(long[] dat, java.util.function.LongBinaryOperator op, long e, java.util.function.LongBinaryOperator mapping, java.util.function.LongBinaryOperator composition, long id) {
        this(dat.length, op, e, mapping, composition, id);
        build(dat);
    }

    private void build(long[] dat) {
        int l = dat.length;
        System.arraycopy(dat, 0, Dat, N, l);
        for (int i = N - 1; i > 0; i--) {
            Dat[i] = Op.applyAsLong(Dat[i << 1 | 0], Dat[i << 1 | 1]);
        }
    }

    private void push(int k, int h) {
        if (Laz[k] == Id) return;
        int w = 1 << h - 1;
        int l = (k << h) ^ N;
        int lk = k << 1 | 0, rk = k << 1 | 1;
        Dat[lk] = Mapping.applyAsLong(ProdComposition.apply(Laz[k], l, l += w), Dat[lk]);
        Dat[rk] = Mapping.applyAsLong(ProdComposition.apply(Laz[k], l, l += w), Dat[rk]);
        if (lk < N) Laz[lk] = Composition.applyAsLong(Laz[k], Laz[lk]);
        if (rk < N) Laz[rk] = Composition.applyAsLong(Laz[k], Laz[rk]);
        Laz[k] = Id;
    }

    private void pushTo(int k) {
        for (int i = Log; i > 0; i--) push(k >> i, i);
    }

    private void pushTo(int lk, int rk) {
        for (int i = Log; i > 0; i--) {
            if (((lk >> i) << i) != lk) push(lk >> i, i);
            if (((rk >> i) << i) != rk) push(rk >> i, i);
        }
    }

    private void updateFrom(int k) {
        k >>= 1;
        while (k > 0) {
            Dat[k] = Op.applyAsLong(Dat[k << 1 | 0], Dat[k << 1 | 1]);
            k >>= 1;
        }
    }

    private void updateFrom(int lk, int rk) {
        for (int i = 1; i <= Log; i++) {
            if (((lk >> i) << i) != lk) {
                int lki = lk >> i;
                Dat[lki] = Op.applyAsLong(Dat[lki << 1 | 0], Dat[lki << 1 | 1]);
            }
            if (((rk >> i) << i) != rk) {
                int rki = (rk - 1) >> i;
                Dat[rki] = Op.applyAsLong(Dat[rki << 1 | 0], Dat[rki << 1 | 1]);
            }
        }
    }

    public void set(int p, long x) {
        exclusiveRangeCheck(p);
        p += N;
        pushTo(p);
        Dat[p] = x;
        updateFrom(p);
    }

    public long get(int p) {
        exclusiveRangeCheck(p);
        p += N;
        pushTo(p);
        return Dat[p];
    }

    public long prod(int l, int r) {
        if (l > r) {
            throw new IllegalArgumentException(
                String.format("Invalid range: [%d, %d)", l, r)
            );
        }
        inclusiveRangeCheck(l);
        inclusiveRangeCheck(r);
        if (l == r) return E;
        l += N; r += N;
        pushTo(l, r);
        long sumLeft = E, sumRight = E;
        while (l < r) {
            if ((l & 1) == 1) sumLeft = Op.applyAsLong(sumLeft, Dat[l++]);
            if ((r & 1) == 1) sumRight = Op.applyAsLong(Dat[--r], sumRight);
            l >>= 1; r >>= 1;
        }
        return Op.applyAsLong(sumLeft, sumRight);
    }

    public long allProd() {
        return Dat[1];
    }

    public void apply(int p, long f) {
        exclusiveRangeCheck(p);
        int pk = p + N;
        pushTo(pk);
        Dat[pk] = Mapping.applyAsLong(ProdComposition.apply(f, p, p + 1), Dat[pk]);
        updateFrom(pk);
    }

    public void apply(int l, int r, long f) {
        if (l > r) {
            throw new IllegalArgumentException(
                String.format("Invalid range: [%d, %d)", l, r)
            );
        }
        inclusiveRangeCheck(l);
        inclusiveRangeCheck(r);
        if (l == r) return;
        l += N; r += N;
        pushTo(l, r);
        for (int l2 = l, r2 = r, h = 0; l2 < r2; h++) {
            if ((l2 & 1) == 1) {
                int l2l = (l2 << h) ^ N;
                Dat[l2] = Mapping.applyAsLong(ProdComposition.apply(f, l2l, l2l + (1 << h)), Dat[l2]);
                if (l2 < N) Laz[l2] = Composition.applyAsLong(f, Laz[l2]);
                l2++;
            }
            if ((r2 & 1) == 1) {
                r2--;
                int r2l = (r2 << h) ^ N;
                Dat[r2] = Mapping.applyAsLong(ProdComposition.apply(f, r2l, r2l + (1 << h)), Dat[r2]);
                if (r2 < N) Laz[r2] = Composition.applyAsLong(f, Laz[r2]);
            }
            l2 >>= 1; r2 >>= 1;
        }
        updateFrom(l, r);
    }

    public int maxRight(int l, java.util.function.LongPredicate g) {
        inclusiveRangeCheck(l);
        if (!g.test(E)) {
            throw new IllegalArgumentException("Identity element must satisfy the condition.");
        }
        if (l == MAX) return MAX;
        l += N;
        pushTo(l);
        long sum = E;
        do {
            l >>= Integer.numberOfTrailingZeros(l);
            if (!g.test(Op.applyAsLong(sum, Dat[l]))) {
                while (l < N) {
                    push(l, 31 - Integer.numberOfLeadingZeros(l));
                    l = l << 1;
                    if (g.test(Op.applyAsLong(sum, Dat[l]))) {
                        sum = Op.applyAsLong(sum, Dat[l]);
                        l++;
                    }
                }
                return l - N;
            }
            sum = Op.applyAsLong(sum, Dat[l]);
            l++;
        } while ((l & -l) != l);
        return MAX;
    }

    public int minLeft(int r, java.util.function.LongPredicate g) {
        inclusiveRangeCheck(r);
        if (!g.test(E)) {
            throw new IllegalArgumentException("Identity element must satisfy the condition.");
        }
        if (r == 0) return 0;
        r += N;
        pushTo(r - 1);
        long sum = E;
        do {
            r--;
            while (r > 1 && (r & 1) == 1) r >>= 1;
            if (!g.test(Op.applyAsLong(Dat[r], sum))) {
                while (r < N) {
                    push(r, 31 - Integer.numberOfLeadingZeros(r));
                    r = r << 1 | 1;
                    if (g.test(Op.applyAsLong(Dat[r], sum))) {
                        sum = Op.applyAsLong(Dat[r], sum);
                        r--;
                    }
                }
                return r + 1 - N;
            }
            sum = Op.applyAsLong(Dat[r], sum);
        } while ((r & -r) != r);
        return 0;
    }

    private void exclusiveRangeCheck(int p) {
        if (p < 0 || p >= MAX) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d is not in [%d, %d).", p, 0, MAX)
            );
        }
    }

    private void inclusiveRangeCheck(int p) {
        if (p < 0 || p > MAX) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d is not in [%d, %d].", p, 0, MAX)
            );
        }
    }

    @Override
    public String toString() {
        return toString(1, 0);
    }

    String toString(int k, int space) {
        String s = "";
        if (k < N) s += toString(k << 1 | 1, space + 6) + "\n";
        s += " ".repeat(space) + Dat[k];
        if (k < N) s += "/" + Laz[k];
        if (k < N) s += "\n" + toString(k << 1 | 0, space + 6);
        return s;
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
