import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []ar=new int[n];
    for(int i=0;i<n;++i)
    {
      ar[i]=sc.nextInt();
    }
    long sum=0;
    int mod=1000000007;
    for(int i=0;i<n-1;++i)
    {
      for(int j=i+1;j<n;++j)
      {
        sum=(sum+ar[i]+ar[j])%mod;
      }
    }
    System.out.println(sum);
  }
}