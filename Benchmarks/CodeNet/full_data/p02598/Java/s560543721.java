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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            int K = in.nextInt();
            int logs[] = CPUtils.readIntArray(N, in);

            int low = 0, high = 1_000_000_000;
            int answer = 0;
            while (low < high)
            {
                int mid = low + ((high - low) / 2);
                if (isOK(logs, K, mid))
                {
                    answer = high = mid;
                } else
                {
                    low = mid + 1;
                }
            }
            out.print(answer);
        }

        private boolean isOK(int[] logs, int k, int size)
        {
            int totalCuts = 0;
            for (int log : logs)
            {
                if (log > size)
                {
                    totalCuts += log / size;
                }
            }
            return totalCuts <= k;
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

