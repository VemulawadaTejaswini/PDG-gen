import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
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
        FPure solver = new FPure();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPure {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints(), m = in.ints();
            FPure.Node[] nodes = new FPure.Node[n];
            FPure.Node.cur = 0;
            Arrays.fill(FPure.Node.path, 0);
            int[] from = new int[m], to = new int[m];

            for (int i = 0; i < n; i++) nodes[i] = new FPure.Node(i);
            for (int i = 0; i < m; i++) {
                int x = in.ints() - 1, y = in.ints() - 1;
                from[i] = x;
                to[i] = y;
                nodes[x].adj.add(nodes[y]);
            }

            int[] res;
            for (int i = 0; i < n; i++) {
                if (!nodes[i].visited && (res = nodes[i].dfs()) != null) {

                    int k = res.length;
                    boolean[] used = new boolean[n];
                    for (int value : res) used[value] = true;
                    for (int j = 0; j < m; j++) {
                        if (!used[from[j]] || !used[to[j]]) continue;

                        int start = -1;
                        for (int l = 0; l < k; l++) {
                            if (res[l] == from[j]) {
                                start = l;
                                break;
                            }
                        }
                        if (res[(start + 1) % k] == to[j]) continue;

                        for (int l = 1; l < k; l++) {
                            int p = (start + l) % k;
                            if (res[p] == to[j]) break;
                            used[p] = false;
                        }
                    }

                    int[] incnt = new int[n], outcnt = new int[n];
                    for (int j = 0; j < m; j++) {
                        if (!used[from[j]] || !used[to[j]]) continue;
                        incnt[to[j]]++;
                        outcnt[from[j]]++;
                    }


                    int cnt = 0;
                    for (int j = 0; j < n; j++) {
                        if (!used[j]) continue;
                        cnt++;
                        if (incnt[j] == 0 || outcnt[j] == 0) {
                            throw new RuntimeException();
                        }
                    }

                    out.ans(cnt).ln();
                    for (int re : res) {
                        if (!used[re]) continue;
                        out.ans(1 + re).ln();
                    }
                    return;
                }
            }
            out.ans(-1).ln();
        }

        private static class Node {
            private static int[] path = new int[1000];
            private static int cur;
            int index;
            List<FPure.Node> adj = new ArrayList<>();
            boolean visited = false;
            int usedAt = -1;

            Node(int index) {
                this.index = index;
            }

            int[] dfs() {
                //System.out.println("DFS " + index);
                usedAt = cur;
                path[cur++] = index;
                visited = true;
                for (FPure.Node node : adj) {
                    //System.out.println("Look " + node.index + " from " + index);
                    int[] res;
                    if (node.usedAt >= 0) {
                        //System.out.println(Arrays.toString(path));
                        res = new int[cur - node.usedAt];
                        System.arraycopy(path, node.usedAt, res, 0, cur - node.usedAt);
                        cur = 0;
                        usedAt = -1;
                        return res;
                    } else if (!node.visited) {
                        if ((res = node.dfs()) != null) {
                            usedAt = -1;
                            return res;
                        }
                    }
                }
                cur--;
                usedAt = -1;
                return null;
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

