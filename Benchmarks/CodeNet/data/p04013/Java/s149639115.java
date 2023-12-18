import java.math.BigDecimal;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int A = sc.nextInt();

        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }


        long[][][] dp = new long[N + 1][N + 1][N*50];// [i][j][s] xiまでからjこ取って合計がsになる選び方

        dp[0][0][0] = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N * A; k++) {

                    // i+1番目を拾う場合
                    dp[i+1][j+1][k + values[i]] += dp[i][j][k];

                    // i+1番目を拾わない場合
                    dp[i+1][j][k] += dp[i][j][k];

                }
            }
        }




        long sum = 0;
        for (int i = 1; i < N+1; i++) {
            sum += dp[N][i][i * A];
        }

        System.out.println(sum);
    }

}