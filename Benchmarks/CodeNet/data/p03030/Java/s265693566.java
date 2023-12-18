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

    static class pair implements Comparable<pair> {
        int id;
        String s;
        int sc;

        pair(int a, String b, int c) {
            id = a;
            s = b;
            sc = c;
        }

        public int compareTo(pair a) {
            if (!this.s.equals(a.s))
                return this.s.compareTo(a.s);
            return a.sc - this.sc;
        }
    }

    static void solve() {
        int n = ni();
        pair d[] = new pair[n];
        for (int i = 0; i < n; i++) {
            String s = sn();
            int p = ni();
            d[i] = new pair(i, s, p);
        }
        Arrays.sort(d);
        for (pair h : d)
            out.println(h.id+1);
    }
}