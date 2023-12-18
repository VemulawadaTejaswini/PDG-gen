import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long ans=f(n);
		
		String s=String.valueOf(ans);
		char[] c=s.toCharArray();
		
		int count=0;
		int i=c.length-1;
		while(c[i]=='0')
		{
			count++;
			i--;
		}
		
		System.out.println(count);
		
		sc.close();
	}
	
	public static long f(long n)
	{
		if(n<2)
		{
			return 1;
		}
		else
		{
			return n*f(n-2);
		}
	}
}