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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int[][] bingo = new int[3][3];
            bingo[0] = CPUtils.readIntArray(3, in);
            bingo[1] = CPUtils.readIntArray(3, in);
            bingo[2] = CPUtils.readIntArray(3, in);
            int N = in.nextInt();
            int nums[] = CPUtils.readIntArray(N, in);
            Arrays.sort(nums);
            boolean answer = false;

            for (int row = 0; row < 3; row++)
            {
                int cnt = 0;
                for (int col = 0; col < 3; col++)
                {
                    int found = Arrays.binarySearch(nums, bingo[row][col]);
                    if (found >= 0) cnt++;
                }
                if (cnt == 3) answer = true;
            }
            for (int row = 0; row < 3; row++)
            {
                int cnt = 0;
                for (int col = 0; col < 3; col++)
                {
                    int found = Arrays.binarySearch(nums, bingo[col][row]);
                    if (found >= 0) cnt++;
                }
                if (cnt == 3) answer = true;
            }

            int el0_0 = bingo[0][0];
            int el1_1 = bingo[1][1];
            int el2_2 = bingo[2][2];
            if (Arrays.binarySearch(nums, el0_0) >= 0 && Arrays.binarySearch(nums, el1_1) >= 0 && Arrays.binarySearch(nums, el2_2) >= 0)
                answer = true;

            el0_0 = bingo[0][2];
            el1_1 = bingo[1][1];
            el2_2 = bingo[2][0];

            if (Arrays.binarySearch(nums, el0_0) >= 0 && Arrays.binarySearch(nums, el1_1) >= 0 && Arrays.binarySearch(nums, el2_2) >= 0)
                answer = true;

            if (answer)
                out.print("Yes");
            else
                out.print("No");
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

