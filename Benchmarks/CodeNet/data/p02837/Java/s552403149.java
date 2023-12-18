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
            int answer = 0;
            AA:
            for (int bits = 1; bits < (1 << n); bits++)
            {
                Set<Integer> U = new HashSet<>();
                Set<Integer> H = new HashSet<>();
                for (int i = 1; i <= n; i++)
                {
                    //nth bit in integer
                    int p = (bits >> (i - 1)) & 1;
                    if (p == 1)
                        H.add(i);
                    else
                        U.add(i);
                }
                for (int i = 1; i <= n; i++)
                {
                    //can skip unkind
                    if (U.contains(i)) continue;

                    for (int t = 1; t <= n; t++)
                    {
                        if (A[i][t] != 0)
                        {
                            if ((A[i][t] == 1 && U.contains(t)) || (A[i][t] == -1 && H.contains(t)))
                            {
                                U.clear();
                                H.clear();
                                continue AA;
                            }
                        }
                    }
                }
                answer = Math.max(answer, Integer.bitCount(bits));
                U.clear();
                H.clear();
            }
            out.print(answer);
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

