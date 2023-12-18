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
            boolean[] composite = new boolean[10_000 + 1];
            int X = in.nextInt();

            for (int i = 2; i <= Math.sqrt(10_000); i++)
            {
                for (int j = 2; j <= Math.sqrt(10_000); j++)
                {
                    composite[i * j] = true;
                }
            }
            for (int i = X; i <= Math.sqrt(10_000); i++)
            {
                if (!composite[i])
                {
                    out.print(i);
                    return;
                }
            }
        }

    }
}

