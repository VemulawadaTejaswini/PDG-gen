import java.util.*;
import java.lang.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long[] a=new long[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextLong();
    long ans=0;
    Arrays.sort(a);
    long v1=a[n-1];
    long v2=a[n-2];
    ans=0+v1+((n-2)*(v2));
    System.out.println(ans);
    
  }
}