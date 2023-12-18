
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static long n = sc.nextLong();
    static long w = sc.nextLong();
    static long[] weight = new long[110];
    static long[] value = new long[110];
    static long[][] dp = new long[110][100100];

    public static void main(String[] args) {
        //標準入力の取得
        for (int i = 0; i < n; i++){
            weight[i] = sc.nextLong();
            value[i] = sc.nextLong();
        }
        //dpの初期化
        for (int i = 0; i < 110; i++)
            for (int j = 0; j < 100100; j++)
                dp[i][j] = 2147483647;
        dp[0][0] = 0;
        for (int i = 0; i < n; i++){
            for (int sum_v = 0; sum_v < 100100; ++sum_v){
                if (sum_v - (int)value[i] >= 0)
                    dp[i + 1][sum_v] = chmin(dp[i + 1][sum_v], dp[i][sum_v - (int)value[i]] + weight[i]);
                dp[i + 1][sum_v] = chmin(dp[i + 1][sum_v], dp[i][sum_v]);
            }
        }
        long result = 0;
        for (int sum_v = 0; sum_v < 100100; sum_v++) {
            if (dp[(int) n][sum_v] <= w) {
                result = sum_v;
            }
        }
        System.out.println(result);

    }

    public static long chmin(long a, long b){
        if (a > b)
            return b;
        else
            return a;
    }
}
