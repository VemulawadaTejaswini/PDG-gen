import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Coer
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskG solver = new TaskG();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskG {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            ArrayList<Integer>[] G = new ArrayList[n + 1];
            for (int i = 0; i < n + 1; i++) {
                G[i] = new ArrayList<>();
            }
            int[] deg = new int[n + 1];
            for (int i = 0; i < m; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                G[u].add(v);
                deg[v]++;
            }
            int[] dp = new int[n + 1];
            int res = 0;
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 1; i < n + 1; i++) {
                if (deg[i] == 0) {
                    queue.add(i);
                }
            }
            while (!queue.isEmpty()) {
                int u = queue.poll();
                for (int i = 0; i < G[u].size(); i++) {
                    int v = G[u].get(i);
                    dp[v] = Math.max(dp[v], dp[u] + 1);
                    res = Math.max(res, dp[v]);
                    if (--deg[v] == 0) {
                        queue.add(v);
                    }
                }
            }
            out.println(res);
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