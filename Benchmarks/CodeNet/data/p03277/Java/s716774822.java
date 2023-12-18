import java.io.*;
import java.util.*;

public class Main {
    private static class Solver {
        private static class FenwickTree {
            int n;
            int[] ft;

            FenwickTree(int n) {
                this.n = n;
                this.ft = new int[n + 1];
                for (int i = 1; i <= n; ++i) {
                    ft[i] = 0;
                }
            }

            void Update(int i, int v) {
                while (i <= n) {
                    ft[i] += v;
                    i += i & -i;
                }
            }

            int Query(int i) {
                int ans = 0;
                while (i > 0) {
                    ans += ft[i];
                    i -= i & -i;
                }
                return ans;
            }
        }

        private long Count(int n, int[] a, int T) {
            int[] b = new int[n + 1];
            for (int i = 1; i <= n; ++i) {
                b[i] = (a[i] <= T) ? 1 : -1;
                b[i] = b[i] + b[i - 1];
            }

            FenwickTree FT = new FenwickTree(n * 2 + 1);
            long ans = 0;
            FT.Update(n + 1, 1);
            for (int i = 1; i <= n; ++i) {
                int v = b[i] + n + 1;
                ans += FT.Query(v - 1);
                FT.Update(v, 1);
            }
            return ans;
        }

        void Solve() {
            int n = inp.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; ++i) {
                a[i] = inp.nextInt();
            }

            long k = (long) n * (n + 1) / 2;
            int l = 1, r = (int) 1e9, f = -1;
            while (l <= r) {
                int mid = (l + r) >> 1;
                if (Count(n, a, mid) >= k / 2 + 1) {
                    f = mid;
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            out.println(f);
        }

        static InputReader inp;
        static PrintWriter out;
    }

    private static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        private InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        private String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private long nextLong() {
            return Long.parseLong(next());
        }

        private double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Solver.inp = new InputReader(inputStream);
        Solver.out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.Solve();
        Solver.out.close();
    }
}