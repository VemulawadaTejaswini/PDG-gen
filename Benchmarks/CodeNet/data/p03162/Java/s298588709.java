
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int[][] vac = new int[n][3];
    static int[][] dp = new int[n + 1][2];
    public static void main(String[] args) {
        //標準入力を取得
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 3; j++){
                vac[i][j] = sc.nextInt();
            }
        }
        //dp初期化
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 2; j++){
                dp[i][j] = 0;
            }
        }
        //いっこまえが最大効用かつ、違えばいい
        int result = 0;
        for (int i = 0; i < n; i++){
                for (int k = 0; k < 3; k++){
                    if (i != 0 && dp[i][1] == k){
                        continue;
                    }
                    chmax(dp[i + 1][0], dp[i][0] + vac[i][k], i + 1, k);
                }
            }
        System.out.println(dp[n][0]);
    }

    public static void chmax(int a, int b, int i, int k){
        if (a < b){
            dp[i][0] = b;
            dp[i][1] = k;
        }
    }
}
