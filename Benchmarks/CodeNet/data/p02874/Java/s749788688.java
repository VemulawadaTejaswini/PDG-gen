import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


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
        int[] l = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = In.ni();
            r[i] = In.ni();
        }
        DependentSort.sortDescending(l, r);
        int[] fm = new int[n + 1];
        int[] bm = new int[n + 1];
        fm[0] = Const.IINF;
        bm[n] = Const.IINF;
        for (int i = 0; i < n; i++) {
            fm[i + 1] = Math.min(fm[i], r[i]);
            bm[i] = Math.min(bm[i + 1], r[i]);
        }
        int max = 0;
        int l1 = l[0];
        for (int i = 1; i < n; i++) {
            int l2 = l[i];
            int r1 = fm[i];
            int r2 = r[i];
            int mr = bm[i + 1];
            int v1 = (r1 - l1 + 1) + Math.max(0, (Math.min(mr, r2) - l2 + 1));
            int v2 = Math.max(0, (Math.min(mr, r1) - l1 + 1)) + (r2 - l2 + 1);
            max = Math.max(max, Math.max(v1, v2));
        }
        out.append(max);
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

@FunctionalInterface
interface IntComparator {
    public int compare(int i, int j);

    public default boolean eq(final int i, final int j) {
        return compare(i, j) == 0;
    }

    public default boolean ne(final int i, final int j) {
        return compare(i, j) != 0;
    }

    public default boolean gt(final int i, final int j) {
        return compare(i, j) > 0;
    }

    public default boolean ge(final int i, final int j) {
        return compare(i, j) >= 0;
    }

    public default boolean lt(final int i, final int j) {
        return compare(i, j) < 0;
    }

    public default boolean le(final int i, final int j) {
        return compare(i, j) <= 0;
    }
}

final class DependentSort {
    public static void sort(int[] a, Object... dependentArrays) {
        sort(a, false, dependentArrays);
    }

    public static void sortDescending(int[] a, Object... dependentArrays) {
        sort(a, true, dependentArrays);
    }

    private static void sort(int[] a, boolean descending, Object... dependentArrays) {
        int n = a.length;
        int[] p;
        if (descending) {
            p = IndexSort.sortDescending(a);
            RadixSort.sortDescending(a);
        } else {
            p = IndexSort.sort(a);
            RadixSort.sort(a);
        }
        boolean[] settled = new boolean[n];
        boolean ok = true;
        for (Object obj : dependentArrays) {
            if (obj instanceof int[]) {
                int[] arr = (int[]) obj;
                for (int i = 0; i < n; i++) {
                    for (int j = i; ok ^ settled[j]; j = p[j]) {
                        if (p[j] == i) {
                            settled[j] = !settled[j];
                            break;
                        }
                        int tmp = arr[j];
                        arr[j] = arr[p[j]];
                        arr[p[j]] = tmp;
                        settled[j] = !settled[j];
                    }
                }
            } else if (obj instanceof long[]) {
                long[] arr = (long[]) obj;
                for (int i = 0; i < n; i++) {
                    for (int j = i; ok ^ settled[j]; j = p[j]) {
                        if (p[j] == i) {
                            settled[j] = !settled[j];
                            break;
                        }
                        long tmp = arr[j];
                        arr[j] = arr[p[j]];
                        arr[p[j]] = tmp;
                        settled[j] = !settled[j];
                    }
                }
            } else {
                throw new UnsupportedOperationException("dependent objects musst be int[] or long[] type.");
            }
            ok = !ok;
        }
    }

    public static void sort(long[] a, Object... dependentArrays) {
        sort(a, false, dependentArrays);
    }

    public static void sortDescending(long[] a, Object... dependentArrays) {
        sort(a, true, dependentArrays);
    }

    private static void sort(long[] a, boolean descending, Object... dependentArrays) {
        int n = a.length;
        int[] p;
        if (descending) {
            p = IndexSort.sortDescending(a);
            RadixSort.sortDescending(a);
        } else {
            p = IndexSort.sort(a);
            RadixSort.sort(a);
        }
        boolean[] settled = new boolean[n];
        boolean ok = true;
        for (Object obj : dependentArrays) {
            if (obj instanceof int[]) {
                int[] arr = (int[]) obj;
                for (int i = 0; i < n; i++) {
                    for (int j = i; ok ^ settled[j]; j = p[j]) {
                        if (p[j] == i) {
                            settled[j] = !settled[j];
                            break;
                        }
                        int tmp = arr[j];
                        arr[j] = arr[p[j]];
                        arr[p[j]] = tmp;
                        settled[j] = !settled[j];
                    }
                }
            } else if (obj instanceof long[]) {
                long[] arr = (long[]) obj;
                for (int i = 0; i < n; i++) {
                    for (int j = i; ok ^ settled[j]; j = p[j]) {
                        if (p[j] == i) {
                            settled[j] = !settled[j];
                            break;
                        }
                        long tmp = arr[j];
                        arr[j] = arr[p[j]];
                        arr[p[j]] = tmp;
                        settled[j] = !settled[j];
                    }
                }
            } else {
                throw new UnsupportedOperationException("dependent objects musst be int[] or long[] type.");
            }
            ok = !ok;
        }
    }
}


