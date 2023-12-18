import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        ProblemE_MajorityOfBalls solver = new ProblemE_MajorityOfBalls();
        solver.solve(1, in, out);
        out.close();
    }

    static class ProblemE_MajorityOfBalls {
        FastScanner in;
        PrintWriter out;
        int n;
        char[] ans;
        int opsSpent;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            this.in = in;
            this.out = out;
            n = in.nextInt();
            ans = new char[2 * n];
            Arrays.fill(ans, '.');

            int l = -1;
            char prev = '.';
            for (int i = 0; i <= n; i++) {
                char cur = send(i);
                if (i > 0) {
                    if (prev != cur) {
                        l = i - 1;
                        ans[i - 1] = prev;
                        ans[i + n - 1] = cur;
                        break;
                    }
                }
                prev = cur;
            }

            if (l < 0) {
                throw new AssertionError();
            }

            int[] a = new int[n];
            for (int i = 1; i < n; i++) {
                a[i] = l + i;
            }
            int[] b = new int[n];
            int[] got = new int[256];
            int bPtr = 1;
            for (int i = 0; i < 2 * n; i++) {
                if (i < l || i >= l + n) {
                    a[0] = i;
                    ans[i] = send(a);
                    if (got[ans[i]] < n / 2) {
                        b[bPtr++] = i;
                        ++got[ans[i]];
                    }
                }
            }
            if (bPtr != n) {
                throw new AssertionError();
            }
            for (int i = l; i < l + n; i++) {
                b[0] = i;
                ans[i] = send(b);
            }

            sendAns();
        }

        private char send(int from) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = from + i;
            }
            return send(a);
        }

        private char send(int[] a) {
            ++opsSpent;
            while (opsSpent > 210) {

            }
            out.print("?");
            for (int x : a) {
                out.print(" " + (x + 1));
            }
            out.println();
            out.flush();
            return in.next().equals("Red") ? 'R' : 'B';
        }

        private void sendAns() {
            out.println("! " + new String(ans));
            out.flush();
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

