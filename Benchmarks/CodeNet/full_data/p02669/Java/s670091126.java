import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        A_PayToWin solver = new A_PayToWin();
        solver.solve(1, in, out);
        out.close();
    }

    static class A_PayToWin {
        Map<Long, Long> cache = new HashMap<>();

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            final int[] muls = {2, 3, 5};

            int numTests = in.nextInt();
            for (int test = 0; test < numTests; test++) {
                long n = in.nextLong();
                Op[] ops = new Op[3];
                for (int i = 0; i < 3; i++) {
                    ops[i] = new Op(muls[i], in.nextInt());
                }
                long u = in.nextInt();
                cache.clear();
                out.println(calc(n, u, ops));
            }
        }

        private long calc(long n, long u, Op[] ops) {
            if (n == 0) {
                return 0;
            }
            if (cache.containsKey(n)) {
                return cache.get(n);
            }
            long res = Long.MAX_VALUE;
            if (res / n > u) {
                res = n * u;
            }
            for (Op op : ops) {
                long down = n % op.mul;
                long up = op.mul - down;
                if ((n - down) / op.mul < n) {
                    res = Math.min(res, down * u + op.cost + calc((n - down) / op.mul, u, ops));
                }
                if ((n + up) / op.mul < n) {
                    res = Math.min(res, up * u + op.cost + calc((n + up) / op.mul, u, ops));
                }
            }
            cache.put(n, res);
            return res;
        }

        class Op {
            int mul;
            long cost;

            public Op(int mul, int cost) {
                this.mul = mul;
                this.cost = cost;
            }

        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

