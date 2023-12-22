import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        long n = kb.nextLong();

        long k = 1;
        long ans = 0;
        long sum = 0;
        for(;;k++)
        {
            sum += k;

            if(sum % n == 0)
            {
                ans = k;
                break;
            }
        }
        System.out.println(ans);
    }
}