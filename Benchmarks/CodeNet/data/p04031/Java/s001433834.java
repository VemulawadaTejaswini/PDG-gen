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

    static int maxn = 200005;

    static void solve() {
        int n = ni();
        int a[] = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = ni();
            set.add(a[i]);
        }
        if (set.size() == 1) {
            out.println(0);
            return;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = -100; i <= 100; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += (a[j] - i) * (a[j] - i);
            }
            if (sum < ans)
                ans = sum;

        }
        out.println(ans);
    }
}