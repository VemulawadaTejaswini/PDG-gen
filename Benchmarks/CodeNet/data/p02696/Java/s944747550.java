import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();

        long m = Math.min(b-1,n);

        Cal c = new Cal();
        long value = c.calc(a,b,m);
        System.out.println(value);
        sc.close();
    }
}

class Cal
{
    public long calc(long a,long b,long x)
    {
        double value = Math.floor((a*x)/b) - a * Math.floor(x/b);
        return (long) value;
    }
}