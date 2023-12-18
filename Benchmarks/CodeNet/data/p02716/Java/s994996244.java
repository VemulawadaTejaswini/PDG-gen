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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        F solver = new F();
        solver.solve(1, in, out);
        out.close();
    }

    static class F {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            int[] A = in.Int(N);
            int n = N / 2;
            if (N % 2 == 0) {
                long[] a = new long[n + 1];
                long[] b = new long[n + 1];
                for (int i = 0; i < N; i++) {
                    int idx = i / 2 + 1;
                    if (i % 2 == 0) {
                        a[idx] += a[idx - 1] + A[i];
                    } else {
                        b[idx] += b[idx - 1] + A[i];
                    }
                }
                long max = 0;
                for (int i = 0; i < N; i++) {
                    int idx = i / 2;
                    long temp = a[idx] + (b[n] - b[idx]);
                    max = Math.max(max, temp);
                }
                out.println(max);
            } else {
                long[] a = new long[n + 2];
                long[] b = new long[n + 1];
                for (int i = 0; i < N; i++) {
                    int idx = i / 2 + 1;
                    if (i % 2 == 0) {
                        a[idx] += a[idx - 1] + A[i];
                    } else {
                        b[idx] += b[idx - 1] + A[i];
                    }
                }
                long max = b[n];
                for (int i = 0; i <= N; i += 2) {
                    int idx = i / 2;
                    long temp = a[idx] + (b[n] - b[idx]);
                    temp = Math.max(temp, a[idx] + a[n + 1] - a[idx + 1]);
                    temp = Math.max(temp, b[idx] + a[n + 1] - a[idx + 1]);
                    for (int j = i + 2; j <= N; j += 2) {
                        int idx2 = j / 2;
                        temp = Math.max(temp, a[idx] + b[idx2] - b[idx] + a[n + 1] - a[idx2 + 1]);
                    }
                    max = Math.max(max, temp);
                }
                out.println(max);
            }
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

        public int[] Int(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Int();
            }
            return a;
        }

    }
}

