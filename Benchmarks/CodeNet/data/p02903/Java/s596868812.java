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
        A_01Matrix solver = new A_01Matrix();
        solver.solve(1, in, out);
        out.close();
    }

    static class A_01Matrix {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int height = in.nextInt();
            int width = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            char[][] s = new char[height][width];
            for (int r = 0; r < height; r++) {
                for (int c = 0; c < width; c++) {
                    if ((r < b) == (c < a)) {
                        s[r][c] = '0';
                    } else {
                        s[r][c] = '1';
                    }
                }
            }
            for (int r = 0; r < height; r++) {
                out.println(new String(s[r]));
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

