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
        long maxi = Integer.MAX_VALUE;
        int max = 0;
        List<Integer> list[];
        boolean v[];
        int dp[];

        void solve() {
            int n = sc.ni();
            int m = sc.ni();
            list = new ArrayList[n];
            dp = new int[n];
            for (int i = 0; i < n; i++)
                list[i] = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                int u = sc.ni() - 1;
                int v = sc.ni() - 1;
                list[u].add(v);
            }
            v = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (!v[i]) {
                    dfs(i);
                }
            }
            for(int i=0;i<n;i++)
                max=Math.max(max,dp[i]);
            out.println(max);
        }

        void dfs(int s) {
            v[s] = true;
            for (int h : list[s]) {
                if (!v[h])
                    dfs(h);
                dp[s] = Math.max(dp[s], dp[h] + 1);
            }
        }
    }
}
