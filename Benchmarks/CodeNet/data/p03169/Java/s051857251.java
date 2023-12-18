import java.util.*;
import java.io.*;
class Main {
    static double[][][] dp;
    static double recurse(int cnt1, int cnt2, int cnt3, int n) {
        if(cnt1<0 || cnt2<0 || cnt3<0)
            return 0;
        if(cnt1==0 && cnt2==0 && cnt3==0)
            return 0;
        if(dp[cnt1][cnt2][cnt3]>0)
            return dp[cnt1][cnt2][cnt3];
        double expectedValue = n + cnt1*recurse(cnt1-1, cnt2, cnt3, n) +
                               cnt2*recurse(cnt1+1, cnt2-1, cnt3, n) +
                               cnt3*recurse(cnt1, cnt2+1, cnt3-1, n);
        dp[cnt1][cnt2][cnt3] = expectedValue/(cnt1+cnt2+cnt3);
        return dp[cnt1][cnt2][cnt3];
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[3];
        for(int i = 0; i<n; i++) {
            int x = sc.nextInt()-1;
            c[x]++;
        }
        dp = new double[301][301][301];
        for(double[][] i: dp)
            for(double[] j: i)
                Arrays.fill(j, -1);
        System.out.println(recurse(c[0], c[1], c[2], n));
    }
}