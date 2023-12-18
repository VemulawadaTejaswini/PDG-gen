import java.util.Scanner;

public class Main {

    private static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double dp[][] = new double[n+1][n+1]; // dp[i][j]到第i个硬币时j个head的概率
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            double prob = scanner.nextDouble();
            dp[i][0] = dp[i-1][0] * (1-prob);
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i-1][j]*(1-prob) + dp[i-1][j-1]*prob;
            }
        }
        double sum = 0;
        for (int i = n/2 +1; i <= n; i++) {
            sum=sum + dp[n][i];
        }
        System.out.println(sum);
    }




}