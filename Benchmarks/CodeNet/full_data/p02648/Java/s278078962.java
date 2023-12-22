import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import static java.lang.Math.max;



public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(out);
        pw.flush();
        pw.close();
    }
    static long[][] dp = new long[18][100001];;

    public static void solve(StringBuilder out) {
        int n = In.ni();
        int[] v = new int[1 << 18];
        int[] w = new int[1 << 18];
        for (int i = 1; i <= n; i++) {
            v[i] = In.ni();
            w[i] = In.ni();
        }
        int[][] memo = new int[1 << 9][100001];
        for (int i = 1; i < 1 << 9; i++) {
            for (int j = 1; j <= 100000; j++) {
                if (j >= w[i]) {
                    memo[i][j] = max(memo[i >> 1][j], memo[i >> 1][j - w[i]] + v[i]);
                } else {
                    memo[i][j] = memo[i >> 1][j];
                }
                memo[i][j] = max(memo[i][j], memo[i][j - 1]);
            }
        }
        int q = In.ni();
        for (int i = 0; i < q; i++) {
            int x = In.ni();
            int m = In.ni();
            if (x < 1 << 9) {
                out.append(memo[x][m]).append('\n');
                continue;
            }
            IntArrayList l = new IntArrayList(9);
            for (int y = x; y >= 1 << 9; y <<= 1) l.add(y);
            int max = 0;
            int sz = l.size();
            for (int k = 0; k < 1 << sz; k++) {
                int vs = 0, ws = 0;
                for (int b = 0; b < sz; b++) {
                    int u = l.get(b);
                    if (BitUtil.test(k, b)) {
                        vs += v[u];
                        ws += w[u];
                    }
                }
                if (ws > m) continue;
                max = max(max, vs + memo[x][m - ws]);
            }
            out.append(max).append('\n');
        }
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
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        for (; ; b = readByte()) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
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
        final int[] b = new int[a.length << 1];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
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
    public static int compare(final int[] a, final int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) return -1;
            if (a[i] > b[i]) return 1;
            if (a[i] < b[i]) return -1;
        }
        return a.length < b.length ? 1 : 0;
    }
    public static boolean equals(final int[] a, final int[] b) {return compare(a, b) == 0;}
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
final class BitUtil {
    private static final int[] INT_MASK = {
        0x0000_0000, 
        0x0000_0001, 0x0000_0003, 0x0000_0007, 0x0000_000f, 
        0x0000_001f, 0x0000_003f, 0x0000_007f, 0x0000_00ff, 
        0x0000_01ff, 0x0000_03ff, 0x0000_07ff, 0x0000_0fff,
        0x0000_1fff, 0x0000_3fff, 0x0000_7fff, 0x0000_ffff, 
        0x0001_ffff, 0x0003_ffff, 0x0007_ffff, 0x000f_ffff, 
        0x001f_ffff, 0x003f_ffff, 0x007f_ffff, 0x00ff_ffff, 
        0x01ff_ffff, 0x03ff_ffff, 0x07ff_ffff, 0x0fff_ffff, 
        0x1fff_ffff, 0x3fff_ffff, 0x7fff_ffff, 0xffff_ffff
    };
    private static final long[] LONG_MASK = {
        0x0000_0000_0000_0000l, 
        0x0000_0000_0000_0001l, 0x0000_0000_0000_0003l, 0x0000_0000_0000_0007l, 0x0000_0000_0000_000fl, 
        0x0000_0000_0000_001fl, 0x0000_0000_0000_003fl, 0x0000_0000_0000_007fl, 0x0000_0000_0000_00ffl, 
        0x0000_0000_0000_01ffl, 0x0000_0000_0000_03ffl, 0x0000_0000_0000_07ffl, 0x0000_0000_0000_0fffl,
        0x0000_0000_0000_1fffl, 0x0000_0000_0000_3fffl, 0x0000_0000_0000_7fffl, 0x0000_0000_0000_ffffl, 
        0x0000_0000_0001_ffffl, 0x0000_0000_0003_ffffl, 0x0000_0000_0007_ffffl, 0x0000_0000_000f_ffffl, 
        0x0000_0000_001f_ffffl, 0x0000_0000_003f_ffffl, 0x0000_0000_007f_ffffl, 0x0000_0000_00ff_ffffl, 
        0x0000_0000_01ff_ffffl, 0x0000_0000_03ff_ffffl, 0x0000_0000_07ff_ffffl, 0x0000_0000_0fff_ffffl, 
        0x0000_0000_1fff_ffffl, 0x0000_0000_3fff_ffffl, 0x0000_0000_7fff_ffffl, 0x0000_0000_ffff_ffffl,
        0x0000_0001_ffff_ffffl, 0x0000_0003_ffff_ffffl, 0x0000_0007_ffff_ffffl, 0x0000_000f_ffff_ffffl, 
        0x0000_001f_ffff_ffffl, 0x0000_003f_ffff_ffffl, 0x0000_007f_ffff_ffffl, 0x0000_00ff_ffff_ffffl, 
        0x0000_01ff_ffff_ffffl, 0x0000_03ff_ffff_ffffl, 0x0000_07ff_ffff_ffffl, 0x0000_0fff_ffff_ffffl,
        0x0000_1fff_ffff_ffffl, 0x0000_3fff_ffff_ffffl, 0x0000_7fff_ffff_ffffl, 0x0000_ffff_ffff_ffffl, 
        0x0001_ffff_ffff_ffffl, 0x0003_ffff_ffff_ffffl, 0x0007_ffff_ffff_ffffl, 0x000f_ffff_ffff_ffffl, 
        0x001f_ffff_ffff_ffffl, 0x003f_ffff_ffff_ffffl, 0x007f_ffff_ffff_ffffl, 0x00ff_ffff_ffff_ffffl, 
        0x01ff_ffff_ffff_ffffl, 0x03ff_ffff_ffff_ffffl, 0x07ff_ffff_ffff_ffffl, 0x0fff_ffff_ffff_ffffl, 
        0x1fff_ffff_ffff_ffffl, 0x3fff_ffff_ffff_ffffl, 0x7fff_ffff_ffff_ffffl, 0xffff_ffff_ffff_ffffl
    };
    private BitUtil(){}
    public static boolean test(final long n, final int bit) {return (n & (1l << bit)) != 0;}
    public static boolean test(final int n, final int bit) {return (n & (1 << bit)) != 0;}
    public static long set(final long n, final int bit) {return n | (1l << bit);}
    public static int set(final int n, final int bit) {return n | (1 << bit);}
    public static long set(final long n, final int from, final int to) {return n | (LONG_MASK[to - from] << from);}
    public static int set(final int n, final int from, final int to) {return n | (INT_MASK[to - from] << from);}
    public static long set(final long n, final int bit, final boolean b) {return b ? n | (1l << bit) : n & ~(1l << bit);}
    public static int set(final int n, final int bit, final boolean b) {return b ? n | (1 << bit) : n & ~(1 << bit);}
    public static long set(final long n, final int from, final int to, final boolean b) {return b ? n | (LONG_MASK[to - from] << from) : n & ~(LONG_MASK[to - from] << from);}
    public static int set(final int n, final int from, final int to, final boolean b) {return b ? n | (INT_MASK[to - from] << from) : n & ~(INT_MASK[to - from] << from);}
    public static long clear(final long n, final int bit) {return n & ~(1l << bit);}
    public static int clear(final int n, final int bit) {return n & ~(1 << bit);}
    public static long clear(final long n, final int from, final int to) {return n & ~(LONG_MASK[to - from] << from);}
    public static int clear(final int n, final int from, final int to) {return n & ~(INT_MASK[to - from] << from);}
    public static long mask(final long n, final int bit) {return n & (1l << bit);}
    public static int mask(final int n, final int bit) {return n & (1 << bit);}
    public static long mask(final long n, final int from, final int to) {return n & (LONG_MASK[to - from] << from);}
    public static int mask(final int n, final int from, final int to) {return n & (INT_MASK[to - from] << from);}
    public static int get(final long n, final int bit) {return (n & (1l << bit)) == 0 ? 1 : 0;}
    public static int get(final int n, final int bit) {return (n & (1 << bit)) == 0 ? 1 : 0;}
    public static long flip(final long n, final int bit) {return n ^ (1l << bit);}
    public static int flip(final int n, final int bit) {return n ^ (1 << bit);}
    public static long flip(final long n, final int from, final int to) {return n ^ (LONG_MASK[to - from] << from);}
    public static int flip(final int n, final int from, final int to) {return n ^ (INT_MASK[to - from] << from);}
    public static ArrayList<Integer> ones(final long n) {
        final ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < Long.SIZE; i++) if (test(n, i)) l.add(i);
        return l;
    }
    public static ArrayList<Integer> ones(final int n) {
        final ArrayList<Integer> set = new ArrayList<>();
        for (int i = 0; i < Integer.SIZE; i++) if (test(n, i)) set.add(i);
        return set;
    }
    public static int msbPlace(final long n) {return Long.SIZE - Long.numberOfLeadingZeros(n) - 1;}
    public static int msbPlace(final int n) {return Integer.SIZE - Integer.numberOfLeadingZeros(n) - 1;}
    public static int lsbPlace(final long n) {return Long.numberOfTrailingZeros(n);}
    public static int lsbPlace(final int n) {return Integer.numberOfTrailingZeros(n);}
}
