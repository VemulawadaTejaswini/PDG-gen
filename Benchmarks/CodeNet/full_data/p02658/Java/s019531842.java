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
            long A[] = CPUtils.readLongArray(N, in);
            long answer = 1;

            for (long a : A)
            {
                if (a == 0)
                {
                    out.println(0);
                    return;
                }
            }
            for (long a : A)
            {
                answer *= a;
                if (answer < 0 || answer > 1_000_000_000_000_000_000L)
                {
                    out.println(-1);
                    return;
                }
            }
            out.println(answer);
        }

    }

    static class CPUtils
    {
        public static long[] readLongArray(int size, Scanner in)
        {
            long[] array = new long[size];
            for (int i = 0; i < size; i++)
            {
                array[i] = in.nextLong();
            }
            return array;
        }

    }
}

