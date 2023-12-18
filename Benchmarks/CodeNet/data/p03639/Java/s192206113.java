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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[3];
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                int p = 0;
                while (x % 2 == 0) {
                    ++p;
                    x /= 2;
                }
                p = Math.min(p, 2);
                ++a[p];
            }
            boolean spareTwo = false;
            if (a[0] > 0) {
                if (a[0] > a[2] + 1) {
                    out.println("No");
                    return;
                }
                if (a[0] < a[2] + 1) {
                    spareTwo = true;
                }
            }
            if (a[1] == 1 && !spareTwo) {
                out.println("No");
                return;
            }
            out.println("Yes");
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

