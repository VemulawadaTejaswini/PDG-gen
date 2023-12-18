import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EIndependence solver = new EIndependence();
        solver.solve(1, in, out);
        out.close();
    }

    static class EIndependence {
        static final int INFINITY = Integer.MAX_VALUE / 3;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            boolean[][] adj = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    adj[i][j] = true;
                }
            }

            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                adj[a][b] = adj[b][a] = false;
            }

            UnionFind components = new UnionFind(n);
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (adj[i][j]) {
                        components.union(i, j);
                    }
                }
            }

            int[][] shortest = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    shortest[i][j] = adj[i][j] ? 1 : INFINITY;
                    if (i == j) shortest[i][j] = 0;
                }
            }

            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        shortest[i][j] = Math.min(shortest[i][j], shortest[i][k] + shortest[k][j]);
                    }
                }
            }

            boolean[] colors = new boolean[n];
            int[] imbalance = new int[n];
            for (int i = 0; i < n; i++) {
                colors[i] = shortest[i][components.rep(i)] % 2 == 0;
                imbalance[components.rep(i)] += colors[i] ? 1 : -1;
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (adj[i][j]) {
                        if (colors[i] == colors[j]) {
                            out.println(-1);
                            return;
                        }
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                imbalance[i] = Math.abs(imbalance[i]);
            }

            Arrays.sort(imbalance);

            int weightedSum = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (weightedSum > 0) {
                    weightedSum -= imbalance[i];
                } else {
                    weightedSum += imbalance[i];
                }
            }

            int a = (n + weightedSum) / 2;
            int b = (n - weightedSum) / 2;

            int answer = nc2(a) + nc2(b);

            out.println(answer);
        }

        static int nc2(int n) {
            return n * (n - 1) / 2;
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

    static class UnionFind {
        private int[] __rep;
        private int[] __size;

        public UnionFind(int n) {
            __rep = new int[n];
            __size = new int[n];
            for (int i = 0; i < n; i++) {
                __rep[i] = i;
                __size[i] = 1;
            }
        }

        public int rep(int x) {
            if (__rep[x] == x) {
                return x;
            }

            int r = rep(__rep[x]);
            __rep[x] = r;
            return r;
        }

        public int size(int x) {
            return __size[rep(x)];
        }

        public void union(int x, int y) {
            x = rep(x);
            y = rep(y);

            if (size(x) < size(y)) {
                int t = x;
                x = y;
                y = t;
            }

            // now size(x) >= size(y)

            __rep[y] = x;
            __size[x] += __size[y];
        }

    }
}

