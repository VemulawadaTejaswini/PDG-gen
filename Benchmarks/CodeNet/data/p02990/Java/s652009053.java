import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class D {
    static final int MAX = 100100;
    InputStream in = System.in;
    PrintStream out = System.out;
    // static int dp[][] = new int[MAX][MAX];
    static final long MOD = (long)Math.pow(10,9)+7;

    public static long mod(long i) {
        return i % MOD + ((i % MOD) < 0 ? MOD : 0);
    }

    public static long mul(long m, long n) {
        return mod(m*n);
    }

    static long pow(long x, long y) {
        if (y == 0) {
            return 1;
        } else if (y == 1) {
            return x;
        } else if (y % 2 == 0) {
            long tmp = pow(x, y / 2);
            return mod(tmp * tmp);
        } else {
            long tmp = pow(x, y / 2);
            return mod(mod(tmp * tmp) * x);
        }
    }

    static long inv(long x) {
        return pow(x, MOD - 2);
    }

    static int MAX_FACT = 20100;
    static long fact[] = new long[MAX_FACT];
    static void prepareFact() {
        fact[0] = 1;
        for(int i = 1; i < MAX_FACT; i ++) {
            fact[i] = mod(fact[i - 1] * i);
        }
    }
    static long comb(int n, int r) {
        if(n < 0 || n < r) { return 0; }
        if(r == 0 || r == n) { return 1; }
        return mod(mod(fact[n] * inv(fact[r])) * inv(fact[n - r]));
    }

    public void _main(String[] args) {
        Scanner sc = new Scanner(in);
        prepareFact();
        int N = sc.nextInt();
        int K = sc.nextInt();
        for (int i=1;i<=K;i++){
            long ans = comb(N-K+1, i);
            long mul = comb(K-i+i-1, i-1);
            ans = mod(ans * mul);
            out.println(ans);
        }
    }

    public static void main(String[] args) {
        new D()._main(args);
    }
}
