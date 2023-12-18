import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long w = sc.nextLong();
        long[] wi = new long[n];
        int[] vi = new int[n];
        for(int i = 0;i < n;i++) {
            wi[i] = sc.nextLong();
            vi[i] = sc.nextInt();
        }
        
        int dpy = n + 1;
        int dpx = (int)Math.pow(10, 5) + 1;
        long[][] dp = new long[dpy][dpx];
        for(int i = 0;i < dpy;i++) {
            for(int j = 0;j < dpx;j++) dp[i][j] = 9999999999999999l;
        }
        dp[0][0] = 0;
        
        for(int y = 1;y < dpy;y++) {
            for(int x = 0;x < dpx;x++) {
                int tmpX = x - vi[y - 1];
                long candidate1 = (tmpX < 0 ? 9999999999999999l : (dp[y - 1][tmpX] + wi[y - 1]));
                long candidate2 = dp[y - 1][x];
                dp[y][x] = Long.min(candidate1, candidate2);
                if(dp[y][x] > w) dp[y][x] = 9999999999999999l;
            }
        }
        
        long ans = 0;
        for(int x = dpx - 1;x >= 0;x--) {
            if(dp[n][x] <= w) {
                ans = x;
                break;
            }
        }
    
        System.out.println(ans);
    }
}
