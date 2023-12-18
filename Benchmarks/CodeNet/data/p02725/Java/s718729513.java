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
            int K = in.nextInt();
            int N = in.nextInt();
            int nums[] = CPUtils.readIntArray(N, in);
            int distance = 0;

            int current = nums[0];
            int i = 1;
            for (; i < nums.length; i++)
            {
                int next = nums[i];
                if ((double) (next - current) > (K / (double) 2))
                {
                    break;
                } else
                {
                    distance += (next - current);
                }
                current = next;
            }
            if (i == nums.length)
            {
                out.print(distance);
                return;
            }

            current = nums[i];
            for (i = i + 1; i < nums.length; i++)
            {
                int next = nums[i];
                distance += (next - current);
                current = next;
            }
            distance += (nums[0] + (K - current));
            out.print(distance);
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

