import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        TaskAtCoder solver = new TaskAtCoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskAtCoder
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int[] A = new int[3];
            A[0] = in.nextInt();
            A[1] = in.nextInt();
            A[2] = in.nextInt();
            Arrays.sort(A);
            if ((A[0] == A[1] && A[1] != A[2]) || (A[1] == A[2] && A[0] != A[1]))
            {
                out.print("Yes");
            } else
            {
                out.print("No");
            }
        }

    }
}

