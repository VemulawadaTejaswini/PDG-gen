import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    int[] dp=new int[k+1];
    for(int i=0;i<=k;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(i>=a[j] && dp[i-a[j]]==0)
        dp[i]=1;
      }
    }
    String ans=dp[k]==1?"First":"Second";
    System.out.println(ans);
  }
}