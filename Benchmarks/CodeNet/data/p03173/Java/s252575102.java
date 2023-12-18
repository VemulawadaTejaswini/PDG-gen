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
        NSlimes solver = new NSlimes();
        solver.solve(1, in, out);
        out.close();
    }

    static class NSlimes {
        int n;
        int[] arr;
        long[][] memo;
        long[] prefix;
        long[] suffix;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            n = sc.nextInt();
            arr = new int[n];
            prefix = new long[n];
            suffix = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                prefix[i] = arr[i];
                if (i > 0)
                    prefix[i] += prefix[i - 1];
            }
            for (int i = n - 1; i >= 0; i--) {
                suffix[i] = arr[i];
                if (i < n - 1)
                    suffix[i] += suffix[i + 1];
            }
            memo = new long[n][n];
            for (long[] x : memo)
                Arrays.fill(x, -1);
            pw.println(dp(0, n - 1));
        }

        private long dp(int l, int r) {
            if (l == r)
                return 0;
            if (memo[l][r] != -1)
                return memo[l][r];
            long min = Long.MAX_VALUE;
            for (int i = l; i < r; i++) {
                long left = dp(l, i) + prefix[i] - (l > 0 ? prefix[l - 1] : 0);
                long right = dp(i + 1, r) + suffix[i + 1] - (r < n - 1 ? suffix[r + 1] : 0);
                min = Math.min(min, left + right);
            }
            return min;
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

