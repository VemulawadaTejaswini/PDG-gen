import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			long n = sc.nextLong();
			if (n == 0) break;
			long total = 0;
			for (int i = 1; total < n && i * 2 <= n; i++)
				if (n % i == 0) total += i;
			if (total < n)
				System.out.println("deficient number");
			else if (total > n)
				System.out.println("abundant number");
			else
				System.out.println("perfect number");
		}
	}
}