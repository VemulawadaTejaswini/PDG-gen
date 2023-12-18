import java.util.*;
class sol
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    long a=s.nextLong();
    long b=s.nextLong();
    if(a+b%2==0)
    {
      System.out.println((a+b)/2);
    }
    else
    {
      System.out.println("IMPOSSIBLE");
    }
  }
}