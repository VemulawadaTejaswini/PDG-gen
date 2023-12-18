import java.io.*;
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long X=sc.nextLong();
    long b=100;
    long count=0;
    while(b<X)
    {
      count++;
      b+=1;
    }
    System.out.print(count);
  }
}