import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 32768);
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer t;

    static String sn() {
        while (t == null || !t.hasMoreTokens()) {
            try {
                t = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return t.nextToken();
    }

    static int ni() {
        return Integer.parseInt(sn());
    }

    static long nlo() {
        return Long.parseLong(sn());
    }

    public static void main(String args[]) {
        int t = 1;//ni();
        while (t-- > 0) {
            solve();
        }
        out.close();
    }

    static long mod = 998244353;

    static long pro(long a, long b) {
        return (a % mod * b % mod) % mod;
    }

    static long add(long a, long b) {
        return (a + b) % mod;
    }

    static int maxn = 200005;

    static void solve() {
        int n = ni();
        int m = ni();
        long a[] = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nlo();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long ans = 0;
        for (int l = 0; l <= Math.min(n, m); l++) {
            for (int r = 0; r <= Math.min(m - l, n - l); r++) {
                pq.clear();
                pq.add(0l);
                long sum = 0;
                for (int i = 0; i < l; i++) {
                    pq.add(a[i]);
                    sum += a[i];
                }
                for (int j = 0; j < r; j++) {
                    pq.add(a[n - j - 1]);
                    sum += a[n - j - 1];
                }
                int d = m - (l + r);
                for(int i=0;i<d;i++){
                    if (pq.peek() == 0)
                        break;
                    sum -= pq.poll();
                }
                ans = Math.max(ans, sum);
            }
        }
        out.println(ans);
    }
}