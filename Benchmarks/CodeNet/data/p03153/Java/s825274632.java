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
        EConnectingCities solver = new EConnectingCities();
        solver.solve(1, in, out);
        out.close();
    }

    static class EConnectingCities {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            Debug.autoEnable();
            int n = in.ints();
            long d = in.longs();
            long[] a = in.longs(n);
            EConnectingCities.WSize[] b = new EConnectingCities.WSize[n];
            EConnectingCities.WSize[] c = new EConnectingCities.WSize[n];
            for (int i = 0; i < n; i++) {
                b[i] = new EConnectingCities.WSize(i, a[i] + ((long) i) * d);
                c[i] = new EConnectingCities.WSize(i, a[i] + (n - i - 1L) * d);
            }
            MergeSort.sort(b, Comparator.comparing(e -> e.cost));
            MergeSort.sort(c, Comparator.comparing(e -> e.cost));

            int cur = 0;
            EConnectingCities.Edge[] edges = new EConnectingCities.Edge[2 * n - 2];
            for (int i = 0; i < n - 1; i++) {
                while (b[cur].index <= i) {
                    cur++;
                }
                long weight = 0;
                weight += a[i];
                weight += a[b[cur].index];
                weight += d * (b[cur].index - i);
                edges[i] = new EConnectingCities.Edge(weight, i, b[cur].index);
            }

            cur = 0;
            for (int i = n - 1; i > 0; i--) {
                while (c[cur].index >= i) {
                    cur++;
                }
                long weight = 0;
                weight += a[i];
                weight += a[c[cur].index];
                weight += d * (i - c[cur].index);
                edges[n + i - 2] = new EConnectingCities.Edge(weight, c[cur].index, i);
            }


            long ans = 0;
            int roads = 0;
            UnionFind uf = new UnionFind(n);
            MergeSort.sort(edges, Comparator.comparing(edge -> edge.cost));
            for (EConnectingCities.Edge edge : edges) {
                if (uf.find(edge.from) != uf.find(edge.to)) {
                    ans += edge.cost;
                    uf.union(edge.from, edge.to);
                    roads++;
                }
            }
            if (roads != n - 1) {
                throw new RuntimeException("Illegal road number: " + roads);
            }
            out.ans(ans).ln();
        }

        private static class WSize {
            int index;
            long cost;

            public WSize(int index, long cost) {
                this.index = index;
                this.cost = cost;
            }

        }

        private static class Edge {
            long cost;
            int from;
            int to;

            public Edge(long cost, int from, int to) {
                this.cost = cost;
                this.from = from;
                this.to = to;
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

    static final class UnionFind {
        private final int[] groups;
        private final int[] rank;

        public UnionFind(int n) {
            groups = IntStream.range(0, n).toArray();
            rank = new int[n];
        }

        public int find(int i) {
            int ans = groups[i];
            if (ans == i) {
                return i;
            } else {
                return groups[i] = find(ans);
            }
        }

        public boolean union(int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y) {
                return false;
            } else if (rank[x] < rank[y]) {
                groups[x] = y;
            } else if (rank[x] == rank[y]) {
                rank[x]++;
                groups[y] = x;
            } else {
                groups[y] = x;
            }
            return true;
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
}

