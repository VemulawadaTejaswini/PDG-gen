import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int [] prime=new int [1000000];
		for(int i=2;i<1000000;i++)
		{
			if(prime[i]==0)
			{
				for(int j=2;i*j<1000000;j++)
				{
					prime[i*j]=1;
				}
			}
		}
				
		long a=in.nextLong();
		long b=in.nextLong();
		long q=gcd(a,b);
		int ans=1;
		long temp=q;
		if(q>1000000)
			q=1000000;
		for(int i=2;i*i<=q;i++)
		{
			if(temp%i==0&&prime[i]==0)
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
	