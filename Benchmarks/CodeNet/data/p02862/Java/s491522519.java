import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int MOD = 1000000007;
        
        
        if ((x + y) % 3 != 0) { 
            System.out.println(0);
            return;
        }
        
        int tmp = 0;
        if (x < y) {
            tmp = x;
            x = y;
            y = tmp;
        }
        
        if (y * 2 < x) {
            System.out.println(0);
            return;
        }
        
        int xstart = (x + y) / 3 * 2;
        int ystart = (x + y) / 3;
        
        int n = xstart - x;
        
        int ans1 = xstart / 2;
        int ans2 = n;
        
        
        System.out.println(nCkMOD(ans1, ans2, MOD));
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