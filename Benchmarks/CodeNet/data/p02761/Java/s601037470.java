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
            int C[] = {-1, -1, -1};
            int[] digits = {0, 0, 0};

            while (M-- > 0)
            {
                int pos = in.nextInt() - 1;
                int digit = in.nextInt();
                if (C[pos] != -1 && C[pos] != digit)
                {
                    out.print(-1);
                    return;
                }
                C[pos] = digit;
                digits[pos] = digit;
            }
            if (N == 3 && digits[0] == 0)
            {
                out.print(-1);
                return;
            }
            if (N == 2 && digits[1] == 0)
            {
                out.print(-1);
                return;
            }
            String s = "";
            for (int i = 0; i < N; i++)
            {
                s += digits[i];
            }
            out.print(Integer.parseInt(s));

        }

    }
}

