import java.util.*;
// im so dumb
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextLong();
        long[] a = new long[n];
        long[] b = new long[n];
        double max_a = -1.0;
        for( int i = 0; i < n; i++ ) {
            a[i] = in.nextLong();
            b[i] = in.nextLong();
            max_a = Math.max(max_a, (double)a[i]);
        }
        long ct = 0L;
        for( int i = 0; i < n; i++ ) {
            if(b[i] > max_a) {k -= b[i]; ct++;}
        }
        ct += (long) Math.ceil((long) (k/max_a));
        System.out.println(ct);
    }
}