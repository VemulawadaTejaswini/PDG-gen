import java.util.*;
import java.io.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static long k = sc.nextLong();
    static long a[] = new long[n];
    public static void main(String[] args) {
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        long INF = (long)(1e18)+1;
        long l = -INF;
        long r = INF;
        while (l<r){
            long mid = (l+r)/2;
            if (check(mid)) l = mid+1;
            else r = mid;
        }
        System.out.println(l-1);
    }
    //x未満の組合せがk個未満ならtrue
    static boolean check(long x) {
        long tot = 0;
        for(int i=0;i<n;i++) {
            long now = a[i];
            int l = -1, r = n;
            if(now >= 0) {
                while(l+1<r) {
                    int c = (l+r)/2;
                    if(now * a[c] < x) l = c;
                    else r = c;
                }
                tot += (l+1);
            }
            else {
                while(l+1<r) {
                    int c = (l+r)/2;
                    if(now * a[c] < x) r = c;
                    else l = c;
                }
                tot += (n - r);
            }
            if((long)a[i] * a[i]<x)tot--;
        }
        if(tot/2 < k) return true;
        else return false;
    }
}

