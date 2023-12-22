import java.util.Scanner;

public class Main {
    
    private static final long MOD = 1_000_000_007;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        
        final long[] x = new long[N];
        final long[] y = new long[N];
        final long[] a = new long[N];
        final long[] b = new long[N];
        
        long maxA = 0;
        long minA = Long.MAX_VALUE;
        long maxB = 0;
        long minB = Long.MAX_VALUE;
        
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            
            a[i] = x[i] + y[i];
            b[i] = x[i] - y[i];
            
            if (maxA < a[i]) {
                maxA = a[i];
            }
            if (a[i] < minA) {
                minA = a[i];
            }
            if (maxB < b[i]) {
                maxB = b[i];
            }
            if (b[i] < minB) {
                minB = b[i];
            }
        }
        
        System.out.println(Math.max(maxA - minA, maxB - minB));
    }
}
