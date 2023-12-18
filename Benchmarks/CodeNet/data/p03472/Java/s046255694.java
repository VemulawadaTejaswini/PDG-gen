import java.util.*;
// huhu
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int max_a = 0;
        for( int i = 0; i < n; i++ ) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            max_a = Math.max(max_a, a[i]);
        }
        int ct = 0;
        for( int i = 0; i < n; i++ ) {
            if(b[i] > max_a) {k -= b[i]; ct++;}
        }
        ct += Math.ceil(k/max_a);
        System.out.println(ct);
    }
}