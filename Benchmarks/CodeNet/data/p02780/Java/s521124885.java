import java.util.*;
public class Main
{
  public static void main(String aegs[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int max=-1;
    for(int i=0;i<n-k;i++)
    {
      int sum=0;
      for(int j=i;j<i+k;j++)
        sum+=arr[j];
       if((sum+k)/2>max)
         max=(sum+k)/2;
    }
    System.out.println(max);
  }
}
