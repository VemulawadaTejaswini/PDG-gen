import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=a%k;
    int d=a+(k-c);
    if(c==0)
    {
      System.out.println("OK");
    }
    else if(b%k==0)
    {
       System.out.println("OK");
    }
    else if(c!=0)
    {
      if(d<=b)
      {
        System.out.println("OK");
      }
      else
      {
         System.out.println("NG");
      }
    }
    else
    {
       System.out.println("NG");
    }
  }
}
    