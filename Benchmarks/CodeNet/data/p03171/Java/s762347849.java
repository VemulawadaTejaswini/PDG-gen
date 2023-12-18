import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        
        long[][] dp = new long[n + 1][n + 1];
        for (int i = n - 1; i >= 0; i--)
        {
            for (int j = i; j < n; j++)
            {
                if (j == i)
                    dp[i][j] = arr[i];
                else
                    dp[i][j] = Math.max(arr[j] - dp[i][j - 1], arr[i] - dp[i + 1][j]);
            }
        }
        System.out.println(dp[0][n - 1]);
    }
}