import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] count = new int[4];

        String s = br.readLine();
        st = new StringTokenizer(s);
        for (int i = 0; i < n; i++)
            count[Integer.parseInt(st.nextToken())]++;
        double dp[][][][] = new double[n + 2][n + 2][n + 2][2];
        dp[count[1]][count[2]][count[3]][0] = 1;

        for (int c = n; c >= 0; c--)
        {
            for (int b = n; b >= 0; b--)
            {
                for (int a = n; a >= 0; a--)
                {
                    if (a + b + c == 0 || a + b + c > n)
                        continue;
                    double empty = (double) (n - (a + b + c)) / n;
                    dp[a][b][c][1] += (empty / (1 - empty) + 1) * dp[a][b][c][0];
                    if (a != 0)
                    {
                        double p = (double) a / (a + b + c);
                        dp[a - 1][b][c][0] += dp[a][b][c][0] * p;
                        dp[a - 1][b][c][1] += dp[a][b][c][1] * p;
                    }
                    if (b != 0)
                    {
                        double p = (double) b / (a + b + c);
                        dp[a + 1][b - 1][c][0] += dp[a][b][c][0] * p;
                        dp[a + 1][b - 1][c][1] += dp[a][b][c][1] * p;
                    }
                    if (c != 0)
                    {
                        double p = (double) c / (a + b + c);
                        dp[a][b + 1][c - 1][0] += dp[a][b][c][0] * p;
                        dp[a][b + 1][c - 1][1] += dp[a][b][c][1] * p;
                    }
                }
            }
        }
        System.out.println(dp[0][0][0][1]);
    }
}