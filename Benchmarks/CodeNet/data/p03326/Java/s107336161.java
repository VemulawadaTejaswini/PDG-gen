import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        long[] z = new long[n];
        int[] a = new int[n];
        long xa = 0;
        long ya = 0;
        long za = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            z[i] = sc.nextLong();
            a[i] = 1;
        }
        for (int i = 0; i < m; i++) {
            long xb = xa;
            long yb = ya;
            long zb = za;
            int p = -1;
            for (int j = 0; j < n; j++) {
                long xc = xa - x[j];
                long yc = ya - y[j];
                long zc = za - z[j];
                if (a[j] == 1) {
                    if (Math.abs(xb) + Math.abs(yb) + Math.abs(zb) < Math.abs(xc) + Math.abs(yc) + Math.abs(zc)) {
                        p = j;
                        xb = xc;
                        yb = yc;
                        zb = zc;
                    }
                }
            }
            a[p] = 0;
            xa = xb;
            ya = yb;
            za = zb;
        }
        System.out.println(Math.abs(xa) + Math.abs(ya) + Math.abs(za));
    }    
}
