import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
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
        KProblemOnTree solver = new KProblemOnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class KProblemOnTree {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints();
            KProblemOnTree.Node[] nodes = new KProblemOnTree.Node[n];
            for (int i = 0; i < n; i++) nodes[i] = new KProblemOnTree.Node();
            for (int i = 1; i < n; i++) {
                int p = in.ints() - 1, q = in.ints() - 1;
                nodes[p].neg.add(nodes[q]);
                nodes[q].neg.add(nodes[p]);
            }
            int ans = 0, max = 0;
            for (int i = 0; i < n; i++) {
                if (nodes[i].neg.size() == 1) {
                    ans++;
                }
                max = Math.max(nodes[i].neg.size(), max);
            }

            if (max <= 2) {
                out.ans(n).ln();
                return;
            }


            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (nodes[i].neg.size() == 1) {
                    list.add(nodes[i].dfs(null));
                }
            }

            list.sort(Comparator.reverseOrder());
            ans += list.get(0) + list.get(1) - 2;
            out.ans(ans).ln();
        }

        private static class Node {
            final List<KProblemOnTree.Node> neg = new ArrayList<>();

            int dfs(KProblemOnTree.Node parent) {
                if (neg.size() > 2) {
                    return 0;
                }
                for (KProblemOnTree.Node next : neg) {
                    if (next == parent) continue;
                    return next.dfs(this) + 1;
                }
                throw new RuntimeException();
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

