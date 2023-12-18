import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Problem solver = new Problem();
        solver.solve(0, in, out);
        out.close();
    }

    static class Digraph {
        final int V;
        List<List<Integer>> adj;
        int visited;

        public Digraph(int V) {
            this.V = V;
            adj = new LinkedList<>();
            for (int i = 0; i < V; i++) {
                adj.add(new LinkedList<>());
            }
        }

        public void addEdge(int u, int v) {
            adj.get(u).add(v);
        }

    }

    static class Problem {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt(), M = in.nextInt();
            Digraph G = new Digraph(N);
            for (int i = 0; i < M; i++) {
                int u = in.nextInt(), v = in.nextInt();
                G.addEdge(u - 1, v - 1);
            }

            int res = 0;
            boolean[] marked = new boolean[N];
            int[] dp = new int[N];
            Arrays.fill(dp, -1);
            for (int i = 0; i < N; i++) {
                if (!marked[i])
                    res = Math.max(res, dfs(G, i, marked, dp));
                if (G.visited == N)
                    break;
            }

            out.println(res);
        }

        public int dfs(Digraph G, int s, boolean[] marked, int[] dp) {
            if (dp[s] != -1)
                return dp[s];

            marked[s] = true;
            int path = 0;
            G.visited++;
            for (int v : G.adj.get(s)) {
                path = Math.max(path, 1 + dfs(G, v, marked, dp));
            }

            dp[s] = path;
            return path;
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


