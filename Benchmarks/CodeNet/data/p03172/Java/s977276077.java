import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
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
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        MCandies solver = new MCandies();
        solver.solve(1, in, out);
        out.close();
    }

    static class MCandies {
        int mod = (int) 1e9 + 7;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[][] dp = new int[n + 1][k + 1];
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++)
                arr[i] = sc.nextInt();
            dp[0][0] = 1;
            int[] prefix = new int[k + 1];
            Arrays.fill(prefix, 1);
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= k; j++) {
                    int left = prefix[j];
                    int idx = j - Math.min(arr[i], j) - 1;
                    int right = 0;
                    if (idx >= 0)
                        right = prefix[idx];
                    dp[i][j] += left - right;
//                for (int cur = 0; cur <= Math.min(arr[i], j); cur++) {
//                    dp[i][j] += dp[i - 1][j - cur];
//                    //from0 to cur
//                }
                }
                prefix[0] = dp[i][0] % mod;
                for (int j = 1; j <= k; j++)
                    prefix[j] = (int) ((1l * dp[i][j] + prefix[j - 1]) % mod);
            }
            pw.println(dp[n][k]);
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

