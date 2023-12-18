import java.util.*;
import java.io.*;
class Main
{
  public static void main (String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
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
      	if(n == 2)
      	{
      		System.out.println(Math.abs(arr[1]-arr[0]));
      	}
      	int t2 = Math.abs(arr[1]-arr[0]);
      	int[] dp = new int[n];
      	dp[0] = 0;
      	dp[1] = t2;
      	for(int i = 2; i < n; i++)
      	{
      		dp[i] = Math.min(dp[i-2] + Math.abs(arr[i-2]-arr[i]), dp[i-1] + Math.abs(arr[i]-arr[i-1]));
      	}
      	System.out.println(dp[n-1]);
    }
}