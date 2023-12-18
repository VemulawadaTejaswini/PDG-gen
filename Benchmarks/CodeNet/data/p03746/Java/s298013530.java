import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.Objects;
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
        BHamiltonishPath solver = new BHamiltonishPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class BHamiltonishPath {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints(), m = in.ints();
            BHamiltonishPath.Node[] nodes = new BHamiltonishPath.Node[n];
            for (int i = 0; i < n; i++) nodes[i] = new BHamiltonishPath.Node(i + 1);
            for (int i = 0; i < m; i++) {
                int a = in.ints() - 1, b = in.ints() - 1;
                nodes[a].adj.add(nodes[b]);
                nodes[b].adj.add(nodes[a]);
            }

            List<Integer> ans = new ArrayList<>();

            nodes[0].used = nodes[1].used = true;
            BHamiltonishPath.Node cur = nodes[0].expand();
            while (cur != null) {
                ans.add(cur.index);
                cur = cur.from;
            }

            nodes[1].expand();
            cur = nodes[1];
            while (cur != null) {
                ans.add(cur.index);
                cur = cur.to;
            }

            out.ans(ans.size()).ln();
            ans.forEach(out::ans);
            out.ln();
        }

        private static class Node {
            int index;
            List<BHamiltonishPath.Node> adj = new ArrayList<>();
            boolean used;
            BHamiltonishPath.Node from;
            BHamiltonishPath.Node to;

            Node(int index) {
                this.index = index;
            }

            BHamiltonishPath.Node expand() {
                for (BHamiltonishPath.Node node : adj) {
                    if (!node.used) {
                        node.used = true;
                        node.from = this;
                        this.to = node;
                        return node.expand();
                    }
                }
                return this;
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

