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
            int K = in.nextInt();
            int H[] = CPUtils.readIntArray(N, in);
            out.print(solve(0, H, K));
        }

        static int solve(int stone, int H[], int K)
        {
            if (stone + 1 >= H.length) return 0;

            int cost = Math.abs(H[stone] - H[stone + 1]) + solve(stone + 1, H, K);
            for (int jumpLen = 2; jumpLen <= K && stone + jumpLen < H.length; jumpLen++)
            {
                cost = Math.min(cost, Math.abs(H[stone] - H[stone + jumpLen]) + solve(stone + jumpLen, H, K));
            }
            return cost;
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

