import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] s = new int[N+1][2];
        for(int i = 1; i <= N; i++){
            s[i][0] = sc.nextInt();
            s[i][1] = sc.nextInt();
        }
        Arrays.sort(s, (x, y) -> x[0]-y[0]);
        int pre = -1;
        long[][][] dp = new long[N+1][K+1][3]; //最大値、それまでに選んだ種類数、そのネタをすでに選んだか
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= K; j++){
                if(pre != s[i][0]){
                    if(dp[i-1][j][0] > dp[i-1][j-1][0] +s[i][1] + dp[i-1][j-1][1] *2 +1){
                        dp[i][j][0] = dp[i-1][j][0];
                        dp[i][j][1] = dp[i-1][j][1];
                    }else{
                        dp[i][j][0] = dp[i-1][j-1][0] +s[i][1] + dp[i-1][j-1][1] *2 +1;
                        dp[i][j][1] = dp[i-1][j-1][1] + 1;
                        dp[i][j][2] = 1;
                    }
                }else{
                    if(dp[i-1][j-1][2] == 1){
                        if(dp[i-1][j][0] > dp[i-1][j-1][0] +s[i][1]){
                            dp[i][j][0] = dp[i-1][j][0];
                            dp[i][j][1] = dp[i-1][j][1];
                            dp[i][j][2] = dp[i-1][j][2];
                        }else{
                            dp[i][j][0] = dp[i-1][j-1][0] +s[i][1];
                            dp[i][j][1] = dp[i-1][j-1][1];
                            dp[i][j][2] = 1;
                        }
                    }else{
                        if(dp[i-1][j][0] > dp[i-1][j-1][0] +s[i][1] + dp[i-1][j-1][1] *2 +1){
                            dp[i][j][0] = dp[i-1][j][0];
                            dp[i][j][1] = dp[i-1][j][1];
                            dp[i][j][2] = dp[i-1][j][2];
                        }else{
                            dp[i][j][0] = dp[i-1][j-1][0] +s[i][1] + dp[i-1][j-1][1] *2 +1;
                            dp[i][j][1] = dp[i-1][j-1][1] + 1;
                            dp[i][j][2] = 1;
                        }
                    }
                }
            }
            pre = s[i][0];
        }
        System.out.println(dp[N][K][0]);
        sc.close();

    }

}
