import java.util.*;

public class Main {
    public static int gcd(int a, int b)
    {
        if(a==0)
            return b;
        return gcd(b%a, a);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        long count = 0;
        for(int a=1;a<=K;a++)
        {
            for(int b=a;b<=K;b++)
            {
                for(int c=b;c<=K;c++)
                {
                    int gcd = gcd(gcd(a, b), c);
                    if(a!=b && b !=c && c!=a)
                        count += gcd*6;
                    else if(a == b && a != c)
                        count += gcd*3;
                    else if(b == c && a !=c)
                        count+=gcd*3;
                    else
                        count+=gcd;
                }
            }
        }
        System.out.println(count);
    }
}
