import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.util.List;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
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
        DKnapsackQueriesOnATree solver = new DKnapsackQueriesOnATree();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKnapsackQueriesOnATree {
        private static final int DMAX = 10;
        private static final int MAX = 100010;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            DKnapsackQueriesOnATree.Node[] nodes = new DKnapsackQueriesOnATree.Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new DKnapsackQueriesOnATree.Node(in.ints(), in.ints());
                if (i != 0) {
                    nodes[i].parent = nodes[(i - 1) / 2];
                    nodes[i].depth = nodes[i].parent.depth + 1;
                }
            }
            for (int i = 0; i < n; i++) {
                if (nodes[i].depth >= DMAX) break;
                nodes[i].dp();
            }
            int queries = in.ints();
            List<DKnapsackQueriesOnATree.Node> tmp = new ArrayList<>();
            for (int i = 0; i < queries; i++) {
                int node = in.ints() - 1, l = in.ints();
                if (nodes[node].dp != null) {
                    out.ans(nodes[node].dp[l]).ln();
                    continue;
                }
                tmp.clear();
                DKnapsackQueriesOnATree.Node cur = nodes[node];
                while (cur.dp == null) {
                    tmp.add(cur);
                    cur = cur.parent;
                }
                int m = tmp.size(), ans = 0;
                outer:
                for (int j = 0; j < (1 << m); j++) {
                    int w = 0, v = 0;
                    for (int k = 0; k < m; k++) {
                        if (((j >> k) & 1) == 0) continue;
                        w += tmp.get(k).w;
                        v += tmp.get(k).v;
                        if (w > l) continue outer;
                    }
                    ans = Math.max(ans, cur.dp[l - w] + v);
                }
                out.ans(ans).ln();
            }
        }

        private static class Node {
            int depth;
            DKnapsackQueriesOnATree.Node parent;
            int v;
            int w;
            int[] dp;

            Node(int v, int w) {
                this.v = v;
                this.w = w;
            }

            void dp() {
                dp = new int[MAX];
                if (parent == null) {
                    for (int i = w; i < MAX; i++) dp[i] = v;
                    return;
                }
                for (int i = w; i < MAX; i++) {
                    dp[i] = Math.max(parent.dp[i], parent.dp[i - w] + v);
                }
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

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
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

