import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);		
		long a=in.nextLong();
		long b=in.nextLong();
		long q=gcd(a,b);
		int ans=1;
		long temp=q;
		for(long i=2;i*i<=q;i++)
		{
			if(temp%i==0)
			{
				ans++;
				while(temp%i==0)
				{
					temp=temp/i;
				}
			}
			if(temp==1)
				break;
		}
		if(temp!=1)
		{
			ans++;
		}
		System.out.println(ans);
	}
	public static long gcd (long a,long b)
	{
		if(a%b==0)
			return b;
		return gcd(b,a%b);
	}
}
	