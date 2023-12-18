import java.util.*;

class Main {
    static void solveDp(int n, int p, int h[], int dp[]) {
        if(p == 0) {
            dp[0] = 0;
        } else if(p == 1) {
            dp[1] = Math.abs(h[1] - h[0]);
        } else if(p >= 2 && p <= n - 1) {
            dp[p] = Math.abs(h[p] - h[p-1]) > Math.abs(h[p] - h[p-2]) ? (Math.abs(h[p] - h[p-2]) + dp[p-2]) : (Math.abs(h[p] - h[p-1]) + dp[p-1]);
        } else {
            return;
        }
        p++;
        solveDp(n, p, h, dp);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int h[] = new int[n];
        int dp[] = new int[n];

        Arrays.fill(dp, 0);
        for(int i = 0; i < n; i++) {
            h[i] = scan.nextInt();
        }

        solveDp(n, 0, h, dp);
        System.out.println(dp[n-1]);
    }
}
