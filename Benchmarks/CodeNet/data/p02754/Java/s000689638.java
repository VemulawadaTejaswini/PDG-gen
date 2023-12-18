import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long ab = a+b;

        long sum = 0;
        long num = 0;
        if (n ==ab)
        {
            System.out.println(a);
            System.exit(0);
        }else if (n < ab)
        {
            System.out.println(Math.min(a, n));
            System.exit(0);
        }

        do {
            ++num;
            sum += ab;
        } while (sum < n);

        long ans = a*(num-1);
        //System.out.println("an = "+ans);
        long tmp = n-(sum-ab*(num-1));
        //System.out.println("tmp = "+tmp);

        if (ans == 0)
        {
            if (a <= n) ans = a;
            else ans  = a-n;
        }
        else if (tmp <= a) ans += tmp;
        else ans+= ans += a;

        System.out.println(ans);

        sc.close();
    }
}