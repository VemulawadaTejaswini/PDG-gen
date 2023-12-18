import java.util.*;
public class Main
{
  public static void main(String aegs[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    double arr[]=new double[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextDouble();
    double max,sum=0;
    int cntr=0;
    for(int i=0;i<k;i++)
    sum+=arr[i];
    max=(sum+k)/2;
    for(int i=k;i<n;i++)
    {
      sum+=arr[i]-arr[i-k];
      if((sum+k)/2>max)
      max=(sum+k)/2;
    }
    System.out.println(max);
  }
}
