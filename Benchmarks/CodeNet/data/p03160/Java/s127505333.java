
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int h[] = new int[n];
    static int dp[] = new int[n];

    public static void main(String[] args) {
        //初期化
        for (int i = 0; i < n; i++)
            h[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            dp[i] = 2147483647;
        dp[0] = 0;
        for (int i = 1; i < n; i++){
            dp[i] = chmin(dp[i], dp[i - 1] + Math.abs(h[i] - h[i - 1]));
            if (i > 1){
                dp[i] = chmin(dp[i], dp[i - 2] + Math.abs(h[i] - h[i - 2]));
            }
        }
        System.out.println(dp[n - 1]);
    }
    public static int chmin(int a, int b){
        if (a > b)
            return b;
        else
            return a;
    }
}
