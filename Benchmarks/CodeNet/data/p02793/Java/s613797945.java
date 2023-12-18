import java.util.*;

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
        
        long l = 1;
        long[] larray = new long[10000];
        for (int i = 0; i < n; i++) {
            long tmp = l;
            l = lcm((long)l, (long)array[i]) % MOD;
            
        }
        
        long count = 0;
        for (int i = 0; i < n; i++) {
            count = (count + (l / array[i])) % MOD;
        }
        
        
        System.out.println(count);
    }
    
    public static long lcm(long m, long n) {
        return m * (n / gcd(m, n));
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        
        return gcd(b, a % b);
    }
}
