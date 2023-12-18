import java.util.Scanner;

/**
 * @author yoshizaki
 * EDCP A
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // 足場の数
        int node = scanner.nextInt();
        // 足場の高さの配列
        long[] height = new long[10010];
        // DP用配列
        long[] dp = new long[10010];
        long step = scanner.nextLong();
        // 足場の高さを取得
        for (int i = 0 ; i < node ; i++) height[i] = scanner.nextInt();
        // DP用配列の初期化
        for (int i = 0; i < 10010; i++) dp[i] = 100000000000000l;
        // 初期条件 初めのコストはゼロ
        dp[0] = 0;
        
        for (int i = 0; i < node; i++) {
            for (int j =1; j <=step; j++) {
                long cost = dp[i] + Math.abs(height[i] - height[i+j]);
                if (dp[i + j] > cost) dp[i + j] = cost; 
            }
        }
        System.out.println(dp[node -1]);
    }
}