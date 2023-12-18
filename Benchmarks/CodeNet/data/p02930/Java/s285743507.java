import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        private ArrayList<ArrayList<Integer>> g;
        private int n;
        private boolean[] used;
        private int[][] levels;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            if (n == 2) {
                out.println(1);
                return;
            }
            g = new ArrayList<>();
            levels = new int[n + 1][n + 1];
            for (int i = 0; i <= n; i++)
                for (int j = 0; j <= n; j++)
                    levels[i][j] = 1;
            for (int i = 0; i <= n; i++)
                g.add(new ArrayList<>());
            for (int v = 1; v <= n; v++)
                for (int to = 1; to <= n; to++)
                    if (v != to)
                        g.get(v).add(to);
            used = new boolean[n + 1];
            dfs(1);
            for (int i = 1; i <= n - 1; i++) {
                for (int j = i + 1; j <= n; j++)
                    out.print(levels[i][j] + " ");
                out.print("\n");
            }
        }

        private void dfs(int v) {
            used[v] = true;
            for (int to : g.get(v))
                if (!used[to]) {
                    dfs(to);
                    levels[v][to] = 2;
                    levels[to][v] = 2;
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

