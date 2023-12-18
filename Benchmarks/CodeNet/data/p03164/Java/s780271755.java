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
            int N = in.nextInt();
            int W = in.nextInt();
            int costValueMatrix[][] = CPUtils.readIntMatrix(N, 2, in);
            long matrix[][] = new long[N + 1][W + 1];
            for (int i = 0; i <= N; i++)
            {
                Arrays.fill(matrix[i], 0);
            }
            for (int item = 1; item <= N; item++)
            {
                for (int w = 1; w <= W; w++)
                {
                    if (costValueMatrix[item - 1][0] <= w)
                    {
                        matrix[item][w] = Math.max(
                                matrix[item - 1][w],
                                costValueMatrix[item - 1][1] + matrix[item - 1][w - costValueMatrix[item - 1][0]]
                        );
                    } else
                    {
                        matrix[item][w] = matrix[item - 1][w];
                    }
                }
            }
            out.print(matrix[N][W]);
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

    }
}

