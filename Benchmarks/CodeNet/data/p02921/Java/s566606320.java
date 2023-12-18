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
            String predicted = in.next();
            String forecasted = in.next();
            int c = 0;
            for (int i = 0; i < predicted.length(); i++)
            {
                if (predicted.charAt(i) == forecasted.charAt(i))
                {
                    c++;
                }
            }
            out.print(c);
        }

    }
}