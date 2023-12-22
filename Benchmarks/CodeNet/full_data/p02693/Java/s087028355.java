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

    static long mod = (long) 1e9 + 7;

    static long pro(long a, long b) {
        return (a % mod * b % mod) % mod;
    }

    static int maxn = 100005;

    static class sort implements Comparator<String> {
        public int compare(String a, String b) {
            return a.length() - b.length();
        }
    }

    static void solve() {
        int k = ni();
        int a = ni();
        int b = ni();
        int f = 0;
        for (int i = a; i <= b; i++) {
            if (i % k == 0) {
                f = 1;
                out.println("OK");
                break;
            }
        }
        if (f == 0) {
            out.println("NG");
        }
    }
}