import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.security.AccessControlException;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.regex.Pattern;
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
        CExamAndWizard solver = new CExamAndWizard();
        solver.solve(1, in, out);
        out.close();
    }

    static class CExamAndWizard {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            Debug.autoEnable();
            int n = in.ints();
            long[] a = in.longs(n);
            long[] b = in.longs(n);
            Vec2l[] d = new Vec2l[n];
            for (int i = 0; i < n; i++) {
                d[i] = new Vec2l(i, a[i] - b[i]);
            }
            MergeSort.sort(d, Comparator.comparing(e -> -e.y));
            //System.out.println(Arrays.toString(d));

            int source = 0;
            for (int sink = n - 1; sink >= 0 && d[sink].y < 0; sink--) {
                long borrow = -d[sink].y;
                while (borrow > 0) {
                    if (source == n) {
                        out.ans(-1).ln();
                        return;
                    }
                    if (d[source].y > borrow) {
                        d[source].y -= borrow;
                        break;
                    }
                    borrow -= d[source].y;
                    d[source].y = 0;
                    source++;
                }
                d[sink].y = 0;
            }

            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (a[(int) d[i].x] - b[(int) d[i].x] != d[i].y) {
                    ans++;
                }
            }
            out.ans(ans).ln();
        }

    }

    static class InsertionSort {
        private InsertionSort() {
        }

        static <T> void sort(T[] a, int low, int high, Comparator<? super T> comparator) {
            for (int i = low; i < high; i++) {
                for (int j = i; j > low && comparator.compare(a[j - 1], a[j]) > 0; j--) {
                    T t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                }
            }
        }

    }

    static class MergeSort {
        private static final int INSERTIONSORT_THRESHOLD = 7;

        private MergeSort() {
        }

        static <T> void sort(T[] src, T[] dest, int low, int high, int off, Comparator<? super T> comparator) {
            int length = high - low;
            if (length < INSERTIONSORT_THRESHOLD) {
                InsertionSort.sort(dest, low, high, comparator);
                return;
            }
            int destLow = low;
            int destHigh = high;
            low += off;
            high += off;
            int mid = (low + high) / 2;
            sort(dest, src, low, mid, -off, comparator);
            sort(dest, src, mid, high, -off, comparator);
            if (comparator.compare(src[mid - 1], src[mid]) <= 0) {
                System.arraycopy(src, low, dest, destLow, length);
                return;
            }
            for (int i = destLow, p = low, q = mid; i < destHigh; i++) {
                if (q >= high || p < mid && comparator.compare(src[p], src[q]) <= 0) {
                    dest[i] = src[p++];
                } else {
                    dest[i] = src[q++];
                }
            }
        }

        public static <T> void sort(T[] a, Comparator<? super T> comparator) {
            sort(a.clone(), a, 0, a.length, 0, comparator);
        }

    }

    static class Debug {
        private static final String DEBUG_PROPERTY = "enabled";
        private static final String DEBUG_CALL_PATTERN = "^.+\\.debug\\(([a-zA-Z0-9]+)\\);.*$";
        private static Pattern debugRegex;
        private static boolean enabled = false;
        private static String src;

        public static void autoEnable() {
            try {
                src = System.getProperty(DEBUG_PROPERTY);
                if (src != null) {
                    enabled = true;
                    if (debugRegex == null) {
                        debugRegex = Pattern.compile(DEBUG_CALL_PATTERN);
                    }
                }
            } catch (AccessControlException ex) {
                src = null;
            }
        }

    }

    static class Vec2l {
        public long x;
        public long y;

        public Vec2l(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec2l vec2i = (Vec2l) o;
            return x == vec2i.x &&
                    y == vec2i.y;
        }

        public int hashCode() {
            return Objects.hash(x, y);
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }

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

        public long[] longs(int length) {
            return IntStream.range(0, length).mapToLong(x -> longs()).toArray();
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

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
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
}

