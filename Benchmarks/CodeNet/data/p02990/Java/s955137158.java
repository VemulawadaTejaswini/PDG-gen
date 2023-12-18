import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        for (int i = 1; i <= k; i++) {
            if (n-k+1 < i) {
                System.out.println(0);
                continue;
            }
            System.out.println(nCkMOD(n-k+1, i, MOD) * nCkMOD(k-1, i-1, MOD) % MOD);
        }
    }
    
    public static long nCkMOD(long n, long k, long mod) {
        if (k > n - k) return nCkMOD(n, n - k, mod);
    
        long res = 1;
        for (int i = 0; i < k; i++) {
            res = (res * (n - i)) % mod;
        }
        for (int i = 1; i <= k; i++) {
            res = (res * inverse(i, mod)) % mod;
        }
    
        return res % mod;
    }
    
    private static long inverse(long a, long mod) {
        return modpow(a, mod - 2, mod);
    }
    
    private static long modpow(long a, long n, long mod) {
        long res = 1;
    
        while (n > 0) {
            if (n % 2 == 1) res = (res * a) % mod;
            a = (a * a) % mod;
            n >>= 1;
        }
    
        return res % mod;
    }
}
