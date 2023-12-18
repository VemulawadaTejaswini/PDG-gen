import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])throws Exception
  {
    Scanner Sc=new Scanner(System.in);
    long a=Sc.nextLong();
    long b=Sc.nextLong();
    long c=findXOR(b);
    long d=findXOR(a-1);
    long e=c^d;
    System.out.println(e);
  }
  static long findXOR(long n)
  {
    if(n%4==0)
      return n;
    else if(n%4==1)
      return 1;
    else if(n%4==2)
      return n+1;
    return 0;
  }
}