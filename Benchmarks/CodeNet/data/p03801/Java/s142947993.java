import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.print(out);
        pw.flush();
        pw.close();
    }

    public static void solve(StringBuilder out) {
        int n = In.ni();
        long[] a = In.nl(n);
        Compress ac = new Compress(a, false);
        int[] acmp = ac.compress;
        int m = ac.m;
        int[] c = new int[m];
        for (int i = 0; i < n; i++) {
            c[acmp[i]]++;
        }
        int[] s = new int[m + 1];
        for (int i = m - 1; i >= 0; i--) {
            s[i] = s[i + 1] + c[i];
        }
        IntArrayList ls = new IntArrayList();
        ls.add(0);
        for (int i = 1, max = acmp[0]; i < n; i++) {
            if (acmp[i] > max) {
                ls.add(i);
                max = acmp[i];
            }
        }
        ls.reverse();
        int[] idx = ls.toArray();
        int l = idx.length;
        long[] ans = new long[n];
        for (int i = 0, r = m; i < l - 1; i++) {
            long p = a[idx[i + 1]];
            if (r < m) {
                ans[idx[i]] += (long) s[r] * (ac.indexToLong(r) - p);
            }
            while (--r >= acmp[idx[i + 1]] + 1) {
                ans[idx[i]] += (long) c[r] * (ac.indexToLong(r) - p);
            }
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        for (int i = 0; i < n; i++) {
            ans[idx[l - 1]] -= ans[i];
        }
        ans[idx[l - 1]] += sum;
        for (int i = 0; i < n; i++) {
            out.append(ans[i]).append('\n');
        }
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 * 
 * (NON-DESTRUCTIVE) methods that returns long array.
 */
final class LongArrayGenerator {
    private LongArrayGenerator(){}
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
        final long[] acmp = new long[m];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                acmp[index++] = a[i];
                set.remove(a[i]);
            }
        }
        return acmp;
    }
    public static long[][] transpose(final long[][] a) {
        final int n = a.length;
        final int m = a[0].length;
        final long[][] ret = new long[m][n];
        for (int j = 0; j < m; j++) for (int i = 0; i < n; i++) ret[j][i] = a[i][j];
        return ret;
    }
    public static long[] map(final long[] a, final LongUnaryOperator f) {
        final long[] acmp = new long[a.length];
        Arrays.setAll(acmp, i -> f.applyAsLong(a[i]));
        return acmp;
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
    public static void reverse(final long[] a, final int begin, final int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) swap(a, i, begin + end - i - 1);
    }
    public static void reverse(final long[] a) {reverse(a, 0, a.length);}
    public static void sortDescending(final long[] a) {Arrays.sort(a); reverse(a);}
    public static long reduce(final long[] a, final LongBinaryOperator op) {
        long ret = a[0]; for (int i = 1; i < a.length; i++) ret = op.applyAsLong(ret, a[i]);
        return ret;
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
    public static int compare(final long[] a, final long[] acmp) {
        for (int i = 0; i < a.length; i++) {
            if (i >= acmp.length) return -1;
            if (a[i] > acmp[i]) return 1;
            if (a[i] < acmp[i]) return -1;
        }
        return a.length < acmp.length ? 1 : 0;
    }
    public static boolean equals(final long[] a, final long[] acmp) {return compare(a, acmp) == 0;}
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


/**
 * @author https://atcoder.jp/users/suisen
 */
final class In {
    public static final FastScanner fsc = new FastScanner();
    public static int ni() {return fsc.nextInt();}
    public static int[] ni(final int n) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextInt();
        return a;
    }
    public static int[] ni(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsInt(fsc.nextInt());
        return a;
    }
    public static int[][] ni(final int n, final int m) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = ni(m);
        return a;
    }
    public static int[][] ni(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = ni(m, f);
        return a;
    }
    public static long nl() {return fsc.nextLong();}
    public static long[] nl(final int n) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextLong();
        return a;
    }
    public static long[] nl(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsLong(fsc.nextLong());
        return a;
    }
    public static long[][] nl(final int n, final int m) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = nl(m);
        return a;
    }
    public static long[][] nl(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = nl(m, f);
        return a;
    }
    public static char[] nc() {return fsc.next().toCharArray();}
    public static char[][] nc(final int n) {
        final char[][] c = new char[n][];
        for (int i = 0; i < n; i++) c[i] = nc();
        return c;
    }
    public static double nd() {return fsc.nextDouble();}
    public static double[] nd(final int n) {
        final double[] a = new double[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextDouble();
        return a;
    }
    public static double[][] nd(final int n, final int m) {
        final double[][] a = new double[n][m];
        for (int i = 0; i < n; i++) a[i] = nd(m);
        return a;
    }
    public static String ns() {return fsc.next();}
    public static String[] ns(final int n) {
        final String[] s = new String[n];
        for (int i = 0; i < n; i++) s[i] = fsc.next();
        return s;
    }
    public static boolean[][] grid(final int h, final int w, final char trueCharacter) {
        final boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            final char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) grid[i][j] = s[j] == trueCharacter;
        }
        return grid;
    }
}


