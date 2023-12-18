import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader inp = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(inp, out);
        out.close();
    }

    private static class Solver {
        private void solve(InputReader inp, PrintWriter out) {
            int n = inp.nextInt(), m = inp.nextInt();
            ArrayList<Integer>[] graph = new ArrayList[n];
            ArrayList<Integer>[] parents = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new ArrayList<>();
                parents[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int x = inp.nextInt() - 1, y = inp.nextInt() - 1;
                graph[x].add(y);
                parents[y].add(x);
            }
            int[] dp = new int[n];
            int[] t = topologicalSort(graph);
            for (int node: t) {
                for (int parent: parents[node]) {
                    dp[node] = Math.max(dp[node], dp[parent] + 1);
                }
            }
            int res = 0;
            for (int i: dp) res = Math.max(res, i);
            out.print(res);
        }

        private static int[] topologicalSort(ArrayList<Integer>[] graph) {
            int n = graph.length;
            int[] in_degree = new int[n];
            for (int i = 0; i < n; i++) {
                for (int to: graph[i]) in_degree[to]++;
            }
            int[] res = new int[n];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (in_degree[i] == 0) res[j++] = i;
            }
            for (int i = 0; i < j; i++) {
                for (int to: graph[res[i]]) {
                    if (--in_degree[to] == 0) res[j++] = to;
                }
            }
            for (int i = 0; i < n; i++) {
                if (in_degree[i] > 0) {
                    return null; //graph contains cycles
                }
            }
            return res;
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
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
        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}


