import java.io.*;
import java.util.*;

public class Main
{

	static int[] dp,a;
	static int n;
	

	static int find(int i)
	{
		if(i>=n)
			return Integer.MAX_VALUE;
		if(i==n-1)
			return 0;
		if(dp[i]!=0)
			return dp[i];
		if(i+1<=n-1 && i+2<=n-1)
			return dp[i]=Math.min(Math.abs(a[i+1]-a[i])+find(i+1),Math.abs(a[i+2]-a[i])+find(i+2));
		if(i+1<=n-1)
			return dp[i]=Math.abs(a[i+1]-a[i])+find(i+1);
		return dp[i]=Math.abs(a[i+2]-a[i])+find(i+2);

	}

		
	public static void main(String[] args)throws IOException{

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		

			// int t=Integer.parseInt(br.readLine());

			
			n=Integer.parseInt(br.readLine());
			dp=new int[n];a=new int[n];
			String[] s=br.readLine().split(" ");

			for(int i=0;i<n;i++)
				a[i]=Integer.parseInt(s[i]);
			
			System.out.println(find(0));





			

	}
	
}





