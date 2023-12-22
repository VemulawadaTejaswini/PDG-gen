import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        long k = Long.parseLong(sc.next());
        long[] a = new long[n];
        long[] b = new long[m];
        long[] asum = new long[n];
        long[] bsum = new long[m];
        
        int x = 0;
        int y = 0;
        long count1 = 0;
        for(int i=0; i<n; i++) {
            a[i] = Long.parseLong(sc.next());
            if(i == 0) {
                asum[i] = a[i];
            }else {
                asum[i] = asum[i-1]+a[i];
            }
            count1 += a[i];
            if(count1 > k || i == n-1) {
                x = i;
                break;
            }
        }
        
        long count2 = 0;
        for(int i=0; i<m; i++) {
            b[i] = Long.parseLong(sc.next());
            if(i == 0) {
                bsum[i] = b[i];
            }else {
                bsum[i] = bsum[i-1]+b[i];
            }
            count2 += b[i];
            if(count2 > k || i == m-1) {
                y = i;
                break;
            }
        }
        
        long max = 0;
        for(int i=0; i<=x; i++) {
            for(int j=0; j<=y; j++) {
                if(asum[i]+bsum[j] <= k) {
                    if(max < i+j+2) max = i+j+2;
                }else {
                    break;
                }
            }
        }
        System.out.println(max);
    }
}
