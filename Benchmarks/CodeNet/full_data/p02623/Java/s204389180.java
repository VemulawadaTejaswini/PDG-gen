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
            int M = in.nextInt();
            int K = in.nextInt();
            int A[] = CPUtils.readIntArray(N, in);
            int B[] = CPUtils.readIntArray(M, in);
            int[] prefix_sum_A = getPrefixSum(A);
            int[] prefix_sum_B = getPrefixSum(B);

            int max = 0;
            for (int i = 0; i < A.length; i++)
            {
                if (prefix_sum_A[i] <= K)
                {
                    int books = i + 1;
                    int low = lowerBound(prefix_sum_B, K - prefix_sum_A[i] + 1);
                    if (low - 1 >= 0)
                        books += low;
                    max = Math.max(max, books);
                }
            }
            for (int i = 0; i < B.length; i++)
            {
                if (prefix_sum_B[i] <= K)
                {
                    int books = i + 1;
                    int low = lowerBound(prefix_sum_A, K - prefix_sum_B[i] + 1);
                    if (low - 1 >= 0)
                        books += low;
                    max = Math.max(max, books);
                }
            }

            if (K >= prefix_sum_B[M - 1])
            {
                max = Math.max(max, M);
            }
            if (K >= prefix_sum_A[N - 1])
            {
                max = Math.max(max, N);
            }
            out.println(max);
        }

        private int[] getPrefixSum(int A[])
        {
            int[] prefix_sum = new int[A.length];
            prefix_sum[0] = A[0];
            for (int i = 1; i < A.length; i++)
            {
                prefix_sum[i] = prefix_sum[i - 1] + A[i];
            }
            return prefix_sum;
        }

        public static int lowerBound(int[] array, int value)
        {
            int low = 0;
            int high = array.length;
            while (low < high)
            {
                final int mid = (low + high) / 2;
                if (value <= array[mid])
                {
                    high = mid;
                } else
                {
                    low = mid + 1;
                }
            }
            return low;
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

