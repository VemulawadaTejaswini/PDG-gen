
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int vac[][] = new int[n][3];
    static int dp[][] = new int[n][3];

    public static void main(String[] args) {
        //初期化
        for (int i = 0; i < n; i++){
            vac[i][0] = sc.nextInt();
            vac[i][1] = sc.nextInt();
            vac[i][2] = sc.nextInt();
            for (int j = 0; j < 3; j++){
                dp[i][j] = 0;
            }
        }
        //dp埋めていく
        dp[0][0] = vac[0][0];
        dp[0][1] = vac[0][1];
        dp[0][2] = vac[0][2];
        for (int i = 1; i < n; i++){
            for (int j = 0; j < 3; j++){
                for (int k = 0; k < 3; k++){
                    if (k != j)
                        dp[i][j] = chmax(dp[i][j], dp[i - 1][k] + vac[i][j]);
                }
            }
        }
        System.out.println(Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2])));

    }
    public static int chmax(int a, int b){
        if (a > b)
            return a;
        else
            return b;
    }
}
