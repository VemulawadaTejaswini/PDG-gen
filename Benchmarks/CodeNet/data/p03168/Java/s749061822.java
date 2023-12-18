import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] p = new double[N];
        for (int i = 0 ; i < N; i++) p[i] = scanner.nextDouble();
        double dp[][] = new double[N+1][N];
        dp[0][0] = (1-p[0]);
        dp[1][0] = p[0];
        for (int i = 1; i < N; i++) {
            dp[0][i] = (1-p[i]) * ((i-1>=0)?dp[0][i-1]:1.0);
            for (int j = 1; j <= i+1; j++) {
                dp[j][i] = ((i-1 >=0 && j-1 >= 0)?dp[j - 1][i - 1]:1.0) * p[i];
                dp[j][i] = dp[j][i] + ((i-1 >= 0)? dp[j][i-1]:1.0) * (1-p[i]);
            }
        }
        double result = 0;
        for (int j = N/2+1; j <= N; j++) {
            result += dp[j][N-1];
        }
        System.out.println(result);
    }
}
