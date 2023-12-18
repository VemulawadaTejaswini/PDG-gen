import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt() / 2;
        }
        
        long tmp = array[0];
        for (int i = 1; i < n; i++) {
            tmp = lcm(tmp, (long)array[i]);
            if (tmp > m) {
                System.out.println(0);
                return;
            }
        }
        
        if (tmp > m) {
            System.out.println(0);
            return;
        }
        
        if (tmp % 2 == 0) {
            System.out.println(0);
            return;
        }
        
        int count = 0;
        tmp *= 2;
        
        long x = m / tmp;
        
        long y = x * tmp;
        
        if (y + tmp/2 <= m) {
            count = 1;
        }
        
        System.out.println(x + count);
    }
    
    public static long lcm(long m, long n) {
        return m * (n / gcd(m, n));
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        
        return gcd(b, a % b);
    }
}