final class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buffer);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buffer[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buffer[ptr] && buffer[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int acmp = readByte();
        while (33 <= acmp && acmp <= 126) {sb.appendCodePoint(acmp); acmp = readByte();}
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int acmp = readByte();
        if (acmp == '-') {minus = true; acmp = readByte();}
        if (acmp < '0' || '9' < acmp) throw new NumberFormatException();
        for (; ; acmp = readByte()) {
            if ('0' <= acmp && acmp <= '9') n = n * 10 + acmp - '0';
            else if (acmp == -1 || !(33 <= acmp && acmp <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
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
 */
final class IntArrayList implements Iterable<Integer> {
    private int[] a;
    private int tail = 0;
    private static final int DEFAULT_SIZE = 64;
    public IntArrayList(final int capacity) {this.a = new int[Math.max(1, capacity)];}
    public IntArrayList() {this(DEFAULT_SIZE);}
    public void add(final int v) {
        if (tail == a.length) grow();
        a[tail++] = v;
    }
    public int removeLast() {return a[tail--];}
    public int get(final int i) {
        if (i >= tail) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        return a[i];
    }
    public void set(final int i, final int v) {
        if (i >= tail) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        a[i] = v;
    }
    private void grow() {
        final int[] acmp = new int[a.length << 1];
        System.arraycopy(a, 0, acmp, 0, a.length);
        a = acmp;
    }
    public int size() {return tail;}
    public void reverse(final int begin, final int end) {IntArrays.reverse(a, begin, end);}
    public void reverse() {IntArrays.reverse(a, 0, tail);}
    public int[] toArray() {
        final int[] ret = new int[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }
    public boolean addIf(final int v, final IntPredicate p) {
        if (p.test(v)) {add(v); return true;}
        return false;
    }
    public void clear() {tail = 0;}
    public PrimitiveIterator.OfInt iterator() {return new IntArrayListIterator();}
    private class IntArrayListIterator implements PrimitiveIterator.OfInt {
        private int i = 0;
        public boolean hasNext() {return i < tail;}
        public int nextInt() {return a[i++];}
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * 1. DESTRUCTIVE methods for int arrays.
 * 2. methods that receives arrays and return some results (except for int arrays).
 */
final class IntArrays {
    private IntArrays(){}
    public static void swap(final int[] a, final int u, final int v) {
        final int tmp = a[u]; a[u] = a[v]; a[v] = tmp;
    }
    public static void reverse(final int[] a, final int begin, final int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) swap(a, i, begin + end - i - 1);
    }
    public static void reverse(final int[] a) {reverse(a, 0, a.length);}
    public static void sortDescending(final int[] a) {Arrays.sort(a); reverse(a);}
    public static int reduce(final int[] a, final IntBinaryOperator op) {
        int ret = a[0]; for (int i = 1; i < a.length; i++) ret = op.applyAsInt(ret, a[i]);
        return ret;
    }
    public static void map(final int[] a, final IntUnaryOperator op) {Arrays.setAll(a, i -> op.applyAsInt(a[i]));}
    public static int filter(final int[] src, final int[] dst, final IntPredicate p) {
        int idx = 0;
        for (final int e : src) if (p.test(e)) dst[idx++] = e;
        return idx;
    }
    public static int filterIndex(final int[] dst, final int beginIndex, final int endIndex, final IntPredicate p) {
        int idx = 0;
        for (int i = beginIndex; i < endIndex; i++) if (p.test(i)) dst[idx++] = i;
        return idx;
    }
    public static int filterIndex(final int dst[], final int endIndex, final IntPredicate p) {
        return filterIndex(dst, 0, endIndex, p);
    }
    public static void accumulate(final int[] a, final IntBinaryOperator op) {
        for (int i = 1; i < a.length; i++) a[i] = op.applyAsInt(a[i - 1], a[i]);
    }
    public static void accumulate(final int[] a) {
        for (int i = 1; i < a.length; i++) a[i] += a[i - 1];
    }
    public static void permute(int[] a, int[] p) {
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
    public static int compare(final int[] a, final int[] acmp) {
        for (int i = 0; i < a.length; i++) {
            if (i >= acmp.length) return -1;
            if (a[i] > acmp[i]) return 1;
            if (a[i] < acmp[i]) return -1;
        }
        return a.length < acmp.length ? 1 : 0;
    }
    public static boolean equals(final int[] a, final int[] acmp) {return compare(a, acmp) == 0;}
    public static String join(final int[] a, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
    public static String joinWithPrefixAndSuffix(final int[] a, final IntFunction<String> idxToPre, final IntFunction<String> idxToSuf, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(idxToPre.apply(i)).append(a[i]).append(idxToSuf.apply(i));
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
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
        this.sorted = LongArrayGenerator.unique(a);
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
    public long removeLast() {return a[tail--];}
    public long get(final int i) {
        if (i >= a.length) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        return a[i];
    }
    public void set(final int i, final long v) {
        if (i >= a.length) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        a[i] = v;
    }
    private void grow() {
        final long[] acmp = new long[a.length << 1];
        System.arraycopy(a, 0, acmp, 0, a.length);
        a = acmp;
    }
    public int size() {return tail;}
    public void reverse(final int begin, final int end) {LongArrays.reverse(a, begin, end);}
    public void reverse() {LongArrays.reverse(a, 0, tail);}
    public long[] toArray() {
        final long[] ret = new long[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }
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
