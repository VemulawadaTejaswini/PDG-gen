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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        final int N = (int) (1e7 + 100);
        boolean[] isPrime = new boolean[N];

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            Arrays.fill(isPrime, true);
            isPrime[0] = false;
            isPrime[1] = false;
            for (int i = 2; i < N; i++) {
                for (int j = i + i; j < N; j += i) {
                    isPrime[j] = false;
                }
            }

            int n = in.nextInt();
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
            }

            int[] d = new int[n];
            for (int i = 0; i < n; i++) {
                d[i] = 3 * (i + 1);
                for (int j = 0; j < i; j++) {
                    if (x[i] - x[j] == 1) {
                        continue;
                    }
                    int cur = f(x[i] - x[j] + 1);
                    for (int k = j; k < i; k++) {
                        cur += f(x[k + 1] - x[k] - 1);
                    }
                    if (j > 0) {
                        cur += d[j - 1];
                    }
                    d[i] = Math.min(d[i], cur);
                }

                if (i > 0 && x[i] == x[i - 1] + 1) {
                    int cur = 2;
                    if (i > 1) {
                        cur += d[i - 1];
                    }
                    d[i] = Math.min(d[i], cur);
                }
            }
            out.println(d[n - 1]);
        }

        private int f(int len) {
            if (len < 1) {
                return 0;
            }
            if (isPrime[len]) {
                return 1;
            }
            if (len % 2 == 0) {
                return 2;
            }
            return 3;
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

    }
}

