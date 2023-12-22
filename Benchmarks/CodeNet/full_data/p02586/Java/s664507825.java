
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int R = sc.nextInt();
        final int C = sc.nextInt();
        final int K = sc.nextInt();
        
        final int[][] Vs = new int[R][C];
        for (int k = 0; k < K; k++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;
            int v = sc.nextInt();
            Vs[r][c] = v;
        }
        
        final long[][] dp = new long[R][C];
        final int[][][] trio = new int[R][C][];
        
        if (0 < Vs[0][0]) {
            dp[0][0] = Vs[0][0];
            trio[0][0] = new int[] { 0, 0, Vs[0][0] };
        }
        
        for (int i = 1; i < R; i++) {
            int v = Vs[i][0];
            dp[i][0] = dp[i - 1][0] + v;
            trio[i][0] = new int[] { 0, 0, v };
        }
        for (int j = 1; j < C; j++) {
            int v = Vs[0][j];
            
            if (trio[0][j - 1][0] < v) {
                dp[0][j] = dp[0][j - 1] + v - trio[0][j - 1][0];
                trio[0][j] = new int[] { v, trio[0][j - 1][1], trio[0][j - 1][2] };
                Arrays.sort(trio[0][j]);
                
            } else {
                dp[0][j] = dp[0][j - 1];
                trio[0][j] = trio[0][j - 1];
            }
        }
        
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                int v = Vs[i][j];
                long vFromUpper = dp[i - 1][j] + v;
                long vFromLeft = trio[i][j - 1][0] < v
                        ? dp[i][j - 1] + v - trio[i][j - 1][0]
                        : dp[i][j - 1];
                
                if (vFromUpper < vFromLeft) {
                    dp[i][j] = vFromLeft;
                    if (trio[i][j - 1][0] < v) {
                        trio[i][j] = new int[] { v, trio[i][j - 1][1], trio[i][j - 1][2] };
                        Arrays.sort(trio[i][j]);
                    } else {
                        trio[i][j] = trio[i][j - 1];
                    }
                } else {
                    dp[i][j] = vFromUpper;
                    trio[i][j] = new int[] { 0, 0, v };
                }
            }
        }
        
        System.out.println(dp[R - 1][C - 1]);
    }
}
