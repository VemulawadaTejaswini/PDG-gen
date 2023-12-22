import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt(), n = scan.nextInt();
        int[] a = new int[n], b = new int[n];
        int[] ans = new int[w];

        scan.useDelimiter(",|\n");

        for (int j = 0; j < n; j++)
        {
            a[j] = scan.nextInt();
            b[j] = scan.nextInt();
        }

        for (int i = 1; i <= w; i++)
        {
            int now = i;

            for (int j = 0; j < n; j++){
                if (a[j] == now)
                {
                    now = b[j];
                }
                else if (b[j] == now)
                {
                    now = a[j];
                }
            }
            ans[now - 1] = i;
        }

        for (int i = 0; i < w; i++) {
            System.out.println(ans[i]);
        }
    }
}