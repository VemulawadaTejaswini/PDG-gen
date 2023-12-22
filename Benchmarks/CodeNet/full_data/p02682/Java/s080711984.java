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
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int K = in.nextInt();

            int sum = 0;

            while (A > 0 && K > 0)
            {
                sum += 1;
                A--;
                K--;
            }
            while (B > 0 && K > 0)
            {
                B--;
                K--;
            }
            while (C > 0 && K > 0)
            {
                sum -= 1;
                C--;
                K--;
            }
            out.println(sum);
        }

    }
}

