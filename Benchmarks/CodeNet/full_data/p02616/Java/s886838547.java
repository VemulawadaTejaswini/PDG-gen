import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.io.BufferedOutputStream;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.io.Writer;
import java.io.BufferedReader;
import java.util.Comparator;
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
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        EMultiplication4 solver = new EMultiplication4();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMultiplication4 {
        private static final int MOD = (int) 1e9 + 7;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints(), k = in.ints();

            int pos = 0, neg = 0, zeros = 0;
            Long[] original = new Long[n];
            for (int i = 0; i < n; i++) original[i] = in.longs();
            long[] a = new long[n], b = new long[n];
            for (int i = 0; i < n; i++) {
                long x = original[i];
                if (x > 0) a[pos++] = x;
                else if (x < 0) b[neg++] = -x;
                else zeros++;
            }
            if (pos + neg < k) {
                out.ans(0).ln();
                return;
            } else if (k == 1) {
                out.ans(original[n - 1]).ln();
                return;
            } else if (pos < k && (k - pos) % 2 == 1) {
                IntroSort.sort(original, Comparator.comparing(Math::abs));
                long ans = 1;
                for (int i = 0; i < k; i++) {
                    ans *= (original[i] + MOD) % MOD;
                    ans %= MOD;
                }
                out.ans(ans).ln();
                return;
            }
            IntroSort.sort(original);
            a = Arrays.copyOf(a, pos);
            b = Arrays.copyOf(b, neg);
            //System.out.println(Arrays.toString(a));
            //System.out.println(Arrays.toString(b));
            IntroSort.sort(a);
            IntroSort.sort(b);
            ArrayUtil.reverse(a, 0, pos);
            ArrayUtil.reverse(b, 0, neg);
            EMultiplication4.Entry[] entries = new EMultiplication4.Entry[pos / 2 + neg / 2];
            for (int i = 0; i * 2 + 1 < pos; i++)
                entries[i] = new EMultiplication4.Entry(true, i * 2, a[i * 2] * a[i * 2 + 1]);
            for (int i = 0; i * 2 + 1 < neg; i++)
                entries[i + pos / 2] = new EMultiplication4.Entry(false, i * 2, b[i * 2] * b[i * 2 + 1]);
            IntroSort.sort(entries, Comparator.comparing(entry -> -entry.value));

            long ans = 1;
            int cur = 0, curX = 0, curY = 0;
            while (k >= 2 && cur < entries.length) {
                //System.out.println(entries[cur]);
                ans *= entries[cur].value % MOD;
                ans %= MOD;
                if (entries[cur].pos) curX = entries[cur].index + 2;
                else curY = entries[cur].index + 2;
                k -= 2;
                cur++;
            }
            //System.out.println(curX + " " + curY + " " + pos + " " + neg + " " + ans);

            if (k == 0) {

                out.ans(ans).ln();
            } else if (curX >= pos && curY >= neg) {
                out.ans(0).ln();
            } else if (curX >= pos) {
                throw new RuntimeException();
            } else {
                ans *= a[curX] % MOD;
                ans %= MOD;
                out.ans(ans).ln();
            }
        }

        private static class Entry {
            boolean pos;
            int index;
            long value;

            Entry(boolean pos, int index, long value) {
                this.pos = pos;
                this.index = index;
                this.value = value;
            }

            public String toString() {
                return "Entry{" +
                        "pos=" + pos +
                        ", index=" + index +
                        ", value=" + value +
                        '}';
            }

        }

    }

    static class LightScanner implements AutoCloseable {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public long longs() {
            return Long.parseLong(string());
        }

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class InsertionSort {
        private InsertionSort() {
        }

        static <T> void sort(T[] a, int low, int high, Comparator<? super T> comparator) {
            for (int i = low; i < high; i++) {
                for (int j = i; j > low && comparator.compare(a[j - 1], a[j]) > 0; j--) {
                    ArrayUtil.swap(a, j - 1, j);
                }
            }
        }

        static void sort(long[] a, int low, int high) {
            for (int i = low; i < high; i++) {
                for (int j = i; j > low && a[j - 1] > a[j]; j--) {
                    ArrayUtil.swap(a, j - 1, j);
                }
            }
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

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
        }

        public LightWriter ans(Object obj) {
            return ans(Objects.toString(obj));
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

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void reverse(long[] a, int left, int right) {
            right--;
            while (left < right) {
                long temp = a[left];
                a[left++] = a[right];
                a[right--] = temp;
            }
        }

        public static <T> void swap(T[] a, int x, int y) {
            T t = a[x];
            a[x] = a[y];
            a[y] = t;
        }

        public static void swap(long[] a, int x, int y) {
            long t = a[x];
            a[x] = a[y];
            a[y] = t;
        }

    }

    static class IntroSort {
        private static int INSERTIONSORT_THRESHOLD = 16;

        private IntroSort() {
        }

        static <T> void sort(T[] a, int low, int high, int maxDepth, Comparator<T> comparator) {
            while (high - low > INSERTIONSORT_THRESHOLD) {
                if (maxDepth-- == 0) {
                    HeapSort.sort(a, low, high, comparator);
                    return;
                }
                int cut = QuickSort.step(a, low, high, comparator);
                sort(a, cut, high, maxDepth, comparator);
                high = cut;
            }
            InsertionSort.sort(a, low, high, comparator);
        }

        public static <T> void sort(T[] a, Comparator<T> comparator) {
            if (a.length <= INSERTIONSORT_THRESHOLD) {
                InsertionSort.sort(a, 0, a.length, comparator);
            } else {
                sort(a, 0, a.length, 2 * BitMath.msb(a.length), comparator);
            }
        }

        public static <T extends Comparable<T>> void sort(T[] a) {
            sort(a, Comparator.naturalOrder());
        }

        static void sort(long[] a, int low, int high, int maxDepth) {
            while (high - low > INSERTIONSORT_THRESHOLD) {
                if (maxDepth-- == 0) {
                    HeapSort.sort(a, low, high);
                    return;
                }
                int cut = QuickSort.step(a, low, high);
                sort(a, cut, high, maxDepth);
                high = cut;
            }
            InsertionSort.sort(a, low, high);
        }

        public static void sort(long[] a) {
            if (a.length <= INSERTIONSORT_THRESHOLD) {
                InsertionSort.sort(a, 0, a.length);
            } else {
                sort(a, 0, a.length, 2 * BitMath.msb(a.length));
            }
        }

    }

    static class QuickSort {
        private QuickSort() {
        }

        private static <T> void med(T[] a, int low, int x, int y, int z, Comparator<? super T> comparator) {
            if (comparator.compare(a[z], a[x]) < 0) {
                ArrayUtil.swap(a, low, x);
            } else if (comparator.compare(a[y], a[z]) < 0) {
                ArrayUtil.swap(a, low, y);
            } else {
                ArrayUtil.swap(a, low, z);
            }
        }

        static <T> int step(T[] a, int low, int high, Comparator<? super T> comparator) {
            int x = low + 1, y = low + (high - low) / 2, z = high - 1;
            if (comparator.compare(a[x], a[y]) < 0) {
                med(a, low, x, y, z, comparator);
            } else {
                med(a, low, y, x, z, comparator);
            }

            int lb = low + 1, ub = high;
            while (true) {
                while (comparator.compare(a[lb], a[low]) < 0) {
                    lb++;
                }
                ub--;
                while (comparator.compare(a[low], a[ub]) < 0) {
                    ub--;
                }
                if (lb >= ub) {
                    return lb;
                }
                ArrayUtil.swap(a, lb, ub);
                lb++;
            }
        }

        private static void med(long[] a, int low, int x, int y, int z) {
            if (a[z] < a[x]) {
                ArrayUtil.swap(a, low, x);
            } else if (a[y] < a[z]) {
                ArrayUtil.swap(a, low, y);
            } else {
                ArrayUtil.swap(a, low, z);
            }
        }

        static int step(long[] a, int low, int high) {
            int x = low + 1, y = low + (high - low) / 2, z = high - 1;
            if (a[x] < a[y]) {
                med(a, low, x, y, z);
            } else {
                med(a, low, y, x, z);
            }

            int lb = low + 1, ub = high;
            while (true) {
                while (a[lb] < a[low]) {
                    lb++;
                }
                ub--;
                while (a[low] < a[ub]) {
                    ub--;
                }
                if (lb >= ub) {
                    return lb;
                }
                ArrayUtil.swap(a, lb, ub);
                lb++;
            }
        }

    }

    static interface Verified {
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

    static class HeapSort {
        private HeapSort() {
        }

        private static <T> void heapfy(T[] a, int low, int high, int i, T val, Comparator<? super T> comparator) {
            int child = 2 * i - low + 1;
            while (child < high) {
                if (child + 1 < high && comparator.compare(a[child], a[child + 1]) < 0) {
                    child++;
                }
                if (comparator.compare(val, a[child]) >= 0) {
                    break;
                }
                a[i] = a[child];
                i = child;
                child = 2 * i - low + 1;
            }
            a[i] = val;
        }

        static <T> void sort(T[] a, int low, int high, Comparator<T> comparator) {
            for (int p = (high + low) / 2 - 1; p >= low; p--) {
                heapfy(a, low, high, p, a[p], comparator);
            }
            while (high > low) {
                high--;
                T pval = a[high];
                a[high] = a[low];
                heapfy(a, low, high, low, pval, comparator);
            }
        }

        private static void heapfy(long[] a, int low, int high, int i, long val) {
            int child = 2 * i - low + 1;
            while (child < high) {
                if (child + 1 < high && a[child] < a[child + 1]) {
                    child++;
                }
                if (val >= a[child]) {
                    break;
                }
                a[i] = a[child];
                i = child;
                child = 2 * i - low + 1;
            }
            a[i] = val;
        }

        static void sort(long[] a, int low, int high) {
            for (int p = (high + low) / 2 - 1; p >= low; p--) {
                heapfy(a, low, high, p, a[p]);
            }
            while (high > low) {
                high--;
                long pval = a[high];
                a[high] = a[low];
                heapfy(a, low, high, low, pval);
            }
        }

    }
}

