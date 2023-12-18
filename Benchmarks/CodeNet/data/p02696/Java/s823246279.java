import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long a=sc.nextlong();
    long b=sc.nextlong();
    long n=sc.nextlong();
    long d=0,c=n;
    if(b-1<=n)
    {
      c=b-1;
    }
    d=a*c/d - a*(c/b);
      System.out.println(d);
     
  }
}
    