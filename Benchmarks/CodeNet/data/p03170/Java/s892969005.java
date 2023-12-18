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
        K_Stones solver = new K_Stones();
        solver.solve(1, in, out);
        out.close();
    }

    static class K_Stones {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.ni(), k = in.ni();
            int[] a = in.na(n);
            boolean[] won = new boolean[k + 1];
            for (int num = 0; num <= k; num++) {
                if (!won[num]) {
                    for (int i = 0; i < n; i++) {
                        if (num + a[i] <= k) {
                            won[num + a[i]] = true;
                        }
                    }
                }
            }
            if (won[k]) {
                out.println("First");
            } else
                out.println("Second");

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

        public int ni() {
            return Integer.parseInt(ns());
        }

        public int[] na(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = ni();
            return a;
        }

    }
}

