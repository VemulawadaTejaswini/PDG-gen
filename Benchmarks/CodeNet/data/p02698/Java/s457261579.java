import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
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
        FLISOnTree solver = new FLISOnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class FLISOnTree {
        private static final long INF = (long) 1e15;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            // out.setCaseLabel(LightWriter.CaseLabel.NONE);
            int n = in.ints();
            FLISOnTree.Node[] nodes = new FLISOnTree.Node[n];
            for (int i = 0; i < n; i++) nodes[i] = new FLISOnTree.Node(in.longs());
            for (int i = 1; i < n; i++) {
                int x = in.ints() - 1, y = in.ints() - 1;
                nodes[x].neg.add(nodes[y]);
                nodes[y].neg.add(nodes[x]);
            }
            long[] dp = new long[n];
            Arrays.fill(dp, INF);
            nodes[0].dfs(null, dp);
            for (int i = 0; i < n; i++) out.ans(nodes[i].ans).ln();
        }

        private static class Node {
            List<FLISOnTree.Node> neg = new ArrayList<>();
            long v;
            long ans;

            Node(long v) {
                this.v = v;
            }

            void dfs(FLISOnTree.Node from, long[] dp) {
                int index = ArrayUtil.lowerBound(dp, v);
                long prev = dp[index];
                dp[index] = v;
                ans = ArrayUtil.lowerBound(dp, INF);
                for (FLISOnTree.Node next : neg) {
                    if (next == from) continue;
                    next.dfs(this, dp);
                }
                dp[index] = prev;
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

    static class LightScanner implements AutoCloseable {
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

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static int lowerBound(long[] a, long t) {
            return lowerBound(a, t, 0);
        }

        public static int lowerBound(long[] a, long t, int min) {
            int max = a.length;
            while (min < max) {
                int mid = (min + max) / 2;
                if (t <= a[mid]) {
                    max = mid;
                } else {
                    min = mid + 1;
                }
            }
            return min;
        }

    }
}

