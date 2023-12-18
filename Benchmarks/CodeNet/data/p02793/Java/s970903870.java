import java.util.*;
import java.math.BigInteger;

public class Main {
    static int MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        BigInteger l = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            l = l.divide(l.gcd(BigInteger.valueOf(array[i]))).multiply(BigInteger.valueOf(array[i]));
        }
        
        
        long l2 = l.mod(BigInteger.valueOf(MOD)).longValue();
        
        long count = 0;
        for (int i = 0; i < n; i++) {
            count = (count + (l2 * modinv(array[i], MOD) % MOD)) % MOD;
        }
        
        
        System.out.println(count);
    }
    
    public static long lcm(long m, long n) {
        return m * (n / gcd(m, n) % MOD) % MOD;
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        
        return gcd(b, a % b) % MOD;
    }
    
    public static long modinv(long a, long m) {
        long b = m, u = 1, v = 0;
        while (b > 0) {
            long tmp = 0;
            long t = a / b;
            a -= t * b;
            
            tmp = a;
            a = b;
            b = tmp;
            
            u -= t * v;
            
            tmp = u;
            u = v;
            v = tmp;
        }
        u %= m;
        if (u < 0) u += m;
        
        return u;
    }
}
