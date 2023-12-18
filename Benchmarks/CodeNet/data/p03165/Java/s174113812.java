import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String A=in.next();
		String B=in.next();
		int dp[][]=new int[A.length()+1][B.length()+1];
		for(int i=0;i<=A.length();i++)
		{
			for(int j=0;j<=B.length();j++)
			{
				if(i==0 || j==0)
					dp[i][j]=0;
				else if(A.charAt(i-1)==B.charAt(j-1))
					dp[i][j]=1+dp[i-1][j-1];
				else
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		StringBuffer S=new StringBuffer();
		int i=A.length(),j=B.length();
		while(i>0 && j>0)
		{
			if(A.charAt(i-1)==B.charAt(j-1))
			{
				S.append(A.charAt(i-1));
				i--;
				j--;
			}
			else if(dp[i-1][j]>dp[i][j-1])
				i--;
			else
				j--;
		}
		String s=new String(S.reverse());
		System.out.println(s);
	}
}
