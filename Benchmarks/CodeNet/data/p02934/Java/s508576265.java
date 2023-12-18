import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])throws Exception
  {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    double sum=0;
    for(int i=0;i<n;i++)
    {
      int a=Sc.nextInt();
      sum=sum+(1/a);
    }
    System.out.println(1/sum);
  }
}