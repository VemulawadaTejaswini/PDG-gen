import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long c = sc.nextLong();
        long[] x = new long[n];
        long[] v = new long[n];
        long[] x2 = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
            v[i] = sc.nextLong();
            x2[i] = c - x[i];
        }
        long[] l = new long[n];
        long[] lmax = new long[n];
        l[0] = v[0] - x[0];
        lmax[0] = Math.max(0L, l[0]);
        for (int i = 1; i < n; i++) {
            l[i] = l[i-1] + v[i] - (x[i] - x[i-1]);
            lmax[i] = Math.max(l[i], lmax[i-1]);
        }
        long[] r = new long[n];
        long[] rmax = new long[n];
        r[n-1] = v[n-1] - x2[n-1];
        rmax[n-1] = Math.max(r[n-1], 0L);
        for (int i = n-2; i >= 0; i--) {
            r[i] = r[i+1] + v[i] - (x2[i] - x2[i+1]);
            rmax[i] = Math.max(r[i], rmax[i+1]);
        }
        long ans = 0L;
        for (int i = 0; i < n-1; i++) {
            long t = l[i];
            if(i < n-1){
                t += Math.max(0L, rmax[i+1] - x[i]);
            }
            if(ans < t) ans = t;
        }
        for (int i = n-1; i >= 0; i--) {
            long t = r[i];
            if(0 < i){
                t += Math.max(0L, lmax[i-1] - x2[i]);
            }
            if(ans < t) ans = t;
        }
        System.out.println(ans);
        sc.close();

    }

}
