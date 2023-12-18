import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int w = sc.nextInt();
                int[][] v = new int[2][n];
                for(int i = 0 ; i < n ; i++){
                        for(int j = 0 ; j < 2 ; j++){
                                v[j][i] = sc.nextInt();
                        }
                }
                sc.close();
                long[][] dp = new long[n + 1][w + 1];
                Arrays.fill(dp[0] , 0);
                for(int i = 0 ; i < n ; i++){
                        for(int j = 0 ; j <= w ; j++){
                                if(j >= v[0][i]) dp[i + 1][j] = Math.max(dp[i][j - v[0][i]] + v[1][i] , dp[i][j]);
                                else dp[i + 1][j] = dp[i][j];
                        }
                }
                System.out.println(dp[n][w]);
        }
}