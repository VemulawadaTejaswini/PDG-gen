
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.util.*;

public class Main {
    long MOD = (long) 1e9 + 7;

    InputStream in;
    OutputStream out;

    public Main() {
        this(System.in, System.out);
    }

    public Main(InputStream in, OutputStream out) {
        this.in = in;
        this.out = out;
    }
    int N;
    int[] ar;
    String s;
    HashMap<String, Integer> map = new HashMap<>();

    void run() {
        Scanner sc = new Scanner(this.in);
        PrintWriter out = new PrintWriter(this.out);

        // write your code
        N = sc.nextInt();
        s = sc.next();
        ar = new int[N];
        for (int i = 0; i < N; i++) {
            ar[i] = s.charAt(i) - '1';
        }

        long cnt1 = 0;
        long cnt2 = 0;
        boolean exists = false;
        Combination comb = new Combination(N, MOD);
        for (int i = 0; i < N; i++) {
            exists |= ar[i] == 1;
            if (ar[i] == 1) {
//                debug(ar[i], comb.nck(N - 1, i));
                cnt1 = (cnt1 + comb.nck(N - 1, i)) % MOD;
            } else if (ar[i] == 2) {
//                debug(ar[i], comb.nck(N - 1, i));
                cnt2 = (cnt2 + comb.nck(N - 1, i)) % MOD;
            }
        }

        debug(cnt1, cnt2);

        if (cnt1 % 2 == 1) {
            out.println(1);
        } else {
            if (exists) {
                out.println(0);
            } else if (cnt2 % 2 == 1) {
                out.println(2);
            } else {
                out.println(0);
            }
        }


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
            return n < k ? 0 : facts[n] * (inv(facts[n - k]) * inv(facts[k]) % mod) % mod;
        }
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}