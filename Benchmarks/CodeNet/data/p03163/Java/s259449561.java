
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static long n = sc.nextLong();
    static long w = sc.nextLong();
    static long[] weight = new long[110];
    static long[] value = new long[110];
    static long[][] dp = new long[110][101000];
    public static void main(String[] args) {
        for (int i = 0; i < n; i++){
            weight[i] = sc.nextLong();
            value[i] = sc.nextLong();
        }
        for (int i = 0; i < 110; i++)
            for (int j = 0; j < 101000; j++)
                dp[i][j] = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= w; j++){
                if (j - (int)weight[i] >= 0)
                    dp[i + 1][j] = chmax(dp[i + 1][j], dp[i][j - (int)weight[i]] + value[i]);
                dp[i + 1][j] = chmax(dp[i + 1][j], dp[i][j]);
            }
        }
        System.out.println(dp[(int)n][(int)w]);
    }

    public static long chmax (long a, long b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
}
