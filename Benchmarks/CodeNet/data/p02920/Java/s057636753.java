import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
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
        long[] s = sc.longs(1 << n);
        Compress cmp = new Compress(s, false);
        int[] t = cmp.compress;
        // Arrays.sort(t);
        // System.out.println(Arrays.toString(t));
        RangeOrderedMultiSet set = new RangeOrderedMultiSet(0, 1 << n);
        for (int e : t) set.add(e);
        // for (int i = 0; i < 8; i++) {
        //     System.out.print(i + ": " + set.count(i) + ", ");
        // }
        // System.out.println();
        for (int i = 0; i < n; i++) {
            int k = 1 << (n - i - 1);
            var it = set.descendingIterator();
            for (int j = 0; j < k; j++) {
                int e = it.nextInt();
                if (set.first() == e) {
                    out.writeln("No");
                    return;
                }
                int l = set.lower(e);
                set.remove(l);
            }
            // for (int j = 0; j < 8; j++) {
            //     System.out.print(j + ": " + set.count(j) + ", ");
            // }
            // System.out.println();
        }
        out.writeln("Yes");
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
final class IntLongPair {
    public int fst;
    public long snd;
    public IntLongPair(final int fst, final long snd) {this.fst = fst; this.snd = snd;}
    @Override @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof IntLongPair)) return false;
        final IntLongPair p = (IntLongPair) o;
        return this.fst == p.fst && this.snd == p.snd;
    }
    @Override
    public int hashCode() {return Objects.hash(this.fst, this.snd);}
    @Override
    public String toString() {return "(" + this.fst + ", " + this.snd + ")";}
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
 * 
 * 1. DESTRUCTIVE methods for long arrays.
 * 2. methods that receives arrays and return some results (except for long arrays).
 */
