import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger;

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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC
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
            long MOD = 1_000_000_000 + 7;
            int N = in.nextInt();
            if (N == 1)
            {
                out.println(0);
                return;
            }
            if (N == 2)
            {
                out.println(1);
                return;
            }
            BigInteger total = new BigInteger("" + 10).pow(N);

            BigInteger a = new BigInteger("" + 9).pow(N);
            BigInteger c = new BigInteger("" + 8).pow(N);

            BigInteger a_b = a.multiply(new BigInteger("" + 2));
            BigInteger ans = total.subtract(a_b).add(c);
            out.println(ans.mod(new BigInteger("" + MOD)).toString());
        }

    }
}

