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
        A_StudyScheduling solver = new A_StudyScheduling();
        solver.solve(1, in, out);
        out.close();
    }

    static class A_StudyScheduling {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int h1 = in.nextInt();
            int m1 = in.nextInt();
            int h2 = in.nextInt();
            int m2 = in.nextInt();
            int k = in.nextInt();
            int l = h1 * 60 + m1;
            int r = h2 * 60 + m2 - k;
            out.println(Math.max(r - l, 0));
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

