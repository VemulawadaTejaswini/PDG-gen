import java.util.*;
import java.math.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    double n=sc.nextDouble();
    double k=sc.nextDouble();
    int a[]=new int[(int)n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int ar[]=new int[(int)(n-k+1)];
    double sum=0;
    double ans=0;
     for(int i=0;i<n-k+1;i++)
     { sum=0;
      for(int j=i;j<i+k;j++)
      {double p=(double)(1+(double)a[j])/2;
       sum+=p;
      }
       ans=Math.max(ans,sum);
     }
     System.out.println(ans);
  }
}
