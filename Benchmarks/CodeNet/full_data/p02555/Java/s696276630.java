
import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        long MOD = (long) 1e9 + 7;


        int s = sc.nextInt();
        Combination combi = new Combination(2100, MOD);

        if (s < 3) {
            System.out.println(0);
            return;
        }
        long ans = 1;
        for (int i = 2; i <= s / 3; i++) {
//            debug(i, combi.nck(s - i * 3 + i - 1, i - 1));
            ans = (ans + combi.nck(s - i * 3 + i - 1, i - 1) % MOD) % MOD;
        }

        System.out.println(ans);

        // out.println("Hello World");
        out.flush();
    }

    public class Combination {
        int n;
        long mod;
        long[] facts;

        public Combination(int n, long mod) {
            this.n = n;
            this.mod = mod;
            facts = new long[n];
            facts[0] = 1;
            for (int i = 1; i < n; i++) {
                facts[i] = facts[i - 1] * i % mod;
            }
        }

        long modpow(long a, long b) {
            if (b == 0) return 1;
            else if (b == 1) return a;

            long x = modpow(a, b / 2);
            return b % 2 == 0 ? x * x % mod : x * (x * a % mod) % mod;
        }

        long inv(long n) {
            return modpow(n, mod - 2);
        }

        public long nck(int n, int k) {
            if (n < k) return 0;
            return facts[n] * (inv(facts[n - k]) * inv(facts[k]) % mod) % mod;
        }
    }


    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
