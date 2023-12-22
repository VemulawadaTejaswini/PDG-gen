import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		for(; scanner.hasNext(); )
		{
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			if(a < b)
			{
				long buf = a;
				a = b;
				b = buf;
			}
			
			System.out.println(getGCD(a, b)+" "+getLCM(a, b));
		}
	}
	
	private static long getGCD(long a, long b)
	{
		for(;;)
		{
			if(a > b)
			{
				a = a % b;
				if(a == 0)
					return b;
			}
			else
			{
				b = b % a;
				if(b == 0) 
					return a;
			}
		}
	}
	
	private static long getLCM(long a, long b)
	{
		for(long n=b; ; n+=b)
		{
			if(n%a==0 && n%b==0)
			{
				return n;
			}
		}
	}
}