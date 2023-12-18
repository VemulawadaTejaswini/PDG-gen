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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        long f(long a) {
            if (a % 2 == 1) {
                if ((a & 2) == 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
            long res = 0;
            for (int i = 60; i >= 1; i--) {
                if ((a & (1L << i)) != 0) {
                    res |= (1L << i);
                }
            }
            if ((a & 2) == 0) {
                return res;
            } else {
                return res | 1;
            }
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            long a = in.nl(), b = in.nl();
            if (a == 0)
                out.println(f(b));
            else
                out.println(f(b) ^ f(a - 1));

        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String ns() {
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

        public long nl() {
            return Long.parseLong(ns());
        }

    }
}

