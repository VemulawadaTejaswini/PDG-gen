import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        if (n < k)
        {
            long candidate = Math.abs(n-k);
            long candidate2 = Math.abs(candidate-k);
            System.out.println(Math.min(candidate,candidate2));
        }
        else
        {
            if (n%k == 0) System.out.println(0);
            else
            {
                long candidate = n%k;
                long candidate2 = Math.abs(candidate-k);
                System.out.println(Math.min(candidate,candidate2));
            }
        }

        sc.close();
    }
}