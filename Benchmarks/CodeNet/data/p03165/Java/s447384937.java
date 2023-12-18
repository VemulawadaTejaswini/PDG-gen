import java.io.*;
import java.util.*;




public class Main
{

	static String s1,s2;


	public static void main(String[] Rohan)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));





		// String[] s=br.readLine().split(" ");

		s1=br.readLine();
		s2=br.readLine();


		int[][] dp=new int[s1.length()+1][s2.length()+1];


		for(int i=1;i<=s2.length();i++)
		{
			if(s2.charAt(i-1)==s1.charAt(0))
				dp[1][i]=1;
			else
				dp[1][i]=dp[1][i-1];
		}

		for(int i=2;i<=s1.length();i++)
		{
			for(int j=1;j<=s2.length();j++)
			{
				if(s1.charAt(i-1)==s2.charAt(j-1))
					dp[i][j]=Math.max(dp[i-1][j-1]+1,Math.max(dp[i-1][j],dp[i][j-1]));
				else
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			}
		}

		// for(int i=0;i<=s1.length();i++)
		// {
		// 	for(int j=0;j<=s2.length();j++)
		// 		System.out.print(dp[i][j]+" ");
		// 	System.out.println();
		// }


		int indx=dp[s1.length()][s2.length()]-1;
		char[] c=new char[dp[s1.length()][s2.length()]];



		int i=s1.length(),j=s2.length();


		while(i>0 && j>0)
		{
			if(s1.charAt(i-1)==s2.charAt(j-1))
			{
				c[indx]=s1.charAt(i-1);indx--;
				i--;j--;
			}
			else
			{
				if(dp[i-1][j]>dp[i][j-1])
				{
					i--;
				}
				else
					j--;
			}
		}

		for(int i1=0;i1<dp[s1.length()][s2.length()];i1++)
			System.out.print(c[i1]);
		System.out.println();
		

	}
}