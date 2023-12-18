import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int[] val = new int[n];
        long total = 0;
        for (int i = 0; i < n; i++) {
            val[i] = in.nextInt();
            total += val[i];
        }
        long[][] dp = new long[n][n];

        for (int gap = 0; gap < n; gap++) {
            for (int i = 0; i < n; i++) {
                if (i + gap >= n) {
                    break;
                }
                if (gap == 0) {
                    dp[i][i + gap] = val[i];
                } else if (gap == 1) {
                    dp[i][i + gap] = Math.max(val[i], val[i + gap]);
                } else {
                    dp[i][i + gap] = Math.max(val[i] + Math.min(dp[i + 2][i + gap], dp[i + 1][i + gap - 1]),
                            val[i + gap] + Math.min(dp[i + 1][i + gap - 1], dp[i][i + gap - 2]));
                }
            }
        }


        long ans = dp[0][n - 1];
        out.println(2 * ans - total);
        out.close();
    }

    private static void dfs(Vertex v, Set<Vertex> visited, Stack<Vertex> st) {
        visited.add(v);
        for (Vertex n : v.adj) {
            if (!visited.contains(n))
                dfs(n, visited, st);
        }
        st.add(v);
    }

    static class Vertex {
        int i;

        public Vertex(int i) {
            this.i = i;
        }

        List<Vertex> adj = new ArrayList<>();
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}
