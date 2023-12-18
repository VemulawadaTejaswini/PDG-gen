import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        
        // a -> a'
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 1) {
                System.out.println(0);
                return;
            }
            a[i] = sc.nextInt() / 2;
        }
        
        int t = f(a[0]);
        
        // a' -> a''
        for (int i = 0; i < n; i++) {
            if (f(a[i]) != t) {
                System.out.println(0);
                return;
            }
            a[i] >>= t;
        }
        
        m >>= t;
        
        long l = 1;
        for (int i = 0; i < n; i++) {
            l = lcm(l, (long)a[i]);
            if (l > m) {
                System.out.println(0);
                return;
            }
        }
        
        int count = ((m / (int)l) + 1) / 2;
        
        System.out.println(count);
    }
    
    public static long lcm(long m, long n) {
        return m * (n / gcd(m, n));
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        
        return gcd(b, a % b);
    }
    
    public static int f(int x) {
        int res = 0;
        while (x % 2 == 0) {
            x /= 2;
            res++;
        }
        
        return res;
    }
}
