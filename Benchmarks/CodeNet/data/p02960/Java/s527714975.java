import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		String s=in.next();
		int n=s.length();
		long m=1000000007l;
		long [][] ans = new long [n+1][13];
		ans[0][0]=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<13;j++)
			{
				if(s.charAt(i)=='?')
				{
					for(int k=0;k<10;k++)
					{
						ans[i+1][(10*j+k)%13]=(ans[i+1][(10*j+k)%13]+ans[i][j])%m;
					}
				}
				else
				{
					ans[i+1][(10*j+(s.charAt(i)-'0'))%13]=(ans[i+1][(10*j+(s.charAt(i)-'0'))%13]+ans[i][j])%m;
				}
			}
		}
		System.out.println(ans[n][5]);
	}
}
	