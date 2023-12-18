import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        BTwoContests solver = new BTwoContests();
        solver.solve(1, in, out);
        out.close();
    }

    static class BTwoContests {
        private static final Comparator<BTwoContests.Seg> R_INC = Comparator.comparing(seg -> seg.r);
        private static final Comparator<BTwoContests.Seg> R_DEC = Comparator.comparing(seg -> -seg.r);
        private static final Comparator<BTwoContests.Seg> L_INC = Comparator.comparing(seg -> seg.l);
        private static final Comparator<BTwoContests.Seg> L_DEC = Comparator.comparing(seg -> -seg.l);

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints();
            BTwoContests.Seg[] segs = new BTwoContests.Seg[n];
            for (int i = 0; i < n; i++) segs[i] = new BTwoContests.Seg(in.longs(), in.longs());

            long ans = 0;

            pattern1:
            {
                IntroSort.sort(segs, R_INC.thenComparing(L_INC));
                long[] maxL = new long[n + 1], minR = new long[n + 1];
                minR[n] = Long.MAX_VALUE;
                for (int i = n - 1; i >= 0; i--) {
                    maxL[i] = Math.max(maxL[i + 1], segs[i].l);
                    minR[i] = Math.min(minR[i + 1], segs[i].r);
                }

                long left = 0, right = segs[0].r;
                for (int i = 0; i < n - 1; i++) {
                    left = Math.max(left, segs[i].l);
                    right = Math.min(right, segs[i].r);
                    ans = Math.max(ans, Math.max(right - left + 1, 0) + Math.max(minR[i + 1] - maxL[i + 1] + 1, 0));
                }
            }

            pattern2:
            {
                IntroSort.sort(segs, L_DEC.thenComparing(R_DEC));
                long[] maxL = new long[n + 1], minR = new long[n + 1];
                minR[n] = Long.MAX_VALUE;
                for (int i = n - 1; i >= 0; i--) {
                    maxL[i] = Math.max(maxL[i + 1], segs[i].l);
                    minR[i] = Math.min(minR[i + 1], segs[i].r);
                }

                long left = 0, right = segs[0].r;
                for (int i = 0; i < n - 1; i++) {
                    left = Math.max(left, segs[i].l);
                    right = Math.min(right, segs[i].r);
                    ans = Math.max(ans, Math.max(right - left + 1, 0) + Math.max(minR[i + 1] - maxL[i + 1] + 1, 0));
                }
            }

            pattern3:
            {
                long[] maxLLeft = new long[n + 1], minRLeft = new long[n + 1];
                long[] maxLRight = new long[n + 1], minRRight = new long[n + 1];
                minRLeft[0] = minRRight[n] = Long.MAX_VALUE;
                for (int i = n - 1; i >= 0; i--) {
                    maxLRight[i] = Math.max(maxLRight[i + 1], segs[i].l);
                    minRRight[i] = Math.min(minRRight[i + 1], segs[i].r);
                }
                for (int i = 0; i < n; i++) {
                    maxLLeft[i + 1] = Math.max(maxLLeft[i], segs[i].l);
                    minRLeft[i + 1] = Math.min(minRLeft[i], segs[i].r);
                }
                //System.out.println(Arrays.toString(segs));
                for (int i = 0; i < n; i++) {
                    long v = segs[i].width() + Math.max(0, 1 + Math.min(minRLeft[i], minRRight[i + 1]) - Math.max(maxLLeft[i], maxLRight[i + 1]));
                    //System.out.println("i=" + i + " v=" + v + "(l=" + Math.max(maxLLeft[i], maxLRight[i + 1]) + ", r=" + Math.max(0, Math.min(minRLeft[i], minRRight[i + 1])) + ")");
                    ans = Math.max(ans, v);
                }
            }

            out.ans(ans).ln();
        }

        private static class Seg {
            long l;
            long r;

            Seg(long l, long r) {
                this.l = l;
                this.r = r;
            }

            long width() {
                return r - l + 1;
            }

            public String toString() {
                return "(" + l + ", " + r + ")";
            }

        }

    }

    static final class BitMath {
        private BitMath() {
        }

        public static int count(int v) {
            v = (v & 0x55555555) + ((v >> 1) & 0x55555555);
            v = (v & 0x33333333) + ((v >> 2) & 0x33333333);
            v = (v & 0x0f0f0f0f) + ((v >> 4) & 0x0f0f0f0f);
            v = (v & 0x00ff00ff) + ((v >> 8) & 0x00ff00ff);
            v = (v & 0x0000ffff) + ((v >> 16) & 0x0000ffff);
            return v;
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

    static interface Verified {
    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
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

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static <T> void swap(T[] a, int x, int y) {
            T t = a[x];
            a[x] = a[y];
            a[y] = t;
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

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
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

    }
}

