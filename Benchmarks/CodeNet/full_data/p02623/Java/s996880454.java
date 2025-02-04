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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            int M = in.Int();
            int K = in.Int();
            int[] A = in.Int(N);
            int[] B = in.Int(M);

            long time = 0;
            int ans = 0;
            int i = 0;
            int j = 0;
            while (true) {
                if (i < A.length && j < B.length) {
                    if (A[i] <= B[j]) {
                        if (time + A[i] > K) break;
                        time += A[i++];
                    } else {
                        if (time + B[j] > K) break;
                        time += B[j++];
                    }
                } else if (i < A.length) {
                    if (time + A[i] > K) break;
                    time += A[i++];
                } else if (j < B.length) {
                    if (time + B[j] > K) break;
                    time += B[j++];
                } else {
                    break;
                }
                ans++;
            }
            out.println(ans);
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
                    return null;
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

