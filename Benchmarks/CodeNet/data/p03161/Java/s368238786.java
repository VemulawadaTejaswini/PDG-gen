import java.util.*;
import java.io.*;
class Main
{
  public static void main (String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] s = br.readLine().split("\\s");
    	int n = Integer.parseInt(s[0]);
    	int k = Integer.parseInt(s[1]);
		String[] ss = br.readLine().split("\\s");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
          arr[i] = Integer.parseInt(ss[i]);
      	}
      	int t1=0;
      	if(n == 1)
      	{
      		System.out.println(t1);
      		return;
      	}
      	int[] dp = new int[n];
      	Arrays.fill(dp, Integer.MAX_VALUE);
      	dp[0] = 0;
      	for(int i = 0; i < n; i++)
      	{
      		for(int j = i+1; j <= Math.min(k+i, n-1); j++)
      		{
      			dp[j] = Math.min(dp[j], dp[i] + Math.abs(arr[j]-arr[i]));
      		}
      	}
      	System.out.println(dp[n-1]);
    }
}