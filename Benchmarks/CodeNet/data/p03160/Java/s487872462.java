import java.util.*;
import java.lang.*;
import java.io.*;
class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    int n=Integer.parseInt(br.readLine());
		    String st[]=br.readLine().trim().split(" ");
		    int a[]=new int[n];
		    int dp[]=new int[n];
		    int i;
		    for(i=0;i<n;i++){
		        a[i]=Integer.parseInt(st[i]);
		    }
		    dp[0]=0;
		    dp[1]=Math.abs(a[1]-a[0]);
		    for(i=2;i<n;i++){
		        dp[i]=Math.min(dp[i-1]+Math.abs(a[i]-a[i-1]),dp[i-2]+Math.abs(a[i]-a[i-2]));
		    }
		    System.out.println(dp[n-1]);
	}
}