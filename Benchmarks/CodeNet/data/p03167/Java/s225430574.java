import java.util.*;

import java.io.*;

public class Main{
	
	static long[][] memo;
	static char[][] grids;
	static int n , m;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String[] inp = br.readLine().split(" ");
		 n = Integer.parseInt(inp[0]);
		 m = Integer.parseInt(inp[1]);
		grids = new char[n][m];
		for(int i=0;i<n;i++)
		{
			String s=br.readLine();
			for(int j=0;j<m;j++)grids[i][j]=s.charAt(j);
		}
		memo = new long[n][m];
		System.out.println(dp(0,0));
		
		
		pw.flush();
		pw.close();
	}
	
	public static long dp(int i , int j)
	{
		if(i==n-1 && j==m-1)return 1;
		if(memo[i][j]!=0) return memo[i][j];
		if(valid(i+1,j)) memo[i][j]+=dp(i+1,j);
		if(valid(i,j+1)) memo[i][j]+=dp(i,j+1);
		return memo[i][j]%=((int)1e9+7);
		
	}
	
	
	public static boolean valid(int i , int j)
	{
		return (i>=0) && (i<n) && (j>=0) && (j<m) && (grids[i][j]=='.');
	}
	

}
