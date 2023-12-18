import java.io.*;
import java.util.*;
class Main
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    if(n%2==0)
      System.out.print(n/2,n/2 + 1);
    else
    {
      int l=1;
      int r=n;
      while(l<=r)
      {
        System.out.println(l+" "+r);
      }
    }
  }
}