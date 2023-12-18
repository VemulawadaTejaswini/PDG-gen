
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int w = sc.nextInt();
    //問題の条件より大きめに初期値を取る
    static long[] weight = new long[110];
    static long[] value = new long[110];
    static long[][] dp = new long[110][1000000];
    public static void main(String[] args) {
        //標準入力取得
        for (int i = 0; i < n; i++){
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        //dp初期化
        for (int i = 0; i < 110; i++)
            for (int j = 0; j < 1000000; j++)
                dp[i][j] = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= w; j++){
                if (j - weight[i] >= 0) {
                    dp[i + 1][j] = chmax(dp[i + 1][j], dp[i][j - (int)weight[i]] + value[i]);
                }
                dp[i + 1][j] = chmax(dp[i + 1][j], dp[i][j]);
            }
        }
        System.out.println(dp[n][w]);

    }

    public static long chmax(long a, long b){
        if (a < b){
            return b;
        } else {
            return a;
        }
    }
}
