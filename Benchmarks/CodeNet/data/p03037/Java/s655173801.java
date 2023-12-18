import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] l = new int[m];
        int[] r = new int[m];

        for (int i = 0; i < m; i++)
        {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        int count = 0;
        loop:
        for (int j = 1; j <= n; j++)
        {
            for (int i = 0; i < m; i++)
            {
                if (j < l[i] || r[i] < j)
                    continue loop;
            }
            count++;
        }

        System.out.println(count);
    }
}
