import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        DDecayedBridges solver = new DDecayedBridges();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDecayedBridges {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] a = new int[m];
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = in.nextInt() - 1;
                b[i] = in.nextInt() - 1;
            }

            UnionFind uf = new UnionFind(n);

            long[] answer = new long[m + 1];
            answer[m] = ((long) (n)) * ((long) (n - 1)) / 2;
            for (int i = m - 1; i >= 0; i--) {
                int x = a[i], y = b[i];
                if (uf.rep(x) == uf.rep(y)) {
                    answer[i] = answer[i + 1];
                } else {
                    answer[i] = answer[i + 1] - ((long) uf.size(x)) * ((long) uf.size(y));
                }
                uf.union(x, y);
            }

            for (int i = 1; i <= m; i++) {
                out.println(answer[i]);
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

