import java.math.BigInteger;
import java.util.*;
import java.io.*;
import java.text.*;

class Main {
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
        int t = 1;
        while (t-- > 0) {
            solve();
        }
        out.close();
    }

    static long mod = (long) 1e9 + 7;

    static long pro(long a, long b) {
        return (a % mod * b % mod) % mod;
    }

    static long add(long a, long b) {
        return (a + b) % mod;
    }

    static long sub(long a, long b) {
        return ((a % mod - b % mod) + mod) % mod;
    }

    static int maxn = 1000005;

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
        return Long.parseLong(s);
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

    static void solve() {
        long arr[] = new long[3];
        for (int i = 0; i < 3; i++)
            arr[i] = nlo();
        long k = nlo();
        long sum = 0;
        for (int i = 0; i < 3 && k > 0; i++) {
            if (arr[i] >= k) {
                if (i == 0)
                    sum += k;
                else if (i == 2)
                    sum -= k;
                k = 0;
            } else {
                if (i == 0)
                    sum += arr[i];
                else if (i == 2)
                    sum -= arr[i];
                k -= arr[i];
            }
        }
        out.println(sum);
    }
}

