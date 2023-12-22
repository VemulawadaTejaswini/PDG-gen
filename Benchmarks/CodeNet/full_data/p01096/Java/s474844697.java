import java.util.*;

public class Main {

    static int n;
    static int[] a;
    static int[][] dp;

    static int rec(int l, int r) {
        if (dp[l][r]!=-1) return dp[l][r];
        if (Math.abs(r-l)<=1) return 0;

        int res = 0;
        if (Math.abs(a[r-1]-a[l])<=1 && rec(l+1, r-1)==r-l-2) {
            res = r-l;
        }

        for (int mid=l+1;mid<r;mid++) {
            res = Math.max(res, rec(l, mid)+rec(mid, r));
        }
        dp[l][r] = res;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            n = sc.nextInt();
            if (n==0) break;
            a = new int[n];
            dp = new int[n][n+1];
            for (int i=0;i<n;i++) {
                for (int j=0;j<n+1;j++) {
                    dp[i][j] = -1;
                }
            }
            for (int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(rec(0, n));
        }
    }
}
