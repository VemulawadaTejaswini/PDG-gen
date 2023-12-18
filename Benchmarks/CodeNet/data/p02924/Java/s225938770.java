import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
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
            int n = in.nextInt();
            BigDecimal bdecN = new BigDecimal(n);
            BigDecimal bdecNMinus1 = new BigDecimal(n - 1);

            BigDecimal bdecRes = (bdecN.multiply(bdecNMinus1)).divide(new BigDecimal(2));
            out.print(bdecRes.longValue());
        }

    }
}

