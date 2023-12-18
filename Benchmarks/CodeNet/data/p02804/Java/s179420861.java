import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long MOD = 1000000007;
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        if (k == 1) {
            System.out.println(0);
            return;
        }
        
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        
        long summax = 0;
        for (int i = k - 1; i < n; i++) {
            summax = (summax + (nCkMOD(i, k - 1, MOD) * array[i]) % MOD) % MOD;
        }
        
        long summin = 0;
        for (int i = 0; i < n - k + 1; i++) {
            summin = (summin + (nCkMOD(n - 1 - i, k - 1, MOD) * array[i]) % MOD) % MOD;
        }
        
        long res = summax - summin;
        if (res < 0) {
            res += MOD;
        }
        
        System.out.println(res);
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
