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
			ans=ans*a;
			long q=ans-(long)1e18;
			if(ans<0||q>0)
			{
				flag=1;
			}
			if(ans==0)
			{
				flag=-1;
			}
		}
		if(flag==1)
		{
			ans=-1;
		}
		System.out.println(ans);
	}
}
	