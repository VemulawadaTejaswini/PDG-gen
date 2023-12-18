import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class P1 {
	static int[][] weights;
	static long[][] memo;
	static int w , n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp[] = br.readLine().split(" ");
		 n = Integer.parseInt(inp[0]);
		 w = Integer.parseInt(inp[1]);
		weights = new int[n][2];
		memo = new long[n][w+1];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<w;j++)
				memo[i][j]=-1;
		}
		for(int i=0;i<n;i++)
		{
			inp=br.readLine().split(" ");
			weights[i][0]=Integer.parseInt(inp[0]);
			weights[i][1]=Integer.parseInt(inp[1]);
		}
		System.out.println(dp(0,0));
		
	}
	
	public static long dp(int i , int weight)
	{
		if(i==n)return 0;
		
		if(memo[i][weight]!=-1)return memo[i][weight];
		long take=-1;
		if (weight+weights[i][0]<=w)
			take = dp(i+1,weight+weights[i][0])+weights[i][1];
		long leave = dp(i+1,weight);
		return memo[i][weight] = Math.max(take, leave);	
		
	}

}
