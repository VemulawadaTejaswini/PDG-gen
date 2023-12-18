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
        char c[] = sn().toCharArray();
        int n = c.length;
        int f[] = new int[26];
        for (int i = 0; i < n; i++)
            f[c[i] - 'a']++;
//        out.println(Arrays.toString(f));
        int ff = 0;
        for (int i = 0; i < 26; i++) {
            if (f[i] > 0 && f[i] % 2 != 0) {
                ff = 1;
                out.println("No");
                break;
            }
        }
        if (ff == 0)
            out.println("Yes");
    }
}