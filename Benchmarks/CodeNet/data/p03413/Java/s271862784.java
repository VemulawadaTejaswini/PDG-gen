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
        MyScan in = new MyScan(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, MyScan in, PrintWriter out) {
            int n = in.nextInt();
            long[] data = in.nl(n);
            long[][] res = new long[n + 1][n + 1];
            for (int s = 0; s < n; s++) {
                res[1][s] = data[s];
            }
            TaskE.NL[][] ppp = new TaskE.NL[n + 1][n + 1];
            for (int k = 2; k <= n; k++) {
                Arrays.fill(res[k], Long.MIN_VALUE);
                for (int f = 0; f < n - k + 1; f++) {
                    for (int l = 0; l < k; l++) {
                        long p1 = res[l][f];
                        long p2 = res[k - l - 1][f + l + 1];
                        if (res[k][f] < p1 + p2) {
                            res[k][f] = p1 + p2;
                            ppp[k][f] = new TaskE.NL(f + l + 1, ppp[l][f], ppp[k - l - 1][f + l + 1]);
                        }
                    }
                }
            }
            out.println(res[n][0]);
            out.println(pr(ppp[n][0]));
            pr(ppp[n][0], out);
        }

        private int pr(TaskE.NL nl) {
            int f = 1;
            if (nl == null) return 0;
            f += pr(nl.left);
            f += pr(nl.right);
            return f;
        }

        private void pr(TaskE.NL nl, PrintWriter out) {
            if (nl == null) return;
            pr(nl.left, out);
            pr(nl.right, out);
            out.println(nl.n);
        }

        private static class NL {
            int n;
            TaskE.NL left;
            TaskE.NL right;

            public NL(int n, TaskE.NL left, TaskE.NL right) {
                this.n = n;
                this.left = left;
                this.right = right;
            }

        }

    }

    static class MyScan {
        BufferedReader br;
        StringTokenizer st;

        MyScan(BufferedReader br) {
            this.br = br;
        }

        public MyScan(InputStream in) {
            this(new BufferedReader(new InputStreamReader(in)));
        }

        public void findToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public String next() {
            findToken();
            return st.nextToken();
        }

        public long[] nl(int n) {
            long[] k = new long[n];
            for (int i = 0; i < n; i++) {
                k[i] = nextLong();
            }
            return k;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

