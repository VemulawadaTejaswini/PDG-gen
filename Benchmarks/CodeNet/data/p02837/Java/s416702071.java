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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int N;
            int A[] = new int[20];
            int x[][] = new int[20][20];
            int y[][] = new int[20][20];

            N = in.nextInt();

            for (int i = 1; i <= N; i++)
            {
                A[i] = in.nextInt();
                for (int j = 1; j <= A[i]; j++)
                {
                    x[i][j] = in.nextInt();
                    y[i][j] = in.nextInt();
                }
            }
            int ans = 0;
            for (int bits = 1; bits < (1 << N); bits++)
            {
                boolean ok = true;
                for (int i = 1; i <= N; i++)
                {
                    if ((bits & (1 << (i - 1))) == 0) continue;
                    for (int j = 1; j <= A[i]; j++)
                    {
                        if ((((bits >> (x[i][j] - 1)) & 1) ^ y[i][j]) > 0) ok = false;
                    }
                }
                if (ok) ans = Math.max(ans, counter(bits));
            }
            out.print(ans);
        }

        int counter(int x)
        {
            if (x == 0) return 0;
            return counter(x >> 1) + (x & 1);
        }

    }
}

