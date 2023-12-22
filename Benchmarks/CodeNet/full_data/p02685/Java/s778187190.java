
import java.util.*;
public class Main {
    private static long N, M, K;
    private static final long MOD = 998244353L;
    private static Map<Long, Long> ans = new HashMap<>();
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        M = sc.nextLong();
        K = sc.nextLong();
        long sum = 0;
        initCom();
        for(int i=0;i<=K;i++){
            sum += fun(i);
            sum %= MOD;
        }
        System.out.println(sum);
    }
    static int MAX = 510005;

    private static long[] FAC = new long[MAX];
    private static long[] INV_FAC = new long[MAX];

    private static void initCom(){
        FAC[0]=FAC[1]=1;
        INV_FAC[0]=INV_FAC[1]=1;
        for(int i=2;i<MAX;i++){
            FAC[i]=FAC[i-1]*i % MOD;
            INV_FAC[i]=modinv(FAC[i]);
        }
    }

    private static long comb(int n, int k){
        return (((FAC[n] * INV_FAC[n-k]) % MOD) * INV_FAC[k]) % MOD;
    }


    private static long modpow(long a, long b){
        if(b == 1){
            return a % MOD;
        }
        if(b == 0){
            return 1;
        }
        long res = b/2;
        long rem = b%2;
        long p = modpow(a, res) % MOD;
        if(rem == 1){
            return (((p*p) % MOD)*a) % MOD;
        }else{
            return (p*p) % MOD;
        }
    }

    private static long modinv(long a){
        return modpow(a, MOD-2);
    }


    private static long lucus(int n, int k, int mod){
        long res = 1L;
        while(n > 0){
            int n1 = n % mod;
            int k1 = k % mod;
            if(n1 == k1){
                res *= 1;
                n /= mod;
                k /= mod;
                continue;
            }else if(n1 < k1){
                res = 0;
                break;
            }else {
                res *= (long) comb(n1, k1);
                res %= mod;
                n /= mod;
                k /= mod;
            }
        }
        return res;
    }

    private static long fun(int k){
        long ans = comb((int)N-1, k);
        ans %= MOD;
        ans *= M;
        ans %= MOD;
        ans *= modpow(M-1, N-k-1);
        ans %= MOD;
        return ans;
    }

}
