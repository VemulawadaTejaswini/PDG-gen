import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
            int H = in.nextInt();
            int W = in.nextInt();
            char[][] matrix = new char[H][W];
            for (int i = 0; i < H; i++)
            {
                matrix[i] = in.next().toCharArray();
            }
            int x = H - 1;
            int y = W - 1;
            int[][] memo = new int[H][W];
            for (int i = 0; i < H; i++)
            {
                Arrays.fill(memo[i], -1);
            }
            out.println(getNWays(x, y, matrix, memo) % 1000000007);
        }

        int getNWays(int row, int column, char[][] matrix, int[][] memo)
        {
            if (row == 0 && column == 0) return 1;
            if (memo[row][column] != -1)
            {
                return memo[row][column];
            }
            int ways = 0;
            int x[] = {-1, 0};
            int y[] = {0, -1};

            if (isValid(row + x[0], column + y[0], matrix))
            {
                ways += getNWays(row + x[0], column + y[0], matrix, memo) % 1000000007;
            }

            if (isValid(row + x[1], column + y[1], matrix))
            {
                ways += getNWays(row + x[1], column + y[1], matrix, memo) % 1000000007;
            }
            memo[row][column] = ways;
            return ways;
        }

        boolean isValid(int row, int column, char[][] matrix)
        {
            return row >= 0 && row < matrix.length && column >= 0 && column < matrix[0].length && matrix[row][column] != '#';
        }

    }
}

