

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=scan.nextInt();
		}
		boolean dp[]=new boolean[k+1];
		dp[0]=false;
		for(int i=1;i<=k;i++)
		{
			for(int x:ar)
			{
				if(i>=x && !dp[i-x])
				{
					dp[i]=true;
				}
			}
		}
		if(dp[k])
		{
//			System.err.println();
			System.out.println("First");
		}else {
			System.out.println("Second");
		}
		
	}
}
