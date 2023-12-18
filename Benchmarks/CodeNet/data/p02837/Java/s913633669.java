import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
            int A[][] = new int[n + 1][n + 1];
            for (int i = 1; i <= n; i++)
            {
                int j = in.nextInt();
                for (int z = 1; z <= j; z++)
                {
                    int t[] = CPUtils.readIntArray(2, in);
                    if (t[1] == 1)
                    {
                        A[i][t[0]] = 1;
                    } else
                    {
                        A[i][t[0]] = -1;
                    }
                }
            }
            Set<Integer> unkind = new HashSet<>();
            Set<Integer> honest = new HashSet<>();
            for (int i = 1; i <= n; i++)
            {
                for (int t = 1; t <= n; t++)
                {
                    if (A[i][t] == 1 && A[t][i] == -1)
                    {
                        unkind.add(i);
                        break;
                    }
                    if (A[i][t] == 1 && unkind.contains(t))
                    {
                        unkind.add(i);
                        break;
                    }
                    if (A[i][t] == -1 && honest.contains(t))
                    {
                        unkind.add(i);
                        break;
                    }
                }
                if (!unkind.contains(i)) honest.add(i);
            }
            out.print(n - unkind.size());
        }

    }

    static class CPUtils
    {
        public static int[] readIntArray(int size, Scanner in)
        {
            int[] array = new int[size];
            for (int i = 0; i < size; i++)
            {
                array[i] = in.nextInt();
            }
            return array;
        }

    }
}

