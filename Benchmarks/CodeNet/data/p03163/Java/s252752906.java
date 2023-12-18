import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[][] wav = new int[n][2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                wav[i][j] = scanner.nextInt();
            }
        }
        System.out.println(new Main().f(wav, n, w));
    }

    public long f(int[][] wav, int n, int w) {
        long[][] dp = new long[n][w+1];
        long ans = 0;
        for(int i = 0; i <= w; i++){
            if(i >= wav[0][0])
                dp[0][i] = wav[0][1];
            ans = Math.max(dp[0][i], ans);
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j <= w; j++){
                if(j >= wav[i][0]){
                    dp[i][j] = Math.max(wav[i][1] + dp[i-1][j-wav[i][0]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
                ans = Math.max(dp[i][j], ans);
            }
        }
        return ans;
    }
}
