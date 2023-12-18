import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] dp = new int[N+1][3];
        for(int i = 1; i <= N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            dp[i][0] = a + Math.max(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = b + Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = c + Math.max(dp[i-1][0], dp[i-1][1]);
        }
        System.out.println(Math.max(dp[N][0] ,Math.max(dp[N][1], dp[N][2])));
        sc.close();
    }

}
