import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt():
    int c=in.nextInt():
    int k=in.nextInt();
    while(k!=0)
    {
      if(a>=b)
      {
        b*=2;
      }
      else if(b>=c)
      {
        c*=2;
      }
      k--;
    }
    if((c>a && c>b) && b>a)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
}
      