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
        long mod = (long) (1e9 + 7);
        int n;
        long h[], a[];

        class pair implements Comparable<pair> {
            long a;
            int index;

            pair(long b, int a) {
                this.a = b;
                index = a;
            }

            public int compareTo(pair a) {
                return (int) (h[this.index] - h[a.index]);
            }
        }

        void solve() {
            n = sc.ni();
            h = sc.nal(n);
            a = sc.nal(n);
            long dp[] = new long[n];
            TreeSet<pair> set = new TreeSet<pair>();
            pair arr[] = new pair[n];
            long ans = 0;
            for (int i = 0; i < n; i++) {
                dp[i] = a[i];
                arr[i] = new pair(h[i], i);
                set.add(arr[i]);
            }
            for (int i = 0; i < n; i++) {
                ans = Math.max(ans, dp[i]);
                pair p = arr[i];
                set.remove(p);
                pair nxt = set.higher(p);
                while (nxt != null) {
                    if (dp[nxt.index] < (dp[i] + a[nxt.index]))
                        dp[nxt.index] = dp[i] + a[nxt.index];
                    nxt = set.higher(nxt);
                }
            }
//            long ans = 0;
//            for (int i = 0; i < n; i++)
//                ans = Math.max(ans, dp[i]);
            out.println(ans);
        }
    }
}
