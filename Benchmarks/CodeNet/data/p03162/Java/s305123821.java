import java.util.Scanner;

/**
 * @author yoshizaki
 * EDCP A
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // 休日の数
        int vacation = scanner.nextInt();
        // 幸福度の配列
        long[][] happy = new long[110000][3];
        // DP用配列
        long[][] dp = new long[110000][3];
        for(int i = 0; i < vacation; i++) {
            for(int j = 0; j < 3; j++) {
                happy[i][j] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < vacation; i++) {
            for (int j =0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if(j == k) continue;
                    if(dp[i + 1][k] < dp[i][j]+happy[i][k]) dp[i + 1][k] = dp[i][j]+happy[i][k];
                }
            }
        }
        long answer = 0;
        for(int i = 0; i < 3; i++) {
            if(answer < dp[vacation][i]) answer = dp[vacation][i];
        }
        System.out.println(answer);
    }
}
