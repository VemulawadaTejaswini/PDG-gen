import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStreamReader;
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
        int[] color;

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
            long ans = 0L;
            color = new int[N];
            Arrays.fill(color, -1);
            if (bipartite(0, 0)) {
                int b = 0;
                for (int i = 0; i < N; i++) {
                    if (color[i] == 0) b++;
                }
                ans = 1L * b * (N - b) - M;
            } else {
                ans = 1L * N * (N - 1) / 2 - M;
            }
            out.println(ans);
        }

        private boolean bipartite(int v, int c) {
            if (color[v] != -1) {
                return c == color[v];
            }
            color[v] = c;
            boolean ans = true;
            for (int w : adj[v]) {
                ans &= bipartite(w, c ^ 1);
            }
            return ans;
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

