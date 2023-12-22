import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long k = in.nextLong();
        
        long[] ai = new long[n];
        for(int i=0; i<n; i++) {
            ai[i] = in.nextLong();
        }
        long[] asum = new long[n+1];
        asum[0] = 0;
        int amaxIndex = 0;
        for(int i=0; i<n; i++) {
            asum[i+1] = asum[i] + ai[i];
            if(asum[i+1] <= k) {
                amaxIndex = i+1;
            }
        }
        
        long[] bi = new long[m];
        for(int i=0; i<m; i++) {
            bi[i] = in.nextLong();
        }
        long[] bsum = new long[m+1];
        bsum[0] = 0;
        int bmaxIndex = -1;
        for(int i=0; i<m; i++) {
            bsum[i+1] = bsum[i] + bi[i];
            if(bsum[i+1] <= k) {
                bmaxIndex = i+1;
            }
        }
        
        int maxCount = 0;
        for(int i=0; i<=amaxIndex; i++) {
            // 二分探索　：　机Bで何冊読めるか？
            int l = -1;
            int r = bmaxIndex;
            while(l<r) {
                int mid = (l+r)/2;
                if(l+1==r) {
                    if(asum[i] + bsum[r] > k) {
                        r = l;
                    }
                    break;
                }
                if(asum[i] + bsum[mid] <= k) {
                    l = mid;
                }
                else {
                    r = mid;
                }
            }
            maxCount = Math.max(maxCount, i+r);
        }
        System.out.println(maxCount);
    }
}
