import java.util.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws Exception
	{
		// your code goes here
		BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bu.readLine());
		int i,j,k;long sum=0;
		for(i=1;i<=n;i++)
		for(j=1;j<=n;j++)
		{
			int g=gcd(i,j);
			for(k=1;k<=n;k++)
			sum=sum+gcd(g,k);
		}
		System.out.print(sum);
	}
	
	static int gcd(int a,int b)
	{
		if(a<b) a=a^b^(b=a);
		while(b!=0)
		{
			int t=b;
			b=a%b;
			a=t;
		}
		return a;
	}
}