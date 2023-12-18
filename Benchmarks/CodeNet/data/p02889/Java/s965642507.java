import java.io.*;
import java.util.*;

public class Main {

    static long mod = (long) (1e9 + 7);
    static long max = (long) (1e13);

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int m = in.nextInt();
        int l = in.nextInt();
        long dist[][] = new long[n + 1][n + 1];
        for (int s = 0; s <= n; s++) {
            Arrays.fill(dist[s], max);
        }
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if (c <= l) {
                dist[a][b] = c;
                dist[b][a] = c;
            }
        }

        int q = in.nextInt();
        List<Pair> pairs = new ArrayList<>();
        while (q > 0) {
            int s = in.nextInt();
            int t = in.nextInt();
            pairs.add(new Pair(s, t));
            q--;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++)
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
            }
        }

        long dist2[][] = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dist2[i][j] = dist[i][j] <= l ? 1 : max;
            }
        }


        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++)
                    if (dist2[i][k] + dist2[k][j] < dist2[i][j])
                        dist2[i][j] = dist2[i][k] + dist2[k][j];
            }
        }

        for (final Pair p : pairs) {
            long distance = dist2[p.x][p.y];
            if (distance < max) {
                out.println(distance-1);
            } else {
                out.println(-1);
            }
        }
        out.close();
    }

    static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    static class Vertex {
        int i;
        List<Vertex> adj = new ArrayList<>();

        public Vertex(int i) {
            this.i = i;
        }
    }


    static long[][] powMat(long[][] a, long pow) {
        if (pow == 1) {
            return a;
        } else {
            if (pow % 2 == 0) {
                return powMat(mul(a, a), pow / 2);
            } else {
                return mul(a, powMat(mul(a, a), pow / 2));
            }
        }
    }

    static long[][] mul(long[][] a, long[][] b) {
        int n = a.length;
        long[][] c = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][k] = (c[i][k] + (a[i][j] * b[j][k]) % mod) % mod;
                }
            }
        }
        return c;
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}