

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		long l=scan.nextLong();
		long r=scan.nextLong();
		long ans=Long.MAX_VALUE;
		for(long i=l;i<=(Math.min(r, l+2018));i++)
		{
			for(long j=i+1;j<=Math.min(r,l+2018);j++)
			{
				ans=Math.min(ans,((i%2019)*(j%2019))%2019);
			}
		}
		System.out.println(ans);
		
	}
}
