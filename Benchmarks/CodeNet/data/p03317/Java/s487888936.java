import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long k = scn.nextLong();
        long a[] = new long[n];
        long c = 0;
        for (int i = 0; i < n; i++)
        {
            a[i] = scn.nextLong();
        }
        for (int i = 0; i < n; i++)
        {

            long min = findMin(a, i, k);
            a = setvalue(a, i, min, k);
            c++;
            if (isAllEqual(a))
            {
                break;
            }
            long q = i + k;
            if (q < a.length)
            {
                i += k - 1;
            }
        }
        System.out.println(c);
    }

    public static boolean isAllEqual(long[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            if (a[0] != a[i])
            {
                return false;
            }
        }

        return true;
    }

    private static long findMin(long[] a, int i, long k)
    {
        long min = Integer.MAX_VALUE;
        long q = i + k;
        if (q < a.length)
        {
            for (int j = i; j < k; j++)
            {
                if (a[j] < min)
                {
                    min = a[j];
                }
            }
        }
        else
        {
            for (int j = i; j < a.length; j++)
            {
                if (a[j] < min)
                {
                    min = a[j];
                }
            }
        }
        return min;

    }

    public static long[] setvalue(long[] a, int i, long min, long k)
    {
        long q = i + k;
        if (q < a.length)
        {
            for (int j = i; j < k; j++)
            {
                a[j] = min;
            }
        }
        else
        {
            for (int j = i; j < a.length; j++)
            {
                a[j] = min;
            }
        }
        return a;
    }

}