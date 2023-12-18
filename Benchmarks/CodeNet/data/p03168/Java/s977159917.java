import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] dp = new double[n + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++)
        {
            double p = scan.nextDouble();
            for (int j = n; j >= 0; j--)
            {
                if (j == 0)
                    dp[j] *= (1 - p);
                else
                    dp[j] = dp[j - 1] * p + dp[j] * (1 - p);
            }
        }
        double sum = 0;
        for (int j = (int) ((n + 1) / 2); j <= n; j++)
            sum += dp[j];
        System.out.println(sum);
        
        // double[] arr = new double[n];
        // for (int i = 0; i < n; i++)
        //     arr[i] = scan.nextDouble();

        // double[][] dp = new double[n + 1][n + 1];
        // dp[0][0] = 1;
        // for (int i = 1; i <= n; i++)
        //     dp[i][0] = dp[i - 1][0] * (1 - arr[i - 1]);
        // for (int i = 1; i <= n; i++)
        //     for (int j = 1; j <= n; j++)
        //         dp[i][j] = dp[i - 1][j - 1] * arr[i - 1] + dp[i - 1][j] * (1 - arr[i - 1]);
        // double sum = 0;
        // for (int j = (int) ((n + 1) / 2); j <= n; j++)
        //     sum += dp[n][j];
        // System.out.println(sum);
    }
}