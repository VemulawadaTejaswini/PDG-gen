import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String X1=in.next();
		String X2=in.next();
		String A,B;
		if(X1.length()>X2.length())
		{
			A=X1;
			B=X2;
		}
		else
		{
			A=X2;
			B=X1;
		}
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
		/*for(int i=0;i<=A.length();i++)
		{
			for(int j=0;j<=B.length();j++)
				System.out.print(dp[i][j]+" ");
			System.out.println();
		}*/
		StringBuffer S=new StringBuffer();
		int y=B.length();
		for(int i=A.length();i>=1;i--)
		{
			for(int j=y;j>=1;j--)
			{
				if(dp[i][j]!=dp[i][j-1])
				{
					S.append(B.charAt(j-1));
					y=--j;
					break;
				}
			}
		}
		String s=new String(S.reverse());
		System.out.println(s);
	}
}
