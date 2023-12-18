import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        double[] coin = new double[n];
        for (int i = 0; i < n; i++) {
            coin[i] = in.nextDouble();
        }
        double[][] d = new double[n][n + 1];
        d[0][1] = coin[0];
        d[0][0] = 1 - coin[0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                d[i][j] = d[i - 1][j] * (1 - coin[i]);
                if (j - 1 >= 0) {
                    d[i][j] += d[i - 1][j - 1] * coin[i];
                }
            }
        }

        double ans = 0;
        for (int i = 0; i <= n; i++) {
            if (i > n / 2)
                ans += d[n - 1][i];
        }
        out.println(ans);
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
