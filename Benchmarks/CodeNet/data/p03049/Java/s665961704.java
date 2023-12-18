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
        CABSubstrings solver = new CABSubstrings();
        solver.solve(1, in, out);
        out.close();
    }

    static class CABSubstrings {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.ni();
            int ba = 0, xa = 0, bx = 0;
            int ans = 0;
            for (int i = 0; i < N; i++) {
                String s = in.ns();
                for (int j = 1; j < s.length(); j++) {
                    if (s.charAt(j - 1) == 'A' && s.charAt(j) == 'B')
                        ans++;
                }
                int n = s.length();
                char first = s.charAt(0);
                char last = s.charAt(n - 1);
                if (first == 'B' && last == 'A') {
                    ba++;
                } else if (first == 'B') {
                    bx++;
                } else if (last == 'A') {
                    xa++;
                }
            }

            if (ba > 0) {
                ans += ba - 1;
                ba = 1;
            }
            int cnt = Math.min(xa, bx);
            ans += cnt;
            xa -= cnt;
            bx -= cnt;
            if (ba > 0 && (xa > 0 || bx > 0)) {
                ans++;
            }
            out.println(ans);
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

    }
}