final class LongArrays {
    private LongArrays(){}
    public static void swap(final long[] a, final int u, final int v) {
        final long tmp = a[u]; a[u] = a[v]; a[v] = tmp;
    }
    public static void reverse(final long[] a, int begin, int end) {
        while (end - begin > 1) swap(a, begin++, --end);
    }
    public static void reverse(final long[] a) {reverse(a, 0, a.length);}
    public static void sortDescending(final long[] a) {Arrays.sort(a); reverse(a);}
    public static long fold(final long[] a, final LongBinaryOperator op) {
        long ret = a[0]; for (int i = 1; i < a.length; i++) ret = op.applyAsLong(ret, a[i]);
        return ret;
    }
    public static long sum(final long[] a) {return fold(a, Long::sum);}
    public static long max(final long[] a) {return fold(a, Long::max);}
    public static long min(final long[] a) {return fold(a, Long::min);}
    public static IntLongPair maxWithIndex(final long[] a) {
        long max = max(a); return new IntLongPair(find(a, max), max);
    }
    public static IntLongPair minWithIndex(final long[] a) {
        long min = min(a); return new IntLongPair(find(a, min), min);
    }
    public static int find(final long[] a, final long v) {
        for (int i = 0; i < a.length; i++) if (a[i] == v) return i;
        return -1;
    }
    public static void map(final long[] a, final LongUnaryOperator op) {Arrays.setAll(a, i -> op.applyAsLong(a[i]));}
    public static int filter(final long[] src, final long[] dst, final LongPredicate p) {
        int idx = 0;
        for (final long e : src) if (p.test(e)) dst[idx++] = e;
        return idx;
    }
    public static int filterIndex(final long[] dst, final int beginIndex, final int endIndex, final LongPredicate p) {
        int idx = 0;
        for (int i = beginIndex; i < endIndex; i++) if (p.test(i)) dst[idx++] = i;
        return idx;
    }
    public static int filterIndex(final long dst[], final int endIndex, final LongPredicate p) {
        return filterIndex(dst, 0, endIndex, p);
    }
    public static void accumulate(final long[] a, final LongBinaryOperator op) {
        for (int i = 1; i < a.length; i++) a[i] = op.applyAsLong(a[i - 1], a[i]);
    }
    public static void accumulate(final long[] a) {
        for (int i = 1; i < a.length; i++) a[i] += a[i - 1];
    }
    public static void permute(long[] a, int[] p) {
        int n = p.length;
        boolean[] settled = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; !settled[j]; j = p[j]) {
                if (p[j] == i) {
                    settled[j] = true;
                    break;
                }
                swap(a, j, p[j]);
                settled[j] = true;
            }
        }
    }
    public static int lowerBound(long[] sorted, long key) {
        int n = sorted.length;
        int l = -1, r = n;
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (sorted[m] < key) l = m;
            else r = m;
        }
        return r;
    }
    public static int upperBound(long[] sorted, long key) {
        int n = sorted.length;
        int l = -1, r = n;
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (sorted[m] <= key) l = m;
            else r = m;
        }
        return r;
    }
    public static int countRange(long[] sorted, long fromKey, long toKey) {
        return lowerBound(sorted, toKey) - lowerBound(sorted, fromKey);
    }
    public static int compare(final long[] a, final long[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) return -1;
            if (a[i] > b[i]) return 1;
            if (a[i] < b[i]) return -1;
        }
        return a.length < b.length ? 1 : 0;
    }
    public static boolean equals(final long[] a, final long[] b) {return compare(a, b) == 0;}
    public static String join(final long[] a, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
    public static String joinWithPrefixAndSuffix(final long[] a, final IntFunction<String> idxToPre, final IntFunction<String> idxToSuf, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(idxToPre.apply(i)).append(a[i]).append(idxToSuf.apply(i));
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
}


class RangeOrderedMultiSet extends RangeOrderedSet {
    public RangeOrderedMultiSet(final int l, final int r) {super(l, r);}
    @Override
    public void add(final int i) {add(i, 1);}
    public void add(final int i, final int num) {update(bias + i, count(i) + num);}
    public void addIfAbsent(final int i) {super.add(i);}
    @Override
    public void remove(final int i) {remove(i, 1);}
    public void removeAll(final int i) {remove(i, count(i));}
    public void remove(final int i, final int num) {
        if (num == 0) return;
        final int c = count(i);
        if (c < num) throw new NoSuchElementException();
        if (c > 0) update(bias + i, c - num);
    }
    public int count(int i) {return cnt[bias + i + n];}
    @Override
    public PrimitiveIterator.OfInt iterator() {return new AscendingMultiSetIterator();}
    @Override
    public PrimitiveIterator.OfInt descendingIterator() {return new DescendingMultiSetIterator();}
    class AscendingMultiSetIterator extends AscendingSetIterator {
        int num = 0;
        @Override
        public boolean hasNext() {
            if (num < count(it)) {
                num++;
                return true;
            } else return it <= max;
        }
        @Override
        public int nextInt() {
            int ret = it;
            if (num == count(it)) {
                num = 0;
                it = it == max ? Integer.MAX_VALUE : higher(it);
            }
            return ret;
        }
    }
    class DescendingMultiSetIterator extends DescendingSetIterator {
        int num = 1;
        @Override
        public boolean hasNext() {
            return num < count(it) || it >= min;
        }
        @Override
        public int nextInt() {
            int ret = it;
            if (num < count(it)) {
                num++;
            } else {
                num = 1;
                it = it == min ? Integer.MIN_VALUE : lower(it);
            }
            return ret;
        }
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


/**
 * @author https://atcoder.jp/users/suisen
 */
@FunctionalInterface
interface IntToLongBiFunction {
    public long apply(int x, int y);
    public default IntToLongFunction curry(final int x) {return y -> apply(x, y);}
}



/**
 * @author https://atcoder.jp/users/suisen
 * 
 * (NON-DESTRUCTIVE) methods that returns long array.
 */
final class LongArrayFactory {
    private LongArrayFactory() {}
    public static long[] filled(final int n, final long init) {
        final long[] ret = new long[n];
        Arrays.fill(ret, init);
        return ret;
    }
    public static long[][] filled(final int n, final int m, final long init) {
        final long[][] ret = new long[n][m];
        for (int i = 0; i < n; i++) Arrays.fill(ret[i], init);
        return ret;
    }
    public static long[] generate(final int n, final LongSupplier f) {
        final long[] a = new long[n];
        Arrays.setAll(a, i -> f.getAsLong());
        return a;
    }
    public static long[][] generate(final int n, final int m, final LongSupplier f) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = generate(m, f);
        return a;
    }
    public static long[] indexToLong(final int n, final IntToLongFunction f) {
        final long[] a = new long[n];
        Arrays.setAll(a, f);
        return a;
    }
    public static long[][] indexToLong(final int n, final int m, final IntToLongBiFunction f) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = indexToLong(m, f.curry(i));
        return a;
    }
    public static long[] toArray(final Collection<? extends Number> collection) {
        final int n = collection.size();
        final long[] ret = new long[n];
        final Object[] coll = collection.toArray();
        for (int i = 0; i < n; i++) ret[i] = ((Number) coll[i]).longValue();
        return ret;
    }
    public static long[] unique(final long[] a) {
        final HashSet<Long> set = new HashSet<>();
        for (final long e : a) set.add(e);
        final int m = set.size();
        final long[] b = new long[m];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                b[index++] = a[i];
                set.remove(a[i]);
            }
        }
        return b;
    }
    public static long[][] transpose(final long[][] a) {
        final int n = a.length;
        final int m = a[0].length;
        final long[][] ret = new long[m][n];
        for (int j = 0; j < m; j++) for (int i = 0; i < n; i++) ret[j][i] = a[i][j];
        return ret;
    }
    public static long[] map(final long[] a, final LongUnaryOperator f) {
        final long[] b = new long[a.length];
        Arrays.setAll(b, i -> f.applyAsLong(a[i]));
        return b;
    }
    public static long[] filter(final long[] a, final LongPredicate p) {
        final LongArrayList ret = new LongArrayList();
        for (final long e : a) ret.addIf(e, p);
        return ret.toArray();
    }
    public static long[] accumulateFromHead(final long[] a, final LongBinaryOperator op, final long e) {
        final int n = a.length;
        final long[] ret = new long[n + 1];
        ret[0] = e;
        for (int i = 0; i < n; i++) ret[i + 1] = op.applyAsLong(ret[i], a[i]);
        return ret;
    }
    public static long[] accumulateFromTail(final long[] a, final LongBinaryOperator op, final long e) {
        final int n = a.length;
        final long[] ret = new long[n + 1];
        ret[n] = e;
        for (int i = n - 1; i >= 0; i--) ret[i] = op.applyAsLong(ret[i + 1], a[i]);
        return ret;
    }
}