final class IndexSort {
    public static int[] sort(final int[] a) {
        final int[] index = new int[a.length];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> a[i] - a[j]);
        return index;
    }

    public static int[] sortDescending(final int[] a) {
        final int[] index = new int[a.length];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> a[j] - a[i]);
        return index;
    }

    public static int[] sort(final long[] a) {
        final int[] index = new int[a.length];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> Long.compare(a[i], a[j]));
        return index;
    }

    public static int[] sortDescending(final long[] a) {
        final int[] index = new int[a.length];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> Long.compare(a[j], a[i]));
        return index;
    }
}

@FunctionalInterface
interface LongComparator {
    public int compare(long i, long j);

    public default boolean eq(final long i, final long j) {
        return compare(i, j) == 0;
    }

    public default boolean ne(final long i, final long j) {
        return compare(i, j) != 0;
    }

    public default boolean gt(final long i, final long j) {
        return compare(i, j) > 0;
    }

    public default boolean ge(final long i, final long j) {
        return compare(i, j) >= 0;
    }

    public default boolean lt(final long i, final long j) {
        return compare(i, j) < 0;
    }

    public default boolean le(final long i, final long j) {
        return compare(i, j) <= 0;
    }
}


final class ComparativeMergeSort {
    private static int INSERTION_SORT_THRESHOLD = 60;

    public static void sort(final int[] a, final IntComparator comparator) {
        sort(a, 0, a.length, comparator);
    }

    public static void sort(final int[] a, final int begin, final int end, final IntComparator comparator) {
        for (int i = begin;;) {
            final int j = i + INSERTION_SORT_THRESHOLD;
            if (j < end) {
                ComparativeInsertionSort.sort(a, i, j, comparator);
            } else {
                ComparativeInsertionSort.sort(a, i, end, comparator);
                break;
            }
            i = j;
        }
        final int len = end - begin;
        final int[] work = new int[len];
        for (int block = INSERTION_SORT_THRESHOLD; block <= len; block <<= 1) {
            final int twoBlocks = block << 1;
            for (int from = begin, max = end - block; from < max; from += twoBlocks) {
                final int mid = from + block;
                final int to = Math.min(from + twoBlocks, end);
                System.arraycopy(a, from, work, 0, block);
                for (int i = from, wi = 0, ti = mid;; i++) {
                    if (ti == to) {
                        System.arraycopy(work, wi, a, i, block - wi);
                        break;
                    } else if (comparator.gt(work[wi], a[ti])) {
                        a[i] = a[ti++];
                    } else {
                        a[i] = work[wi++];
                        if (wi == block) {
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void sort(final long[] a, final LongComparator comparator) {
        sort(a, 0, a.length, comparator);
    }

    public static void sort(final long[] a, final int begin, final int end, final LongComparator comparator) {
        for (int i = begin;;) {
            final int j = i + INSERTION_SORT_THRESHOLD;
            if (j < end) {
                ComparativeInsertionSort.sort(a, i, j, comparator);
            } else {
                ComparativeInsertionSort.sort(a, i, end, comparator);
                break;
            }
            i = j;
        }
        final int len = end - begin;
        final long[] work = new long[len];
        for (int block = INSERTION_SORT_THRESHOLD; block <= len; block <<= 1) {
            final int twoBlocks = block << 1;
            for (int from = begin, max = end - block; from < max; from += twoBlocks) {
                final int mid = from + block;
                final int to = Math.min(from + twoBlocks, end);
                System.arraycopy(a, from, work, 0, block);
                for (int i = from, wi = 0, ti = mid;; i++) {
                    if (ti == to) {
                        System.arraycopy(work, wi, a, i, block - wi);
                        break;
                    } else if (comparator.gt(work[wi], a[ti])) {
                        a[i] = a[ti++];
                    } else {
                        a[i] = work[wi++];
                        if (wi == block) {
                            break;
                        }
                    }
                }
            }
        }
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static final long MOD99 = 998_244_353;

    public static final long LINF = Long.MAX_VALUE >> 2;
    public static final int IINF = Integer.MAX_VALUE >> 1;
    public static final double DINF = 1e150;

    public static final double SDELTA = 1e-12;
    public static final double DELTA = 1e-9;
    public static final double LDELTA = 1e-6;

    public static final String YES = "YES";
    public static final String NO = "NO";
    public static final String Yes = "Yes";
    public static final String No = "No";
    public static final String POSSIBLE = "POSSIBLE";
    public static final String IMPOSSIBLE = "IMPOSSIBLE";
    public static final String Possible = "Possible";
    public static final String Impossible = "Impossible";

    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx = {1, 0, -1, 0};
    public static final int[] dy = {0, 1, 0, -1};

    private Const(){}
}


final class ComparativeInsertionSort {
    public static void sort(final int[] a, final int from, final int to, final IntComparator comparator) {
        for (int i = from + 1; i < to; i++) {
            final int tmp = a[i];
            if (comparator.gt(a[i - 1], tmp)) {
                int j = i;
                do {
                    a[j] = a[j - 1];
                    j--;
                } while (j > from && comparator.gt(a[j - 1], tmp));
                a[j] = tmp;
            }
        }
    }

    public static void sort(final long[] a, final int from, final int to, final LongComparator comparator) {
        for (int i = from + 1; i < to; i++) {
            final long tmp = a[i];
            if (comparator.gt(a[i - 1], tmp)) {
                int j = i;
                do {
                    a[j] = a[j - 1];
                    j--;
                } while (j > from && comparator.gt(a[j - 1], tmp));
                a[j] = tmp;
            }
        }
    }
}
