import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		String s1=in.next();
		String s2=in.next();
		int n=s1.length();
		int m=s2.length();
		String [][] ans=new String [n+1][m+1];
				String s3=new String();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=m;j++)
			{
				if(i==0||j==0)
				{
					ans[i][j]=new String();
				}
				else if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					ans[i][j]=ans[i-1][j-1]+s1.charAt(i-1);
				}
				else
				{
					if(ans[i][j-1].length()>ans[i-1][j].length())
					{
						ans[i][j]=ans[i][j-1];
					}
					else
					{
						ans[i][j]=ans[i-1][j];
					}
				}
			}
		}
		System.out.println(ans[n][m]);
			
	}
}
	