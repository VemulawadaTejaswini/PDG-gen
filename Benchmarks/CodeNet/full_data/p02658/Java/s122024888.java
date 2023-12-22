import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		long ans=1;
		int flag=0;
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			long a=in.nextLong();
			if(a==0)
			{
				flag=-1;
				ans=ans*a;
				break;
			}			
			if(ans>(long)1e18/a)
			{
				flag=1;
			}
			ans=ans*a;
		}
		if(flag==1)
		{
			ans=-1;
		}
		System.out.println(ans);
	}
}
	