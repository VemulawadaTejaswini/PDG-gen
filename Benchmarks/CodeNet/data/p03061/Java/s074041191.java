import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final Scanner     sc = new Scanner(System.in);
    static final PrintStream so = System.out;

    public static void main(String[] args) {
        int N = ni();
        int[] a = new int[N+2];
        int[] gcdLeft = new int[N+2];
        int[] gcdRight = new int[N+2];
        for (int i = 1; i <= N; i++) {
            a[i] = ni();
            gcdLeft[i] = gcd(a[i], gcdLeft[i-1]);
        }
        for (int i = N; i > 0; i--) {
            gcdRight[i] = gcd(a[i], gcdRight[i+1]);
        }
        
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans = Math.max(ans, gcd(gcdLeft[i-1], gcdRight[i+1]));
        }
        so.println(ans);
    }
    
    static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
    private static int ni() {
        return sc.nextInt();
    }
}
