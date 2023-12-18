import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Vadim
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        agc33C solver = new agc33C();
        solver.solve(1, in, out);
        out.close();
    }

    static class agc33C {
        List<Edge>[] g;
        int diameter;
        int MAX = 200_003;

        int dfs(int v, int p) {
            int max = 0, max2 = 0;
            for (Edge edge : g[v]) {
                if (edge.to == p)
                    continue;
                int res = dfs(edge.to, v) + 1;
                if (res > max) {
                    max2 = max;
                    max = res;
                } else {
                    max2 = Math.max(max2, res);
                }
            }
            diameter = Math.max(diameter, max + max2);
            return max;
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.ni();
            g = new List[N];
            for (int i = 0; i < N; i++) {
                g[i] = new LinkedList<>();
            }
            for (int i = 0; i < N - 1; i++) {
                int from = in.ni() - 1, to = in.ni() - 1;
                g[from].add(new Edge(from, to));
                g[to].add(new Edge(to, from));
            }
            dfs(0, -1);
            boolean[] win = new boolean[MAX];
            win[1] = true;
            win[0] = win[2] = false;
            for (int i = 3; i < MAX; i++) {
                if (!win[i - 2] || !win[i - 1])
                    win[i] = true;
            }
            if (win[diameter + 1]) {
                out.println("First");
            } else {
                out.println("Second");
            }

        }

        class Edge {
            int from;
            int to;

            public Edge(int from, int to) {
                this.from = from;
                this.to = to;
            }

        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String ns() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int ni() {
            return Integer.parseInt(ns());
        }

    }
}

