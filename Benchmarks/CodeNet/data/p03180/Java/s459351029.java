
import java.io.*;
import java.text.*;
import java.util.*;

public class Main{

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
        long maxi = Integer.MAX_VALUE;
        long mod = (long) (1e9 + 7);
        long pre[], dp[];

        void recur(int i, int mask, int new_msk, long score, List<Integer> list, int size) {
            if (i == size) {
                dp[mask] = Math.max(dp[mask], score + pre[new_msk]);
                return;
            }
            recur(i + 1, mask, new_msk, score, list, size);
            int val = list.get(i);
            recur(i + 1, mask | (1 << val), new_msk | (1 << val), score, list, size);
        }

        void solve() {
            int n = sc.ni();
            long a[][] = new long[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    a[i][j] = sc.nlo();
            }
            int mask = 1 << n;
            dp = new long[mask];
            pre = new long[mask];
            for (int i = 0; i < mask; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) > 0) {
                        for (int k = j + 1; k < n; k++) {
                            if ((i & (1 << k)) > 0)
                                pre[i] += a[j][k];
                        }
                    }
                }
            }
            Arrays.fill(dp, Long.MIN_VALUE);
            dp[0] = 0;
            for (int i = 0; i < mask; i++) {
                List<Integer> not_taken = new ArrayList<>();
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) == 0) {
                        not_taken.add(j);
                        cnt++;
                    }
                }
                recur(0, i, 0, dp[i], not_taken, cnt);
            }
            out.println(dp[mask - 1]);
        }
    }
}
