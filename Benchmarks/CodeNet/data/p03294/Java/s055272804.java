import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        long[] a = new long[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long lcm = lcm(a[0], a[1]);
        for (int i = 2; i < n; i++) {
            lcm = lcm(lcm, a[i]);
        }
        
        so.println(f(a, lcm-1));
    }
    
    public static long f(long[] a, long d) {
        long sum = 0;
        for (long i: a) {
            sum += d % i;
        }
        return sum;
    }
    
    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
    
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}
