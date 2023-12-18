import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import static java.lang.Math.min;



public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(out);
        pw.flush();
        pw.close();
    }

    public static void solve(StringBuilder out) {
        int n = In.ni();
        int m = In.ni();
        int[] c = new int[m];
        int[] x = In.ni(n);
        RadixSort.sort(x);
        int[] s = new int[m];
        int t = 1;
        for (int i = 0; i < n; i++) {
            c[x[i] % m]++;
            if (i > 0) {
                if (x[i] == x[i - 1]) {
                    t++;
                } else {
                    s[x[i - 1] % m] += t >> 1;
                    t = 1;
                }
            }
        }
        s[x[n - 1] % m] += t >> 1;
        int a = 0;
        for (int i = 0, h = m >> 1; i <= h; i++) {
            if (i == m - i || i == 0) {
                a += c[i] >> 1;
            } else {
                if (c[i] < c[m - i]) {
                    a += c[i];
                    a += min((c[m - i] - c[i]) >> 1, s[i]);
                } else {
                    a += c[m - i];
                    a += min((c[i] - c[m - i]) >> 1, s[i]);
                }
            }
        }
        out.append(a);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class In {
    public static final FastScanner fsc = new FastScanner();

    public static int ni() {
        return fsc.nextInt();
    }

    public static int ni(final IntUnaryOperator f) {
        return f.applyAsInt(fsc.nextInt());
    }

    public static int[] ni(final int n) {
        final int[] a = new int[n];
        Arrays.setAll(a, i -> fsc.nextInt());
        return a;
    }

    public static int[] ni(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        Arrays.setAll(a, i -> ni(f));
        return a;
    }

    public static int[][] ni(final int n, final int m) {
        final int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m));
        return a;
    }

    public static int[][] ni(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m, f));
        return a;
    }

    public static long nl() {
        return fsc.nextLong();
    }

    public static long nl(final LongUnaryOperator f) {
        return f.applyAsLong(fsc.nextLong());
    }

    public static long[] nl(final int n) {
        final long[] a = new long[n];
        Arrays.setAll(a, i -> fsc.nextLong());
        return a;
    }

    public static long[] nl(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        Arrays.setAll(a, i -> nl(f));
        return a;
    }

    public static long[][] nl(final int n, final int m) {
        final long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m));
        return a;
    }

    public static long[][] nl(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m, f));
        return a;
    }

    public static char[] nc() {
        return fsc.next().toCharArray();
    }

    public static char[][] nc(final int n, final int m) {
        final char[][] c = new char[n][m];
        Arrays.setAll(c, i -> nc());
        return c;
    }

    public static double nd() {
        return fsc.nextDouble();
    }

    public static double nd(final DoubleUnaryOperator f) {
        return f.applyAsDouble(fsc.nextDouble());
    }

    public static double[] nd(final int n) {
        final double[] a = new double[n];
        Arrays.setAll(a, i -> fsc.nextDouble());
        return a;
    }

    public static double[] nd(final int n, final DoubleUnaryOperator f) {
        final double[] a = new double[n];
        Arrays.setAll(a, i -> nd(f));
        return a;
    }

    public static double[][] nd(final int n, final int m) {
        final double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m));
        return a;
    }

    public static double[][] nd(final int n, final int m, final DoubleUnaryOperator f) {
        final double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m, f));
        return a;
    }

    public static String ns() {
        return fsc.next();
    }

    public static String[] ns(final int n) {
        final String[] s = new String[n];
        Arrays.setAll(s, i -> ns());
        return s;
    }

    public static boolean[][] grid(final int h, final int w, final char trueCharacter) {
        final boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            final char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                grid[i][j] = s[j] == trueCharacter;
            }
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
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (final IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(final int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        final long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

final class InsertionSort {
    protected static void sort(final int[] a) {
        sort(a, 0, a.length);
    }

    protected static void sort(final int[] a, final int from, final int to) {
        for (int i = from + 1; i < to; i++) {
            final int tmp = a[i];
            if (a[i - 1] > tmp) {
                int j = i;
                do {
                    a[j] = a[j - 1];
                    j--;
                } while (j > from && a[j - 1] > tmp);
                a[j] = tmp;
            }
        }
    }

    protected static void sort(final long[] a) {
        sort(a, 0, a.length);
    }

    protected static void sort(final long[] a, final int from, final int to) {
        for (int i = from + 1; i < to; i++) {
            final long tmp = a[i];
            if (a[i - 1] > tmp) {
                int j = i;
                do {
                    a[j] = a[j - 1];
                    j--;
                } while (j > from && a[j - 1] > tmp);
                a[j] = tmp;
            }
        }
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
        final int tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static void reverse(final int[] a, final int begin, final int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) {
            swap(a, i, begin + end - i - 1);
        }
    }

    public static void reverse(final int[] a) {
        reverse(a, 0, a.length);
    }

    public static void sortDescending(final int[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static int reduce(final int[] a, final IntBinaryOperator op) {
        int ret = a[0];
        for (int i = 1; i < a.length; i++) {
            ret = op.applyAsInt(ret, a[i]);
        }
        return ret;
    }

    public static void map(final int[] a, final IntUnaryOperator op) {
        Arrays.setAll(a, i -> op.applyAsInt(a[i]));
    }

    public static void filter(final int[] src, final int[] dst, final IntPredicate p) {
        int idx = 0;
        for (final int e : src) {
            if (p.test(e)) {
                dst[idx++] = e;
            }
        }
    }

    public static void filterIndex(final int[] dst, final int beginIndex, final int endIndex, final IntPredicate p) {
        for (int i = beginIndex, idx = 0; i < endIndex; i++) {
            if (p.test(i)) {
                dst[idx++] = i;
            }
        }
    }

    public static void filterIndex(final int dst[], final int endIndex, final IntPredicate p) {
        filterIndex(dst, 0, endIndex, p);
    }

    public static void accumulate(final int[] a, final IntBinaryOperator op) {
        for (int i = 1; i < a.length; i++) {
            a[i] = op.applyAsInt(a[i - 1], a[i]);
        }
    }

    public static void accumulate(final int[] a) {
        for (int i = 1; i < a.length; i++) {
            a[i] += a[i - 1];
        }
    }

    public static int unique(int[] a) {
        final HashSet<Integer> set = new HashSet<>();
        for (final int e : a) {
            set.add(e);
        }
        final int m = set.size();
        final int[] b = new int[m];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                b[index++] = a[i];
                set.remove(a[i]);
            }
        }
        a = b;
        return m;
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

    public static void transpose(int[][] a) {
        final int n = a.length;
        final int m = a[0].length;
        final int[][] ret = new int[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        a = ret;
    }

    public static int compare(final int[] a, final int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) {
                return -1;
            } else if (a[i] > b[i]) {
                return 1;
            } else if (a[i] < b[i]) {
                return -1;
            }
        }
        if (a.length < b.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean equals(final int[] a, final int[] b) {
        return compare(a, b) == 0;
    }

    public static String join(final int[] a, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }

    public static String joinWithPrefixAndSuffix(final int[] a, final IntFunction<String> idxToPre,
            final IntFunction<String> idxToSuf, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(idxToPre.apply(i)).append(a[i]).append(idxToSuf.apply(i));
            if (i < a.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class RadixSort {
    private static final int INT_INSERTION_SORT_THRESHOLD = 120;
    private static final int LONG_INSERTION_SORT_THRESHOLD = 250;

    private static final int BUCKET_SIZE = 256;
    private static final int BUCKET_HALF_SIZE = 128;
    private static final int INT_RECURSION = 4;
    private static final int LONG_RECURSION = 8;
    private static final int SHIFT = 3;
    private static final int MASK = 0xff;

    public static void sort(final int[] a) {
        sort(a, 0, a.length);
    }

    public static void sortDescending(final int[] a) {
        sortDescending(a, 0, a.length);
    }

    public static void sort(final int[] a, final int from, final int to) {
        if (to - from <= INT_INSERTION_SORT_THRESHOLD) {
            InsertionSort.sort(a, from, to);
            return;
        }
        final int len = to - from;
        final int[] bucket = new int[len];
        final int[] cnt = new int[BUCKET_SIZE + 1];
        for (int l = 0;;) {
            final int shift = l << SHIFT;
            for (int i = from; i < to; i++) {
                cnt[((a[i] >>> shift) & MASK) + 1]++;
            }
            for (int i = 0, j = 1; i < BUCKET_SIZE; i = j, j++) {
                cnt[j] += cnt[i];
            }
            final int positive = cnt[BUCKET_HALF_SIZE];
            for (int i = from; i < to; i++) {
                final int v = a[i];
                bucket[cnt[(v >>> shift) & MASK]++] = v;
            }
            if (++l == INT_RECURSION) {
                final int negative = len - positive;
                System.arraycopy(bucket, positive, a, from, negative);
                System.arraycopy(bucket, 0, a, from + negative, positive);
                return;
            }
            System.arraycopy(bucket, 0, a, from, len);
            Arrays.fill(cnt, 0);
        }
    }

    public static void sortDescending(final int[] a, final int from, final int to) {
        sort(a, from, to);
        int l = from, r = to - 1;
        while (l < r) {
            final int tmp = a[l];
            a[l] = a[r];
            a[r] = tmp;
            l++;
            r--;
        }
    }

    public static void sort(final long[] a) {
        sort(a, 0, a.length);
    }

    public static void sortDescending(final long[] a) {
        sortDescending(a, 0, a.length);
    }

    public static void sort(final long[] a, final int from, final int to) {
        if (to - from <= LONG_INSERTION_SORT_THRESHOLD) {
            InsertionSort.sort(a, from, to);
            return;
        }
        final int len = to - from;
        final long[] bucket = new long[len];
        final int[] cnt = new int[BUCKET_SIZE + 1];
        for (int l = 0;;) {
            final int shift = l << SHIFT;
            for (int i = from; i < to; i++) {
                cnt[(int) (((a[i] >>> shift) & MASK) + 1)]++;
            }
            for (int i = 0, j = 1; i < BUCKET_SIZE; i = j, j++) {
                cnt[j] += cnt[i];
            }
            final int positive = cnt[BUCKET_HALF_SIZE];
            for (int i = from; i < to; i++) {
                final int bi = (int) ((a[i] >>> shift) & MASK);
                bucket[cnt[bi]++] = a[i];
            }
            if (++l == LONG_RECURSION) {
                final int negative = len - positive;
                System.arraycopy(bucket, positive, a, from, negative);
                System.arraycopy(bucket, 0, a, from + negative, positive);
                return;
            }
            System.arraycopy(bucket, 0, a, from, len);
            Arrays.fill(cnt, 0);
        }
    }

    public static void sortDescending(final long[] a, final int from, final int to) {
        sort(a, from, to);
        int l = from, r = to - 1;
        while (l < r) {
            final long tmp = a[l];
            a[l] = a[r];
            a[r] = tmp;
            l++; r--;
        }
    }
}
