
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static long n = sc.nextLong();
    static long k = sc.nextLong();
    static long h[] = new long[(int)n];
    static long dp[] = new long[(int)n];
    public static void main(String[] args) {
        //初期化
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            dp[i] = 2147483647;
        }
        dp[0] = 0;
        for (int i = 0; i < n; i++){
            for (int j = 1; j <= k; j++){
                if (i + j < n)
                    dp[i + j] = chmin(dp[i + j], dp[i] + Math.abs(h[i + j] - h[i]));
            }
        }
        System.out.println(dp[(int)n - 1]);
    }
    public static long chmin(long a, long b){
        if (a > b){
            return b;
        } else {
            return a;
        }
    }
}
