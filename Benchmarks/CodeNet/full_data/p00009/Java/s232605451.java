import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    private static final int MAX_N = (int) 1e6 + 16;
    private static int[] number = new int[MAX_N];

    private static int solve(int n)
    {
        Arrays.fill(number, 0);
        number[0] = 1;
        number[1] = 1;
        int count = 0;
        for (int i = 2; i <= n; i++)
        {
            if (number[i] == 0)
            {
                count++;
                for (int j = i*i; j <= n; j += i)
                {
                    if (j < 0) break;
                    number[j] = 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (in.hasNext())
        {
            sb.append(String.format("%d\n", solve(in.nextInt())));
        }
        System.out.print(sb.toString());
    }
}