import java.io.*;
import java.text.*;
import java.util.*;

public class Main {

    static InputReader sc = new InputReader(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        solver s = new solver();
        int t = 1;
        while (t > 0) {
            s.solve();
            t--;
        }
        out.close();
    }

    static class InputReader {

        public BufferedReader br;
        public StringTokenizer token;

        public InputReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream), 32768);
            token = null;
        }

        public String sn() {
            while (token == null || !token.hasMoreTokens()) {
                try {
                    token = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return token.nextToken();
        }

        public int ni() {
            return Integer.parseInt(sn());
        }

        public String snl() throws IOException {
            return br.readLine();
        }

        public long nlo() {
            return Long.parseLong(sn());
        }

        public double nd() {
            return Double.parseDouble(sn());
        }

        public int[] na(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.ni();
            return a;
        }

        public long[] nal(int n) {
            long a[] = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nlo();
            return a;
        }
    }

    static int inf = 5000013;

    static class solver {
        DecimalFormat df = new DecimalFormat("0.00000000");
        long maxi = 200000005;
        int n, val[];
        long w;
        long a[];

        void solve() {
            n = sc.ni();
            w = sc.nlo();
            int sum = 0;
            a=new long[n];
            val=new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nlo();
                val[i] = sc.ni();
                sum += val[i];
            }
            boolean sos[][] = new boolean[n + 1][sum + 1];
            for (int i = 0; i < n + 1; i++)
                sos[i][0] = true;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= sum; j++) {
                    if (j >= val[i - 1])
                        sos[i][j] = sos[i - 1][j] | sos[i - 1][j - val[i - 1]];
                    else
                        sos[i][j] = sos[i - 1][j];
                }
            }
            long dp[][] = new long[n + 1][sum + 1];
            for (int i = 1; i <= sum; i++)
                dp[0][i] = maxi;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= sum; j++) {
                    if (j >= val[i - 1])
                        dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - val[i - 1]] + a[i - 1]);
                    else
                        dp[i][j] = dp[i - 1][j];
                }
            }
            for (int i = sum; i >= 1; i--) {
                if (sos[n][i] && dp[n][i] <= w) {
                    out.println(i);
                    break;
                }
            }
        }
    }
}
