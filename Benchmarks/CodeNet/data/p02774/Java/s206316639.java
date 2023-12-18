import java.util.*;
import java.math.*;
 
public class Main {
  static int mod = (int) 1e9 + 7;
    static int n;
    static long k;
    static long a[];
  public static void main(String[] args) {
    	Scanner fs = new Scanner(System.in);
    	n = fs.nextInt();
        k = fs.nextLong();
    	a = new long[n];
        for(int i = 0; i < n; ++i) {
          a[i] = fs.nextLong();
        }
        Arrays.sort(a);
        long INF = (long)(1e18)+1;
        long l = -INF;
        long r = INF - 1;
        while(l <= r) {
            long c = (l+r)/2;
            if(check(c))l=c + 1;
            else r = c - 1;
        }
        System.out.println(Math.max(-INF, l - 1));
    }

    static boolean check(long x) {
        long tot = 0;
        for(int i=0;i<n;i++) {
            long now = a[i];
            int l = 0, r = n - 1;
            if(now >= 0) {
                --r;
                while(l <= r) {
                    int c = (l+r)/2;
                    if(now * a[c] < x) l = c + 1;
                    else r = c - 1;
                }
                tot += l;
            }
            else {
                while(l <= r) {
                    int c = (l+r)/2;
                    if(now * a[c] >= x) l = c+1;
                    else r = c - 1;
                }
                tot += (n - l);
            }
            if((long)a[i] * a[i]<x)tot--;
        }
        if(tot/2 < k) return true;
        else return false;
    }
}
    
