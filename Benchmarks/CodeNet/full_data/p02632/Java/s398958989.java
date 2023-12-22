import java.util.*;
import java.io.*;

public class Main {
    private static final int MOD = 1000000007, MAX = 1000001;
    private static final long[] fact = new long[MAX];

    public static void main(String[] args) throws IOException {
        final long[] pow = new long[MAX];
        pow[0] = 1;
        fact[0] = 1;
        for (int i = 1; i < MAX; ++i) {
            pow[i] = (pow[i - 1] * 25) % MOD;
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int n = s.length(), total = n + k;
        long res = pow(26, total);

        for (int i = 0; i < n; ++i) {
            res -= choose(total, i) * pow[total - i];
            res %= MOD;
            if (res < 0) {
                res += MOD;
            }
        }

        bw.write(Long.toString(res));
        bw.newLine();
        bw.close();
        br.close();
    }

    private static long pow(int base, int exponent) {
        long res = 1, extra = base;

        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                res *= extra;
                res %= MOD;
            }
            extra *= extra;
            extra %= MOD;
            exponent >>= 1;
        }

        return res;
    }

    private static long choose(int n, int r) {
        return fact[n] * modInverse((int)fact[r], MOD) % MOD * modInverse((int)fact[n - r], MOD) % MOD;
    }

    private static int modInverse(int a, int m)
    {
        int m0 = m;
        int y = 0, x = 1;

        if (m == 1)
            return 0;

        while (a > 1)
        {
            int q = a / m;

            int t = m;

            m = a % m;
            a = t;
            t = y;

            y = x - q * y;
            x = t;
        }

        if (x < 0)
            x += m0;

        return x;
    }
}
