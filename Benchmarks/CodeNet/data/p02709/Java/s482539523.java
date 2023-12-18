import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EActiveInfants solver = new EActiveInfants();
        solver.solve(1, in, out);
        out.close();
    }

    static class EActiveInfants {
        pair[] arr;
        int n;
        long[][] memo;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            n = sc.nextInt();
            arr = new pair[n];
            for (int i = 0; i < n; i++)
                arr[i] = new pair(sc.nextInt(), i);
            Arrays.sort(arr, (a, b) -> b.val - a.val);
            memo = new long[n][n];
            for (long[] x : memo)
                Arrays.fill(x, -1);
            pw.println(dp(0, n - 1));
        }

        private long dp(int l, int r) {
            if (l > r)
                return 0;
            if (memo[l][r] != -1)
                return memo[l][r];
            long takeL = 1l * arr[l + n - 1 - r].val * Math.abs(arr[l + n - 1 - r].idx - l) + dp(l + 1, r);
            long takeR = 1l * arr[l + n - 1 - r].val * Math.abs(arr[l + n - 1 - r].idx - r) + dp(l, r - 1);
            return memo[l][r] = Math.max(takeL, takeR);
        }

        class pair {
            int val;
            int idx;

            public pair(int val, int idx) {
                this.val = val;
                this.idx = idx;
            }

            public String toString() {
                return val + " " + idx;
            }

        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
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

