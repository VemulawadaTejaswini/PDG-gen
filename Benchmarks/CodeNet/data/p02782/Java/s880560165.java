import java.util.*;
import java.io.*;

public class Main {
    static long mod = (long) 1e9 + 7;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        long r1 = sc.nextLong(); long c1 = sc.nextLong(); long r2 = sc.nextLong(); long c2 = sc.nextLong();
        initFac(r2 + c2 + 3);
        long plus = (nck((int) (r2 + c2 + 2), (int) r2 + 1) + nck((int) (r1 + c1), (int) r1)) % mod;
        long minus = (nck((int) (r2 + c1 + 1), (int) r2 + 1) + nck((int) (r1 + c2 + 1), (int) r1)) % mod;
        long ans = (plus - minus) % mod;
        if (ans < 0) ans += mod;
        out.println(ans);
        out.close();
    }

    static long[] fac;

    static void initFac(long n) {
        fac = new long[(int) n + 1];
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
        return (fac[n] * den) % mod;
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

    static long inv(int x) {
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