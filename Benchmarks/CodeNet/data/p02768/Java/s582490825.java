import java.util.Scanner;

public class Main {
    
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        long ans = modpow(2, n, MOD) -1;
        long x = 1;
        for(int i = 0; i < a; i++){
            x *= n-i;
            x %= MOD;
        }
        for(int i = 1; i <= a; i++){
            x *= modinv(i, MOD);
            x %= MOD;
        }
        ans -= x;
        if(ans < 0) ans += MOD;
        
        x = 1;
        for(int i = 0; i < b; i++){
            x *= n-i;
            x %= MOD;
        }
        for(int i = 1; i <= b; i++){
            x *= modinv(i, MOD);
            x %= MOD;
        }
        ans -= x;
        if(ans < 0) ans += MOD;
        
        System.out.println(ans);
    }
    
    static long modpow(long a, long n, long mod){
        long res = 1;
        while(n > 0){
            if((n & 1) == 1) res = res * a % mod;
            a = a * a % mod;
            n >>= 1;
        }
        return res;
    }
    
    static long modinv(long a, long mod){
        return modpow(a, mod - 2, mod);
    }
}