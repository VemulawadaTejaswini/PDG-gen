import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        int n;
        int m;
        List<Integer>[] adj;
        int[][] color;
        boolean[] got;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();
            adj = new List[n];
            color = new int[n][n];
            got = new boolean[n];
            for (int i = 0; i < n; ++i) adj[i] = new ArrayList<>();
            for (int i = 0; i < m; ++i) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                int d = in.nextInt();
                if (got[u] && got[v]) {
                    if (dfs(u, -1, v) != d) {
                        out.println("No");
                        return;
                    }
                }
                adj[u].add(v);
                adj[v].add(u);
                color[u][v] = d;
                got[u] = got[v] = true;
            }
            out.println("Yes");
        }

        private int dfs(int root, int parent, int objective) {
            int moves = parent == -1 ? 0 : color[parent][root];
            if (root == objective) return moves;
            for (int child : adj[root]) {
                if (child == parent) continue;
                moves += dfs(child, root, objective);
            }
            return moves;
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

