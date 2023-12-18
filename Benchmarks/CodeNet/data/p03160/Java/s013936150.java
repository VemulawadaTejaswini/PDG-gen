import java.util.*;

public class Main
{
   public static void main(String args[])
   {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
     	int a[]=new int[n+1];
     	for(int i=0;i<n;i++) a[i+1]=sc.nextInt();
     	int dp[]=new int[n+1];
     
     	Arrays.fill(dp,Integer.MAX_VALUE);
 
     	for(int i=2;i<=n;i++)
        {
        	for(int j=i-1;j>=0;j--)
            {
            	dp[i]=Math.min(dp[i],Math.abs(dp[i]-dp[j]));
            }
        }
     
     	System.out.println(dp[n]);
   }
}
