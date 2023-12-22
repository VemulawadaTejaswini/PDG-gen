import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        long [] a = new long[n];
        for (int i = 0; i <n; i++) a[i] = sc.nextLong();
        mod = (long) 1e9 + 7;
        long sq = 0;
        for (int i = 0; i < n; i++) sq = (sq + (a[i] * a[i]) % mod) % mod;
        long sum = 0;
        for (int i = 0; i < n; i++) sum = (sum + a[i]) % mod;
        sum = (sum * sum) % mod;
        long ret = sum - sq;
        ret = (ret * inv(2)) % mod;
        if (ret < 0) ret += mod;
        out.println(ret);
        out.close();
    }

    static long[] fac;
    static long mod = (long) 1e9 + 7;

    static void initFac(long n) {
        fac[0] = 1;
        for (int i = 1; i <= n; i++) {
            fac[i] = (fac[i - 1]  * i) % mod;
        }
    }

    static long exponentiation(long base, long exp)
    {
        long t = 1L;
        while (exp > 0) {

            // for cases where exponent
            // is not an even value
            if (exp % 2 != 0)
                t = (t * base) % mod;

            base = (base * base) % mod;
            exp /= 2;
        }
        return t % mod;
    }

    static long nck(int n, int k) {
        if (n < k)
            return 0;
        long den = inv((int) (fac[k] * fac[n - k] % mod));
        return fac[n] * den % mod;
    }

    static long pow(long b, long e) {
        long ans = 1;
        while (e > 0) {
            if (e % 2 == 1)
                ans = ans * b % mod;
            e >>= 1;
            b = b * b % mod;
        }
        return ans;
    }

    static long inv(long x) {
        return pow(x, mod - 2);
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}