import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        long[] sum = new long[N+1];
        for(int i = 1; i <= N; i++){
            A[i] = sc.nextInt();
            sum[i] = A[i] + sum[i-1];
        }
        // dp[i][j]：ｉ番目からｊ番目までを合体させるときの最小コスト
        long[][] dp = new long[N+1][N+1];
        for(int i = 1; i <= N; i++) Arrays.fill(dp[i], Long.MAX_VALUE);
        for (int len = 1; len <= N; len++) {
            for (int i = 1; i + len - 1 <= N; i++) {
                int j = i + len - 1;
                if(len == 1) dp[i][i] =0;
                else{
                    for (int split = i; split < j; split++) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][split] + dp[split + 1][j] + sum[j] - sum[i - 1]);
                    }
                }
            }
        }
        System.out.println(dp[1][N]);
        sc.close();

    }

}
