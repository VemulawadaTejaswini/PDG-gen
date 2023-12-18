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
            String a = Integer.toString(in.nextInt());
            String b = Integer.toString(in.nextInt());
            String aa = "";
            String bb = "";

            int b_count = Integer.parseInt(b);
            while (b_count-- > 0)
            {
                aa += a;
            }

            int a_count = Integer.parseInt(a);
            while (a_count-- > 0)
            {
                bb += b;
            }
            if (aa.compareTo(bb) < 0)
            {
                out.print(aa);
            } else
            {
                out.print(bb);
            }

        }

    }
}

