import java.util.*;
public class Main
{
    public static long findGCD(long c,long d)
    {
        if (d != 0)
       return findGCD(d, c%d);
    else 
       return c;
    }
  public static void main(String[] args)
  {
    Scanner Sc=new Scanner(System.in);
    long a=Sc.nextLong();
    long b=Sc.nextLong();
    long c=Sc.nextInt();
    long d=Sc.nextInt();
    long g=findGCD(c,d);
    long l=(c*d)/g;
    long mc=(b/c)-((a-1)/c);
    long md=(b/d)-((a-1)/d);
    long ml=(b/l)-((a-1)/l);
    System.out.println((b-a+1)-(mc+md)+ml);
  }
}
