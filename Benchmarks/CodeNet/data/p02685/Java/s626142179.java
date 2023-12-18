
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        long ans = 0;
        final int MOD = 998244353;

        long[] pow_mminus1 = new long[n];   //先に計算しとく。
        long[] nminus1Cx = new long[n];
        pow_mminus1[0] = m;
        nminus1Cx[0] = 1;
        for(int i=1;i<n;i++){
            pow_mminus1[i] = pow_mminus1[i-1] * (m-1) % MOD;
            nminus1Cx[i] = nminus1Cx[i-1] * (n-i) % MOD;
            nminus1Cx[i] = modDivision(nminus1Cx[i], i, MOD);
        }

        for(int i=0;i<=k;i++){  //隣り合うブロックの組であって同じ色で塗られている組がi組であるとき、
            long ans_ = pow_mminus1[n-i-1] * nminus1Cx[i];
            ans += ans_;
            ans %= MOD;
        }
        System.out.println(ans);
    }

    private static long combination(long n, long k){
        if(k <= 0 || n <= 0 || n <= k){
            return 1;
        }
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private static long combination(long n, long k, long mod){
        if(k <= 0 || n <= 0 || n <= k){
            return 1;
        }
        return factorial(n, mod) / (factorial(k, mod) * factorial(n - k, mod)) % mod;
    }

    private static long factorial(long l){
        long ans = 1;
        while(l > 0){
            ans *= l;
            l--;
        }
        return ans;
    }

    private static long factorial(long l, long mod){
        long ans = 1;
        while(l > 0){
            ans *= l;
            ans %= mod;
            l--;
        }
        return ans;
    }

    private static long modDivision(long a, long b, long mod){
        return a * modInv(b, mod) % mod;
    }

    private static long modInv(long a, long mod){   // a÷b%p → a * modInv(b, p) % p
        exEuclid(a, mod);
        EUCX %= mod;
        return EUCX >= 0 ? EUCX : EUCX + mod;
    }

    static long EUCX, EUCY;
    private static long exEuclid(long a, long b){
        if(b == 0){
            EUCX = 1;
            EUCY = 0;
            return a;
        }
        long d = exEuclid(b, a%b);
        long px = EUCX;
        EUCX = EUCY;
        EUCY = px;
        EUCY -= a/b*EUCX;
        return d;
    }
}
