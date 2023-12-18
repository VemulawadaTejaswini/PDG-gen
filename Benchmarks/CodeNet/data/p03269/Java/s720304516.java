import java.io.*;
import java.util.*;

public class Main {
    private static class Solver {
        static class Edge {
            static int n;
            int u, v, w;
            private int correct(int u) {
                if (u == n + 1) {
                    return 1;
                }
                return u + 1;
            }
            public Edge(int u, int v, int w) {
//                u = correct(u);
//                v = correct(v);
                this.u = u;
                this.v = v;
                this.w = w;
            }
        }
        private void Solve() {
            int L = inp.nextInt();
            int n = 0;
            int[] a = new int[30];
            for (int d = L; d > 0; d /= 2) {
                a[++n] = d % 2;
            }
            for (int i = 1; i <= n / 2; ++i) {
                int tmp = a[i];
                a[i] = a[n - i + 1];
                a[n - i + 1] = tmp;
            }

            Edge.n = n;
            List<Edge> ans = new ArrayList<>();
            for (int i = 1; i <= n - 1; ++i) {
                ans.add(new Edge(i, i + 1, 0));
                ans.add(new Edge(i, i + 1, 1 << (n - i - 1)));
            }
            for (int i = 1, t = 0; i <= n; ++i) {
                if (i > 1 && a[i] == 1) {
                    ans.add(new Edge(1, i, t));
                }
                t = t + (a[i] << (n - i));
            }

            out.println(n + " " + ans.size());
            for (Edge e: ans) {
                out.println(e.u + " " + e.v + " " + e.w);
            }
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