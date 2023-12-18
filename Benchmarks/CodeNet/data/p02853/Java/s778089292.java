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
        ProblemA_DDCCFinals solver = new ProblemA_DDCCFinals();
        solver.solve(1, in, out);
        out.close();
    }

    static class ProblemA_DDCCFinals {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int x = in.nextInt();
            int y = in.nextInt();
            int ans = f(x) + f(y);
            if (x == 1 && y == 1) {
                ans += 400000;
            }
            out.println(ans);
        }

        private int f(int x) {
            if (x > 3) {
                return 0;
            }
            return 100000 * (4 - x);
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

