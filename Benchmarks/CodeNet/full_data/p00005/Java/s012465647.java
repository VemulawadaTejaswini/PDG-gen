import java.util.*;

public class Main 
{
	static long gcd(long a, long b)
	{
		if(a % b == 0)
		{
			return(b);
		}
		else
		{
			return(gcd(b, a % b));
		}
	}
	
	static long lcm(long a, long b)
	{
		return(a * b / gcd(a, b));
	}
	
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			long a = stdIn.nextLong();
			long b = stdIn.nextLong();
			if(a < b)
			{
				long temp = a;
				a = b;
				b = temp;
			}
			System.out.println(gcd(a, b) + " " + lcm(a, b));
		}
	}
}