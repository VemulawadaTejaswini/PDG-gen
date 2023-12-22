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
        ALDS1_5_A solver = new ALDS1_5_A();
        solver.solve(1, in, out);
        out.close();
    }

    static class ALDS1_5_A {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int n = in.Int();
            int[] A = in.Int(n);
            int q = in.Int();
            int[] m = in.Int(q);

            boolean[] b = new boolean[4001];
            int max = (int) Math.pow(2, n);
            for (int i = 1; i <= max; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    if (((i >> j) & 1) == 1) {
                        sum += A[j];
                        b[sum] = true;
                    }
                }
            }
            for (int i = 0; i < q; i++) {
                out.println(b[m[i]] ? "yes" : "no");
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


