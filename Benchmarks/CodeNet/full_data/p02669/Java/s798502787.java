import java.math.BigInteger;
import java.util.*;
import java.io.*;
import java.text.*;

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

    static long mod = (long) 998244353;

    static long pro(long a, long b) {
        return (a % mod * b % mod) % mod;
    }

    static long add(long a, long b) {
        return (a + b) % mod;
    }

    static long sub(long a, long b) {
        return ((a % mod - b % mod) + mod) % mod;
    }

    static long maxn = Long.MAX_VALUE;

    static int pow(int n) {
        return (int) (Math.log10(n) / Math.log10(2));
    }

    static long modpow(long x, long y) {
        long res = 1l;
//        x %= mod;
        while (y > 0) {
            if (y % 2 != 0)
                res *= x;
            x = x * x;
            y /= 2;
        }
        return res;
    }

    static class pair {
        String a;
        int b;

        pair(String x, int y) {
            a = x;
            b = y;
        }
    }

    static long modInverse(long n) {
        BigInteger n1 = new BigInteger(Long.toString(n));
        String s = (n1.modInverse(new BigInteger(Long.toString(mod)))).toString();
        return Long.parseLong(s) % mod;
    }

    static boolean v[] = new boolean[1000005];

    static void seive() {
        v[1] = true;
        for (int i = 2; i < 1000005; i++) {
            if (!v[i]) {
                for (int j = 2 * i; j < 1000005; j += i)
                    v[j] = true;
            }
        }
    }

    static boolean isprime(long n) {
        if (n == 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static DecimalFormat df = new DecimalFormat("0.000000000000000000000");

    static class trie {
        trie a[] = new trie[26];
        int cnt = 0;
    }

    static long n, a, b, c, d;
    static long inf = (long) 4e18;
    static HashMap<Long, Long> map = new HashMap<>();

    static long f(long s, long val[], int mul[]) {
        if (s == 0)
            return 0;
        if (s == 1)
            return d;
        if (map.containsKey(s))
            return map.get(s);
        long res = inf;
        if (d < inf / s)
            res = Math.min(res, s * d);
        for (int i = 0; i < 3; i++) {
            if (s % mul[i] == 0)
                res = Math.min(res, val[mul[i]] + f(s / mul[i], val, mul));
            else {
                long down = s / mul[i] * mul[i];
                res = Math.min(res, val[mul[i]] + d * (s - down) + f(s / mul[i], val, mul));
                long up = down + mul[i];
                res = Math.min(res, val[mul[i]] + d * (up - s) + f(s / mul[i] + 1, val, mul));
            }
        }
        map.put(s, res);
        return res;
    }

    static void solve() {
        n = nlo();
        a = nlo();
        b = nlo();
        c = nlo();
        d = nlo();
        long arr[] = {-1, -1, a, b, -1, c};
        int mul[] = {2, 3, 5};
        out.println(f(n, arr, mul));
    }


    public static void main(String args[]) {
        int t = ni();
        while (t-- > 0) {
            solve();
            map.clear();
        }
        out.close();
    }
}

