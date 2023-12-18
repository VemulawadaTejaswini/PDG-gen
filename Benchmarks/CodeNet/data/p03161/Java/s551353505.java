
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int k = sc.nextInt();
    static int h[] = new int[n];
    static int dp[] = new int[n];
    public static void main(String[] args) {
        //初期化
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            dp[i] = 10000000;
        }
        dp[0] = 0;
        for (int i = 0; i < n; i++){
            for (int j = 1; j <= k; j++){
                if (i + j < n)
                    dp[i + j] = chmin(dp[i + j], dp[i] + Math.abs(h[i + j] - h[i]));
            }
        }
        System.out.println(dp[n - 1]);
    }
    public static int chmin(int a, int b){
        if (a > b){
            return b;
        } else {
            return a;
        }
    }
}
