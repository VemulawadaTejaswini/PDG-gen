import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			try
			{
				long a = sc.nextInt();
				long b = sc.nextInt();
				
				long n = a;
				long m = b;
				while (true)
				{
					long k = m % n;
					if (k == 0) break;
					m = n;
					n = k;
				}
				System.out.print(Long.toString(n) + " ");
				System.out.println(Long.toString(a * b / n));
			}
			catch (Exception e)
			{
				break;
			}
		}
	}
}