import java.util.Scanner;

public class Main {
    private static long MOD=1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = (modpow(2, n) - 1 + MOD - comb(n, a)  + MOD - comb(n, b) + MOD) % MOD;
        System.out.println(ans);
    }

    private static long comb(long n, long a){
        long up = 1;
        long down = 1;
        for(int i=0;i<a;i++){
            up *= (n-i);
            up %= MOD;
            down *= (i+1);
            down %= MOD;
        }
        return (up * modinv(down)) % MOD;
    }

    private static long modpow(long a, long b){
        if(b == 1){return a;}
        if(b == 0){return 1;}
        long res = b/2;
        long rem = b%2;
        long p = modpow(a, res) % MOD;
        if(rem == 1){
            return ( ((p*p)%MOD) * a) % MOD;
        }else{
            return (p*p) % MOD;
        }
    }

    private static long modinv(long a){
        return modpow(a, MOD-2);
    }
}
