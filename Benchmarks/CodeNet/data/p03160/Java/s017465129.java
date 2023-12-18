
import java.math.*;
import java.io.*;
import java.util.*;

public class Main {

	public static int func(int arr[] , int n)
	{
		int dp[] = new int[n];
    	if(n == 1)
    		return 0;
    	if(n == 2)
    		return Math.abs(arr[1] - arr[0]);
    	dp[1] = Math.abs(arr[1] - arr[0]);
    	for(int i = 2; i < n; i++)
    	{
    		int a = Math.abs(arr[i] - arr[i - 1]) + dp[i-1];
    		int b = Math.abs(arr[i] - arr[i - 2]) + dp[i-2];
    		dp[i] = Math.min(a,b);
    	}
    	return dp[n-1];
	}

	public static void main(String[] args) throws Exception
	{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	String str[] = br.readLine().trim().split("\\s+");
    	int arr[] = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
    	System.out.println(func(arr,n));
    }

}


