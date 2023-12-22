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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int T = 1;
            while (T-- > 0)
            {
                solveOne(in, out);
            }
        }

        private void solveOne(Scanner in, PrintWriter out)
        {
            long X = Math.abs(in.nextLong());
            long K = in.nextLong();
            long D = in.nextLong();

            double needed = Math.ceil(((double) X) / D);

            if (K <= needed)
            {
                out.println(Math.abs(X - (K * D)));
            } else
            {
                K -= needed;
                if (K % 2 == 0)
                {
                    out.println((long) Math.abs(X - (needed * D)));
                } else
                {
                    out.println((long) (X - ((needed - 1) * D)));
                }
            }
        }

    }
}

