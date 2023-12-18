import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.LinkedList;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        List<Integer>[] adj;
        int[] depth;
        boolean oddCycle;
        int[][] vertices;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();

            adj = (List<Integer>[]) new LinkedList[N];
            for (int i = 0; i < N; i++) adj[i] = new LinkedList<>();
            for (int i = 0; i < M; i++) {
                int v = in.nextInt() - 1;
                int w = in.nextInt() - 1;
                adj[v].add(w);
                adj[w].add(v);
            }
            depth = new int[N];
            oddCycle = false;
            Arrays.fill(depth, -1);

            dfs(0, -1, 0);

            if (oddCycle) {
                long ans = (1L * N * (N - 1) / 2) - M;
                out.println(ans);
            } else {
                vertices = new int[N][2];
                Arrays.fill(depth, -1);
                long wrong = dfs2(0, -1, 0);
                long ans = (1L * N * (N - 1) / 2) - M - wrong;
                out.println(ans);
            }
        }

        private long dfs2(int v, int p, int dep) {
            long wrong = 0L;
            depth[v] = dep;
            int par = dep & 1;
            vertices[v][par] = 1;
            vertices[v][par ^ 1] = 0;

            for (int w : adj[v]) {
                if (w != p) {
                    if (depth[w] == -1) {
                        wrong += dfs2(w, v, dep + 1);

                        for (int pr = 0; pr <= 1; pr++) {
                            wrong += vertices[v][pr] * vertices[w][pr];
                        }

                        vertices[v][par] += vertices[w][par];
                        vertices[v][par ^ 1] += vertices[w][par ^ 1];
                    }
                }
            }

            return wrong;
        }

        private void dfs(int v, int p, int dep) {
            depth[v] = dep;

            for (int w : adj[v]) {
                if (w != p) {
                    if (depth[w] == -1) {
                        dfs(w, v, dep + 1);
                    } else {
                        int len = Math.abs(depth[v] - depth[w]) + 1;
                        if (len % 2 != 0) {
                            oddCycle = true;
                        }
                    }
                }
            }
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

