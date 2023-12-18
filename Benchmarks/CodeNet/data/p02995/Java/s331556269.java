import java.util.*;

public class Main
{
    public static long y(long m, long n)
    {
        long tmp;
        while(m%n != 0)
        {
            tmp = n;
            n = m%n;
            m = tmp;
        }
        return n;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a, b, c, d;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        d = sc.nextLong();
        long count = b - a+(long)1;

        long max_y = y(c,d);
        long min_k = c*d/max_y;

        if(a%c==0 && a%d==0)count++;
        if(b%c==0 && b%d==0)count++;
        
        long tmp = (b/c + b/d - b/min_k) - (a/c + a/d - a/min_k);
        count = count - tmp;

        System.out.println(count);
        
        
    }
}

