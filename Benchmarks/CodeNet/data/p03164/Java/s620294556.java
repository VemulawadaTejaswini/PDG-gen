import java.util.Arrays;
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
        int m = n * 1000 + 1;
        long[] dp = new long[m];
        for(int i = 1; i < m; i++){
            dp[i] = n * 1000000000l + 1;
        }
        long ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = m - 1; j >= 0; j--){
                if(j >= wav[i][1]){
                    dp[j] = Math.min(dp[j], dp[j-wav[i][1]] + wav[i][0]);
                }
                if(dp[j] <= w){
                    ans = Math.max(ans, j);
                }
            }
        }
        return ans;
    }
}
