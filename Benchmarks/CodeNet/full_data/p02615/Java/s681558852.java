import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for( int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    long ans=0;
    ans=a[n-1];
    ans+=(n-2)*1l*((long)a[n-2]);
    System.out.println(ans);
  }
}
