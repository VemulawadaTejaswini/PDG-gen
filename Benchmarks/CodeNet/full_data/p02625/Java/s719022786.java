import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        int m = sc.nextInt();
        long ans = 0;
        fac = new long[m + 3];
        initFac(m + 2);
        for (int i = 0; i <= n; i++) {
            long sgn = (i % 2 == 0 ? 1 : -1);
            long toSquare = (nck(m - i, n - i) * fac[n - i]) % mod;
            long outside = (nck(m, i) * nck(n, i)) % mod;
            long total = (((outside * toSquare) % mod) * toSquare) % mod;
            total = (total * fac[i]) % mod;
            ans = (ans + sgn * total) % mod;
            if (ans < 0) ans += mod;
        }
        out.println(ans);
        out.close();
    }

    static long[] fac;
    static int mod = (int) 1e9 + 7;

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

    static int pow(long b, int e) {
        long ans = 1;
        while (e > 0) {
            if (e % 2 == 1)
                ans = ans * b % mod;
            e >>= 1;
            b = b * b % mod;
        }
        return (int) ans;
    }

    static int inv(int x) {
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