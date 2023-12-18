import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main
{
    public static void main(String[] args)
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskAtCoder solver = new TaskAtCoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskAtCoder
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            String s = in.next();
            int dp[][] = new int[s.length()][2];
            init_dp(dp, s.length());
            out.print(solve(s.length() - 1, s, 0, dp));

        }

        int solve(int index, String s, int carry, int dp[][])
        {
            if (index == -1) return carry;
            if (dp[index][carry] != -1) return dp[index][carry];
            int value = s.charAt(index) - '0' + carry;
            int min = Math.min(10 - value + solve(index - 1, s, 1, dp), value + solve(index - 1, s, 0, dp));
            dp[index][carry] = min;
            return min;
        }

        static void init_dp(int dp[][], int N)
        {
            for (int i = 0; i < N; i++)
            {
                for (int j = 0; j < 2; j++)
                {
                    dp[i][j] = -1;
                }
            }
        }

    }
}

