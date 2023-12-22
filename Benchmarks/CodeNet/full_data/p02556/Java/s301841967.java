import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE
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
            int N = in.nextInt();
            int points[][] = CPUtils.readIntMatrix(N, 2, in);

            int[] idealLT = new int[]{0, Integer.MAX_VALUE};
            int[] LT = new int[]{Integer.MAX_VALUE, 0};

            int[] idealLB = new int[]{0, 0};
            int[] LB = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};

            int[] idealRB = new int[]{Integer.MAX_VALUE, 0};
            int[] RB = new int[]{0, Integer.MAX_VALUE};

            int[] idealRT = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
            int[] RT = new int[]{0, 0};

            boolean lbC = false, ltC = false, rbC = false, rtC = false;

            for (int point[] : points)
            {
                if (distance(idealLB, point) < distance(idealLB, LB))
                {
                    LB = point;
                    lbC = true;
                }
                if (distance(idealLT, point) < distance(LT, point))
                {
                    LT = point;
                    ltC = true;
                }
                if (distance(idealRB, point) < distance(RB, point))
                {
                    RB = point;
                    rbC = true;
                }
                if (distance(idealRT, point) < distance(RT, point))
                {
                    RT = point;
                    rtC = true;
                }
            }
            List<int[]> sols = new ArrayList<>();
            if (lbC) sols.add(LB);
            if (ltC) sols.add(LT);
            if (rbC) sols.add(RB);
            if (rtC) sols.add(RT);
            long ans = 0;
            for (int i = 0; i < sols.size(); i++)
            {
                for (int j = 0; j < sols.size(); j++)
                {
                    ans = Math.max(ans, distance(sols.get(i), sols.get(j)));
                }
            }
            out.println(ans);
        }

        private long distance(int p1[], int p2[])
        {
            return Math.abs(p1[0] - (long) p2[0]) + Math.abs(p1[1] - (long) p2[1]);
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

        public static int[][] readIntMatrix(int rows, int columns, Scanner in)
        {
            int[][] matrix = new int[rows][columns];
            for (int i = 0; i < rows; i++)
            {
                matrix[i] = CPUtils.readIntArray(columns, in);
            }
            return matrix;
        }

    }
}

