import java.io.*;
import java.util.*;
class program
{
  public static void main(String ar[])throws Exception
  {
    Scanner r=new Scanner(System.in);
    int n=r.nextInt();
    int p=n%1000;
    if(p==0)
      System.out.println(p);
    else
      System.out.println((1000-p));
  }
}
