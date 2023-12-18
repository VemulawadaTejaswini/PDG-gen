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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            int array[][] = CPUtils.readIntMatrix(N, 3, in);
            int best[] = new int[3];
            for (int i = 0; i < N; ++i)
            {
                int[] dp = new int[3];
                for (int j = 0; j < 3; ++j) // previous
                    for (int k = 0; k < 3; ++k)
                    { // next
                        if (j == k) continue;
                        dp[k] = Math.max(dp[k], best[j] + array[i][k]);
                    }
                best = dp;
            }
            out.print(CPUtils.maxArray(best));
        }

    }

    static class CPUtils
    {
        public static int[] readIntArray(int size, Scanner in)
        {
            int[] array = new int[size];
            for (int i = 0; i < size; i++)
            {
                array[i] = in.nextInt();
            }
            return array;
        }

        public static int[][] readIntMatrix(int rows, int columns, Scanner in)
        {
            int[][] matrix = new int[rows][columns];
            for (int i = 0; i < rows; i++)
            {
                matrix[i] = CPUtils.readIntArray(columns, in);
            }
            return matrix;
        }

        public static int maxArray(int[] array)
        {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++)
            {
                max = Math.max(max, array[i]);
            }
            return max;
        }

    }
}

