import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] happiness = new int[n][3];

        for(int ind = 0; ind < n; ind++) {

            happiness[ind][0] = sc.nextInt();
            happiness[ind][1] = sc.nextInt();
            happiness[ind][2] = sc.nextInt();
        }

        int[][] dp = new int[n][3];

        dp[0][0] = happiness[0][0];
        dp[0][1] = happiness[0][1];
        dp[0][2] = happiness[0][2];

        for(int ind = 1; ind < n; ind++) {

            dp[ind][0] = happiness[ind][0] + Math.max(dp[ind - 1][1], dp[ind - 1][2]);
            dp[ind][1] = happiness[ind][1] + Math.max(dp[ind - 1][0], dp[ind - 1][2]);
            dp[ind][2] = happiness[ind][2] + Math.max(dp[ind - 1][0], dp[ind - 1][1]);
        }

        System.out.println(Math.max(dp[n - 1][1], Math.max(dp[n - 1][0], dp[n - 1][2])));
    }
}
