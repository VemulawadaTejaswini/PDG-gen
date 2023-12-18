import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		String str=s.next();
		String t=s.next();
		
		int[][] dp=new int[str.length()+1][t.length()+1];
		
		ArrayList<Character> list=new ArrayList<>(); 
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<t.length();j++)
			{
				if(str.charAt(i)==t.charAt(j))
				{
					dp[i+1][j+1]=1+dp[i][j];
				}
				else
				{
					dp[i+1][j+1]=Math.max(dp[i][j+1],dp[i+1][j]);
				}
			}
		}
	
		int i=str.length();
		int j=t.length();
		
		while(i>0&&j>0)
		{
			if(str.charAt(i-1)==t.charAt(j-1))
			{
				list.add(str.charAt(i-1));
				i--;
				j--;
			}
			else if(dp[i-1][j]>dp[i][j-1])
			{
				i--;
			}
			else
				j--;
		}
		
		for(int k=list.size()-1;k>=0;k--)
		{
			System.out.print(list.get(k));
		}
		
	}
	
}