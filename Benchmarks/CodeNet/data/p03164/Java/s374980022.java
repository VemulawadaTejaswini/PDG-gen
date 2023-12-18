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
        int maxi = 200000000;
        int n;
        long w;
        long a[][];

        void solve() {
            n = sc.ni();
            w = sc.nlo();
            a = new long[n][2];
            for (int i = 0; i < n; i++) {
                a[i][0] = sc.nlo();
                a[i][1] = sc.nlo();
            }
            dp=new HashMap[n];
            for (int i = 0; i < n; i++)
                dp[i] = new HashMap<>();
            out.println(rec(0, w, 0));
        }

        HashMap<Long, Long> dp[];

        long rec(int i, long cap, long val) {
            if (i == n || cap == 0)
                return val;
            if (dp[i].containsKey(cap))
                return dp[i].get(cap);
            long res = rec(i + 1, cap, val);
            if (a[i][0] > cap)
                return res;
            res = Math.max(res, rec(i + 1, cap - a[i][0], val + a[i][1]));
            dp[i].put(cap, res);
            return res;
        }
    }
}
