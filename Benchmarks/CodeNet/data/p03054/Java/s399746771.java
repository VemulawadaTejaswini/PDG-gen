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
        B_LRUDGame solver = new B_LRUDGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class B_LRUDGame {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int height = in.nextInt();
            int width = in.nextInt();
            int n = in.nextInt();
            int sr = in.nextInt() - 1;
            int sc = in.nextInt() - 1;
            char[] s = in.next().toCharArray();
            char[] t = in.next().toCharArray();
            if (canRemove(n, s, t, height, sr, 'U', 'D')) {
                out.println("NO");
                return;
            }
            if (canRemove(n, s, t, width, sc, 'L', 'R')) {
                out.println("NO");
                return;
            }
            out.println("YES");
        }

        private boolean canRemove(int n, char[] s, char[] t, int len, int x, char neg, char pos) {
            if (canForce(n, s, t, len, x, neg, pos)) {
                return true;
            }
            if (canForce(n, s, t, len, len - x - 1, pos, neg)) {
                return true;
            }
            return false;
        }

        private boolean canForce(int n, char[] s, char[] t, int len, int x, char neg, char pos) {
            for (int i = 0; i < n; i++) {
                if (s[i] == neg) {
                    --x;
                }
                if (x < 0) {
                    return true;
                }
                if (t[i] == pos && x + 1 < len) {
                    ++x;
                }
            }
            return false;
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

