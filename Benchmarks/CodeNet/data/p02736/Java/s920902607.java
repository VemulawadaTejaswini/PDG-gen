import java.util.*;

public class Main {
    static int MAX = 5_000;
    static int MOD = 1_000_000_007;

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

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] s = S.toCharArray();
        int[] ans = new int[N];
        long sum = 0;
        initCom();
        boolean aruflag = false;
        for(int i=0;i<N;i++) {
            ans[i] = s[i] - '1';
            if(ans[i] == 1){aruflag = true;}
        }
        for(int i=0;i<N;i++){
            sum += lucus(N-1, i, 2) * ans[i];
            //System.out.print(lucus(N-1, i, 2)+" ");
            sum %= 2;
        }
        int res = 20;
        if(sum % 2 == 1){
            res = 1;
        }else if(!aruflag){
            sum = 0;
            for(int i=0;i<N;i++){
                sum += lucus(N-1, i, 2) * (ans[i]/2);
                sum %= 2;
            }
            if(sum % 2 == 1){
                res = 2;
            }else{
                res = 0;
            }
        }else{
            res = 0;
        }
        System.out.println(res);
    }

}
