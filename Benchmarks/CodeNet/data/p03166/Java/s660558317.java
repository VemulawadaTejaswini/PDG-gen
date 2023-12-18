/*input
5 8
5 3
2 3
2 4
5 2
5 1
1 4
4 3
1 3
*/
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author masterbios
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CLinovaAndKingdom solver = new CLinovaAndKingdom();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLinovaAndKingdom {

        final int MAXN = (int) 1e5 + 10;

        long dist[] = new long[MAXN];
        boolean vis[] = new boolean[MAXN];

        List<Integer> graph[];

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int vertices = in.nextInt(), edges = in.nextInt();

            graph = new ArrayList[vertices + 1];

            for (int i = 0; i <= vertices; i++) {
                graph[i] = new ArrayList<>();
            }
            for (int i = 1; i <= edges; i++) {
                int u = in.nextInt(), v = in.nextInt();
                graph[u].add(v);
            }
            for (int i = 1; i <= vertices; i++) {
                if (!vis[i]) dfs(i);
            }

            long ans = 0L;
            for (int i = 1; i <= vertices; i++) {
                // out.print("[" + i + ":" + dist[i] + "] ");
                ans = max(ans, dist[i]);
            }

            out.println(ans);
        }

        public void dfs(int node) {
            vis[node] = true;
            for (int child : graph[node]) {
                if (!vis[child]) dfs(child);
                dist[node] = max(dist[node], 1 + dist[child]);
            }
        }


        public int max(int ...a) {
            int max = Integer.MIN_VALUE;
            for (int i : a) max = Math.max(max, i);
            return max;
        }

        public int min(int ...a) {
            int min = Integer.MAX_VALUE;
            for (int i : a) min = Math.min(min, i);
            return min;
        }

        public long max(long ...a) {
            long max = Long.MIN_VALUE;
            for (long i : a) max = Math.max(max, i);
            return max;
        }

        public long min(long ...a) {
            long min = Long.MAX_VALUE;
            for (long i : a) min = Math.min(min, i);
            return min;
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
            while (tokenizer == null || !tokenizer.hasMoreElements()) {
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

