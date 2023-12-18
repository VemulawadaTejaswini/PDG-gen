import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        List<Integer>[] adj;
        int[] col;
        int[] am = new int[2];
        boolean twoColorable;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            adj = new List[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                adj[a].add(b);
                adj[b].add(a);
            }
            col = new int[n];
            Arrays.fill(col, -1);
            twoColorable = true;
            dfs(0, 0);
            long ans = 0;
            if (twoColorable) {
                ans = am[0] * (long) am[1];
            } else {
                ans = n * (long) (n - 1) / 2;
            }
            ans -= m;
            out.println(ans);
        }

        private void dfs(int v, int c) {
            col[v] = c;
            ++am[c];
            for (int u : adj[v]) {
                if (col[u] < 0) {
                    dfs(u, 1 - c);
                } else if (col[u] != 1 - c) {
                    twoColorable = false;
                }
            }
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

