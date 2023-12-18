import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long MIN = Integer.MIN_VALUE;
        long MAX = Integer.MAX_VALUE;

        long rmax = Integer.MIN_VALUE;
        long rmin = Integer.MAX_VALUE;
        long lmax = Integer.MIN_VALUE;
        long lmin = Integer.MAX_VALUE;
        long lrmax = Integer.MIN_VALUE;
        long lrmin = Integer.MAX_VALUE;
        long umax = Integer.MIN_VALUE;
        long umin = Integer.MAX_VALUE;
        long dumax = Integer.MIN_VALUE;
        long dumin = Integer.MAX_VALUE;
        long dmax = Integer.MIN_VALUE;
        long dmin = Integer.MAX_VALUE;


        for(int i=0; i<n; i++) {
            int x = sc.nextInt() * 2;
            int y = sc.nextInt() * 2;
            char d = sc.next().charAt(0);
            if(d == 'U') {
                umax = Math.max(umax, y);
                umin = Math.min(umin, y);
                lrmax = Math.max(lrmax, x);
                lrmin = Math.min(lrmin, x);
            }
            if(d == 'D') {
                dmax = Math.max(dmax, y);
                dmin = Math.min(dmin, y);
                lrmax = Math.max(lrmax, x);
                lrmin = Math.min(lrmin, x);
            }
            if(d == 'L') {
                dumax = Math.max(dumax, y);
                dumin = Math.min(dumin, y);
                lmax = Math.max(lmax, x);
                lmin = Math.min(lmin, x);
            }
            if(d == 'R') {
                dumax = Math.max(dumax, y);
                dumin = Math.min(dumin, y);
                rmax = Math.max(rmax, x);
                rmin = Math.min(rmin, x);
            }
        }


        Set<Long> set = new HashSet<>();
        set.add(0L);

        if(umax != MIN && dumax != MIN) {
            set.add(dumax - umax);
        }
        if(dmax != MIN && dumax != MIN) {
            set.add(dmax - dumax);
        }
        if(dmax != MIN && umax != MIN) {
            set.add((dmax - umax)/2);
        }
        if(umin != MAX && dumin != MAX) {
            set.add(dumin - umin);
        }
        if(dmin != MAX && dumin != MAX) {
            set.add(dmin - dumin);
        }
        if(dmin != MAX && umin != MAX) {
            set.add((dmin - umin)/2);
        }
        if(rmax != MIN && lrmax != MIN) {
            set.add(lrmax - rmax);
        }
        if(lmax != MIN && lrmax != MIN) {
            set.add(lmax - lrmax);
        }
        if(lmax != MIN && rmax != MIN) {
            set.add((lmax - rmax)/2);
        }
        if(rmin != MAX && lrmin != MAX) {
            set.add(lrmin - rmin);
        }
        if(lmin != MAX && lrmin != MAX) {
            set.add(lmin - lrmin);
        }
        if(lmin != MAX && rmin != MAX) {
            set.add((lmin - rmin)/2);
        }

        double res = 1e+200;
        for(long t : set) {
            if(t < 0) continue;
            double u = max(dumax, umax+t, dmax-t);
            double d = min(dumin, umin+t, dmin-t);
            double r = max(lrmax, rmax+t, lmax-t);
            double l = min(lrmin, rmin+t, lmin-t);
            res = Math.min(res, (u-d) * (r-l));
        }
        System.out.println(res/4);
    }

    static long max(long a, long b, long c) {
        return Math.max(a, Math.max(b, c));
    }
    static long min(long a, long b, long c) {
        return Math.min(a, Math.min(b, c));
    }


}
