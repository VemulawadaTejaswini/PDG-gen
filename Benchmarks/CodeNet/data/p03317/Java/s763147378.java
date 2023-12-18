import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int a[] = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++)
        {
            a[i]=scn.nextInt();
        }
        for (int i = 0; i < n; i++)
        {

            int min = findMin(a, i, k);
            a = setvalue(a, i, min, k);
            c++;
            if (isAllEqual(a))
            {
                break;
            }
            if(i+k<a.length)
            {
                i+=k-1;
            }
        }
        System.out.println(c);
    }

    public static boolean isAllEqual(int[] a)
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

    private static int findMin(int[] a, int i, int k)
    {
        int min = Integer.MAX_VALUE;
        if (i + k < a.length)
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

    public static int[] setvalue(int a[], int i, int min, int k)
    {
        if (i + k < a.length)
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