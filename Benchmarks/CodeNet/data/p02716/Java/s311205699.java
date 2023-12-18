import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.HashMap;
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
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        F solver = new F();
        solver.solve(1, in, out);
        out.close();
    }

    static class F {
        static long MIN = (long) -1e10;
        Map<String, Long> memo = new HashMap<>();

        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            int[] A = in.Int(N);
            int n = N / 2;

            long ans = calc(A, n, 0);
            ans = Math.max(ans, calc(A, n, 1));
            ans = Math.max(ans, calc(A, n, 2));
            out.println(ans);
        }

        private long calc(int[] A, int n, int idx) {
            String key = n + ":" + idx;
            if (memo.containsKey(key)) {
                return memo.get(key);
            }

            if (idx + (n - 1) * 2 >= A.length && n >= 1) {
                return MIN;
            }
            if (n == 1) {
                long ret = MIN;
                for (int i = idx; i < A.length; i++) {
                    ret = Math.max(ret, A[i]);
                }
                return ret;
            }

            long ret = MIN;
            int min = Math.min(idx + 2, A.length);
            for (int i = idx; i < min; i++) {
                ret = Math.max(ret, A[i] + calc(A, n - 1, i + 2));
            }

            memo.put(key, ret);
            return ret;
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

