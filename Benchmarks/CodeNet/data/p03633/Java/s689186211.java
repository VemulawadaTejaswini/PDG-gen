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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

        long lcm(long[] p) {
            long g = gcd(p[0], p[1]);
            long l = (p[0] / g) * p[1];
            for (int i = 2; i < p.length; i++) {
                g = gcd(l, p[i]);
                l = l / g * p[i];
            }
            return l;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            if (n == 1) {
                out.println(in.nextLong());
                return;
            }
            long[] t = new long[n];
            for (int i = 0; i < n; i++) {
                t[i] = in.nextLong();
            }
            out.println(lcm(t));
        }

    }

    static class InputReader {
        StringTokenizer st;
        BufferedReader br;

        public InputReader(InputStream is) {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            this.br = br;
        }

        public String next() {
            if (st == null || !st.hasMoreTokens()) {
                String nextLine = null;
                try {
                    nextLine = br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (nextLine == null)
                    return null;
                st = new StringTokenizer(nextLine);
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
 