class RangeOrderedSet {
    final int[] cnt;
    final int n;
    final int bias;

    public RangeOrderedSet(final int l, final int r) {
        this.bias = -l;
        int w = r - l;
        int nn = 1; while (nn < w) nn <<= 1;
        this.n = nn;
        this.cnt = new int[n << 1];
    }

    public void add(int i) {
        if (contains(i)) return;
        update(bias + i, 1);
    }

    public void remove(int i) {
        if (!contains(i)) return;
        update(bias + i, 0);
    }

    public int pollFirst() {
        int ret = first();
        remove(ret);
        return ret;
    }

    public int pollLast() {
        int ret = last();
        remove(ret);
        return ret;
    }

    public boolean contains(int i) {
        return cnt[bias + i + n] > 0;
    }

    public int first() {
        if (cnt[1] == 0) throw new NoSuchElementException();
        int k = 1;
        while (k < n) {
            k <<= 1;
            if (cnt[k] == 0) k |= 1;
        }
        return k - n - bias;
    }

    public int last() {
        if (cnt[1] == 0) throw new NoSuchElementException();
        int k = 1;
        while (k < n) {
            k <<= 1;
            if (cnt[k | 1] > 0) k |= 1;
        }
        return k - n - bias;
    }

    public int kthElement(int k) {
        if (cnt[1] <= k) throw new NoSuchElementException();
        int i = 1;
        int s = 0;
        k++;
        while (i < n) {
            i <<= 1;
            if (s + cnt[i] < k) {
                s += cnt[i];
                i |= 1;
            }
        }
        return i - n - bias;
    }

    public int lower(int i) {
        int r = bias + i + n;
        r /= r & -r;
        while (true) {
            if (cnt[--r] > 0) break;
            if (r == 0) throw new NoSuchElementException();
            r /= r & -r;
        }
        while (r < n) {
            r <<= 1;
            if (cnt[r | 1] > 0) r |= 1;
        }
        return r - n - bias;
    }

    public int floor(int i) {return contains(i) ? i : lower(i);}

    public int higher(int i) {
        int l = bias + i + 1 + n;
        l /= l & -l;
        while (true) {
            if (cnt[l] > 0) break;
            if (++l == n << 1) throw new NoSuchElementException();
            l /= l & -l;
        }
        while (l < n) {
            l <<= 1;
            if (cnt[l] == 0) l |= 1;
        }
        return l - n - bias;
    }

    public int ceiling(int i) {return contains(i) ? i : higher(i);}

