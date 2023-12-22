import java.util.Scanner;
import java.io.IOException;

class Main 
{
	public static void main(String[] args) throws IOException
	{
		int z, n = 3;
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt())
		{
			z = sc.nextInt();
			
			if(z == 0)
			{
				break;
			}

			System.out.println(calc(z, n));
		}
	}

	private static long calc(int z, int n)
	{
		long min = Long.MAX_VALUE, tmp;

		for(int x = 1; mypower(x, n) <= mypower(z, n); x++)
		{
			for(int y = x; mypower(x, n) + mypower(y, n) <= mypower(z, n); y++)
			{
				tmp = mypower(z, n) - mypower(x, n) - mypower(y, n);
				
				if(tmp < min)
				{
					min = tmp;
				}
			}
		}
		
		return min;
	}

	private static long mypower(int base, int exp)
	{
		long p = 1;

		for(int i = 0; i < exp; i++)
		{
			p *= base;
		}

		return p;
	}
}