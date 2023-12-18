import java.io.*;
import java.util.*;

public class Main {

    static int mod = (int) (1e9 + 7);

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int m = in.nextInt();
        char[][] c = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = in.next();
            for (int j = 0; j < m; j++) {
                c[i][j] = s.charAt(j);
            }
        }

        long dp[][] = new long[n][m];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                long x = ((i - 1) >= 0 && c[i - 1][j] == '.') ? dp[i - 1][j] : 0;
                long y = ((j - 1) >= 0 && c[i][j - 1] == '.') ? dp[i][j - 1] : 0;
                dp[i][j] = (x + y + dp[i][j]) % mod;
            }
        }
        out.println(dp[n - 1][m - 1]);
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

    }
}
