import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); int w= sc.nextInt();
        long [][] dp = new long[h][w];
        int [][] a = new int[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) a[i][j] = (s.charAt(j) == '.' ? 0 : 1);
        }
        long mod = (long) 1e9 + 7; dp[0][0] = 1;
        for (int i = 1; i < h; i++) {
            if (a[i][0] == 0) {
                dp[i][0] = dp[i-1][0];
            } else {
                dp[i][0] = 0;
            }
        }
        for (int i = 1; i < w; i++) {
            if (a[0][i] == 0) {
                dp[0][i] = dp[0][i-1];
            } else {
                dp[0][i] = 0;
            }
        }
        for (int i = 1; i < h; i++) {
            for (int j = 1; j < w; j++) {
                if (a[i][j] == 1) continue;
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % mod;
            }
        }
        System.out.println(dp[h-1][w-1]);
    }


}