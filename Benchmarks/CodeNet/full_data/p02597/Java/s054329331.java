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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            String S = in.next();
            int start = 0, end = S.length() - 1;
            int exchange = 0;
            while (start < end)
            {
                if (S.charAt(start) == 'W' && S.charAt(end) == 'R')
                {
                    exchange++;
                    start++;
                    end--;
                } else if (S.charAt(start) == 'R')
                    start++;
                else if (S.charAt(end) == 'W')
                    end--;
            }
            out.print(exchange);
        }

    }
}

