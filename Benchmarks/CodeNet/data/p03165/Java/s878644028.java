import java.util.*;

import java.io.*;

public class Main {
	static String s1,s2;
	static int [][] memo;
	static StringBuilder ans;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s1=br.readLine();
		s2 = br.readLine();
		memo = new int[s1.length()][s2.length()];
		for(int i=0;i<s1.length();i++)Arrays.fill(memo[i], -1);
		dp(s1.length()-1,s2.length()-1);
		ans = new StringBuilder();
		trace(s1.length()-1 , s2.length()-1);
		System.out.println(ans.reverse());
	
	}
	public static int dp(int i,int j)
	{
		if(i==-1|| j==-1)return 0;
		if(memo[i][j]!=-1)return memo[i][j];
		if(s1.charAt(i)==s2.charAt(j))return memo[i][j] = 1+dp(i-1,j-1);
		return memo[i][j]=Math.max(dp(i-1,j),dp(i,j-1));
	}
	
	public static void trace(int i , int j)
	{
		if(i==-1 || j==-1)return;
		if(s1.charAt(i)==s2.charAt(j)) {
			ans.append(s1.charAt(i));
			trace(i-1,j-1);
		}
		else
		{
			if(i>0 && j>0)
			{
				if(memo[i-1][j]>=memo[i][j-1])trace(i-1,j);
				else trace(i,j-1);
			}
			else if(i>0)trace(i-1,j);
			else if(j>0)trace(i,j-1);
			
		}
	}
	
	
	
	

}
