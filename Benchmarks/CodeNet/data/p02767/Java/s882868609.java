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
            int X[] = CPUtils.readIntArray(N, in);

            int minSum = Integer.MAX_VALUE;
            int currentSum = 0;
            for (int pointX = 0; pointX < 110; pointX++)
            {
                for (int x : X)
                {
                    currentSum += (x - pointX) * (x - pointX);
                }
                minSum = Math.min(minSum, currentSum);
                currentSum = 0;
            }
            out.print(minSum);
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

    }
}