    public boolean isEmpty() {return cnt[1] == 0;}

    public int size() {return cnt[1];}

    public int count(int l, int r) {
        l += bias; r += bias;
        if (l < 0 || r > n) throw new OutOfRangeException("Out of Range.");
        l += n; r += n;
        int res = 0;
        while (r > l) {
            if ((l & 1) == 1) res += cnt[l++];
            if ((r & 1) == 1) res += cnt[--r];
            l >>= 1; r >>= 1;
        }
        return res;
    }

    void update(int i, final int c) {
        i += n;
        cnt[i] = c;
        while ((i >>= 1) > 0) cnt[i] = cnt[i << 1] + cnt[(i << 1) | 1];
    }

    public PrimitiveIterator.OfInt iterator() {return new AscendingSetIterator();}

    public PrimitiveIterator.OfInt descendingIterator() {return new DescendingSetIterator();}

    class AscendingSetIterator implements PrimitiveIterator.OfInt {
        int it = size() > 0 ? first() : Integer.MAX_VALUE;
        final int max = size() > 0 ? last() : Integer.MIN_VALUE;
        public boolean hasNext() {return it <= max;}
        public int nextInt() {
            int ret = it;
            it = it == max ? Integer.MAX_VALUE : higher(it);
            return ret;
        }
    }
    class DescendingSetIterator implements PrimitiveIterator.OfInt {
        int it = size() > 0 ? last() : Integer.MIN_VALUE;
        final int min = size() > 0 ? first() : Integer.MAX_VALUE;
        public boolean hasNext() {return it >= min;}
        public int nextInt() {
            int ret = it;
            it = it == min ? Integer.MIN_VALUE : lower(it);
            return ret;
        }
    }
    private class OutOfRangeException extends RuntimeException {
        private static final long serialVersionUID = 1437290411625321824L;
        private OutOfRangeException() {super();}
        private OutOfRangeException(String s) {super(s);}
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
final class Compress {
    public int n;
    public int m;
    public int[] compress;
    public long[] sorted;
    public boolean oneIndexed;
    public Compress(final long[] a, final boolean oneIndexed) {
        this.n = a.length;
        this.compress = new int[n];
        this.oneIndexed = oneIndexed;
        build(a);
        this.m = sorted.length;
    }
    private void build(final long[] a) {
        this.sorted = LongArrayFactory.unique(a);
        Arrays.sort(this.sorted);
        final int size = this.sorted.length;
        for (int i = 0; i < n; i++) {
            int l = 0, r = size;
            while (r - l > 1) {
                final int m = l + (r - l) / 2;
                if (this.sorted[m] <= a[i]) {
                    l = m;
                } else {
                    r = m;
                }
            }
            this.compress[i] = this.oneIndexed ? l + 1 : l;
        }
    }
    public HashMap<Long, Integer> toIndexMap() {
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) map.put(sorted[i], i);
        return map;
    }
    public long indexToLong(int i) {
        return sorted[i];
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
final class LongArrayList implements Iterable<Long> {
    private long[] a;
    private int tail = 0;
    private static final int DEFAULT_SIZE = 64;
    public LongArrayList(final int capacity) {this.a = new long[Math.max(1, capacity)];}
    public LongArrayList() {this(DEFAULT_SIZE);}
    public void add(final long v) {
        if (tail == a.length) grow();
        a[tail++] = v;
    }
    public long removeLast() {return a[--tail];}
    public long get(final int i) {
        if (i >= a.length) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        return a[i];
    }
    public void set(final int i, final long v) {
        if (i >= a.length) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        a[i] = v;
    }
    private void grow() {
        final long[] b = new long[a.length << 1];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }
    public int size() {return tail;}
    public void clear() {tail = 0;}
    public void reverse(final int begin, final int end) {LongArrays.reverse(a, begin, end);}
    public void reverse() {LongArrays.reverse(a, 0, tail);}
    public long[] toArray() {
        final long[] ret = new long[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }
    public void sort() {Arrays.sort(a, 0, tail);}
    public boolean addIf(final long v, final LongPredicate p) {
        if (p.test(v)) {add(v); return true;}
        return false;
    }
    public PrimitiveIterator.OfLong iterator() {return new LongArrayListIterator();}
    private class LongArrayListIterator implements PrimitiveIterator.OfLong {
        private int i = 0;
        public boolean hasNext() {return i < tail;}
        public long nextLong() {return a[i++];}
    }
}
