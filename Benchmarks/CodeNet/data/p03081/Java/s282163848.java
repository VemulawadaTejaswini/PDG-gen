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
        C_SnukeTheWizard solver = new C_SnukeTheWizard();
        solver.solve(1, in, out);
        out.close();
    }

    static class C_SnukeTheWizard {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            char[] s = in.next().toCharArray();
            int[] dir = new int[q];
            char[] let = new char[q];
            for (int i = 0; i < q; i++) {
                let[i] = in.next().charAt(0);
                dir[i] = in.next().equals("L") ? -1 : +1;
            }
            int pref = 0;
            int suff = 0;
            int maxPref = 0;
            int maxSuff = 0;
            for (int i = q - 1; i >= 0; i--) {
                if (pref < n && let[i] == s[pref] && dir[i] < 0) {
                    ++pref;
                } else if (pref > 0 && let[i] == s[pref - 1] && dir[i] > 0) {
                    --pref;
                }
                if (suff < n && let[i] == s[n - 1 - suff] && dir[i] > 0) {
                    ++suff;
                } else if (suff > 0 && let[i] == s[suff - 1] && dir[i] < 0) {
                    --suff;
                }
                maxPref = Math.max(maxPref, pref);
                maxSuff = Math.max(maxSuff, suff);
            }
            int ans = n;
            for (int i = 0; i < n; i++) {
                if (i < maxPref || i >= n - maxSuff) {
                    --ans;
                }
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

