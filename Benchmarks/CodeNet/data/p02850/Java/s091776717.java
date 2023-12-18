import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
        DColoringEdgesOnTree solver = new DColoringEdgesOnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class DColoringEdgesOnTree {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints();
            DColoringEdgesOnTree.Node[] nodes = new DColoringEdgesOnTree.Node[n];
            for (int i = 0; i < n; i++) nodes[i] = new DColoringEdgesOnTree.Node();
            int[] x = new int[n - 1], y = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                x[i] = in.ints() - 1;
                y[i] = in.ints() - 1;
                nodes[x[i]].adj.add(nodes[y[i]]);
                nodes[y[i]].adj.add(nodes[x[i]]);
            }

            nodes[0].dfs(null);

            out.ans(DColoringEdgesOnTree.Node.max).ln();
            for (int i = 0; i < n - 1; i++) {
                out.ans(nodes[x[i]].depth > nodes[y[i]].depth ? nodes[x[i]].color : nodes[y[i]].color).ln();
            }
        }

        private static class Node {
            private static int max = 0;
            int color;
            int depth;
            List<DColoringEdgesOnTree.Node> adj = new ArrayList<>();

            void dfs(DColoringEdgesOnTree.Node from) {
                if (from != null) depth = from.depth + 1;
                int color = 1;
                for (DColoringEdgesOnTree.Node node : adj) {
                    if (node == from) continue;
                    if (this.color == color) color++;
                    node.color = color++;
                    node.dfs(this);
                }
                max = Math.max(max, this.color);
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

    }
}

