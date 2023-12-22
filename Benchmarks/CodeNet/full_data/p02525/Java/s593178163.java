import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (n > 0)
        {
            int[] num = new int[n];
            double ans, ave, sum = 0;

            for (int i = 0; i < n; i++)
            {
                num[i] = scan.nextInt();
                sum += num[i];
            }

            ave = sum / n;
            sum = 0;

            for (int i = 0; i < n; i++)
            {
                sum += Math.pow(num[i] - ave, 2);
            }

            ans = sum / n;

            System.out.println(Math.sqrt(ans));

            n = scan.nextInt();
        }
    }
}