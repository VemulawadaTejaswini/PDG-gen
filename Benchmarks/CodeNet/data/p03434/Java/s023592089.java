import java.util.*;

class Abc088b
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        int x;
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                if(a[i] < a[j])
                {
                    x    = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
        int sum = 0;
        for(int i=n-1; i>=1; i--)
        {
             sum += a[i];
             sum -= a[--i];

        }
        if(n % 2 == 1)
        {
            sum += a[0];
        }
        System.out.println(sum);
    }
}