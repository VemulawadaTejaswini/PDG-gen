import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();

        int max = Math.max(n,m);
        long[] a = new long[max];
        long[] b = new long[max];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong();
        }
        for(int i=0; i<m; i++) {
            b[i] = sc.nextLong();
        }

        int cnt = 0;
        for(int i=0; i<max; i++) {
            long nmin = Math.min(a[i], b[i]);
            long nmax = Math.max(a[i], b[i]);
            if(nmin != 0 && nmax != 0) {
                if(k - nmin >= 0) {
                    k -= nmin;
                    cnt++;
                }
                if(k - nmax >= 0) {
                    k -= nmax;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
