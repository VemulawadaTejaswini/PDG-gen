import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] cL = new char[h][w];
        for (int i = 0; i < h; i++) {
            cL[i] = sc.next().toCharArray();
        }

        int[][] dp = new int[h][w];
        dp[0][0] = cL[0][0] == '.' ? 0 : 1;
        for (int i = 1; i < h; i++) {
            if (cL[i][0] == '.') {
                dp[i][0] = dp[i-1][0];
            } else {
                dp[i][0] = dp[i-1][0]+1;
            }
        }

        for (int i = 1; i < w; i++) {
            if (cL[0][i] == '.') {
                dp[0][i] = dp[0][i-1];
            } else {
                dp[0][i] = dp[0][i-1]+1;
            }
        }

        for (int i = 1; i < h; i++) {
            for (int j = 1; j < w; j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]);
                if (cL[i][j] == '#') dp[i][j]++;
            }
        }

        System.out.println(dp[h-1][w-1]);
    }
}