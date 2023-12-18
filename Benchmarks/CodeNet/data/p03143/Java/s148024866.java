import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.util.stream.LongStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.io.Writer;
import java.security.AccessControlException;
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
        EWeightsOnVerticesAndEdges solver = new EWeightsOnVerticesAndEdges();
        solver.solve(1, in, out);
        out.close();
    }

    static class EWeightsOnVerticesAndEdges {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            Debug.autoEnable();
            int n = in.ints(), m = in.ints();
            long[] x = in.longs(n);
            EWeightsOnVerticesAndEdges.Edge[] e = new EWeightsOnVerticesAndEdges.Edge[m];
            for (int i = 0; i < m; i++) {
                e[i] = new EWeightsOnVerticesAndEdges.Edge(in.ints() - 1, in.ints() - 1, in.longs());
            }
            Arrays.sort(e, Comparator.comparing(edge -> edge.w));
            UnionFind uf = new UnionFind(n);
            long[] size = x.clone();
            int[] pending = new int[n];
            int[] commit = new int[n];
            long ans = 0;
            for (int i = 0; i < m; i++) {
                EWeightsOnVerticesAndEdges.Edge edge = e[i];
                if (uf.find(edge.a) == uf.find(edge.b)) {
                    int gr = uf.find(edge.a);
                    long s = size[gr];
                    pending[gr]++;
                    if (s >= edge.w) {
                        commit[gr] = pending[gr];
                    }
                } else {
                    int gr1 = uf.find(edge.a), gr2 = uf.find(edge.b);
                    long s = size[gr1] + size[gr2];
                    int p = pending[gr1] + pending[gr2] + 1;
                    size[gr1] = 0;
                    size[gr2] = 0;
                    uf.union(edge.a, edge.b);
                    int gr = uf.find(edge.a);
                    size[gr] = s;
                    pending[gr] = p;
                    if (s >= edge.w) {
                        commit[gr] = pending[gr];
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                ans += commit[i];
            }
            out.ans(m - ans).ln();
        }

        private static class Edge {
            int a;
            int b;
            long w;

            public Edge(int a, int b, long w) {
                this.a = a;
                this.b = b;
                this.w = w;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                EWeightsOnVerticesAndEdges.Edge edge = (EWeightsOnVerticesAndEdges.Edge) o;
                return a == edge.a &&
                        b == edge.b &&
                        w == edge.w;
            }

            public int hashCode() {
                return Objects.hash(a, b, w);
            }

        }

    }

    static class Debug {
        private static final String DEBUG_PROPERTY = "debug";
        private static final String DEBUG_CALL_PATTERN = "^.+\\.debug\\((.+)\\);.*$";
        private static Pattern debugRegex;
        private static boolean enabled = false;
        private static String src;

        public static void enable(String s) {
            enabled = true;
            src = s;
            if (debugRegex == null) {
                debugRegex = Pattern.compile(DEBUG_CALL_PATTERN);
            }
        }

        public static boolean autoEnable() {
            try {
                String s = System.getProperty(DEBUG_PROPERTY);
                if (s != null) {
                    enable(s);
                    return true;
                }
            } catch (AccessControlException ex) {
                src = null;
            }
            return false;
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

