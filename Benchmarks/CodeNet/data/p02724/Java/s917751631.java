import java.util.*;
public class Main
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long X=sc.nextLong();
    if(X>=500)
    {
      int h=(int)(X/500);
      int r=(int)((X-(h*500))/5);
      System.out.println((h*1000)+(r*5));
    }
    else if(X<500)
    {System.out.println(((int)(X/5))*5);
    }
  }
}