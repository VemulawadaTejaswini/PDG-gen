import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt();
			if (n == -1) break;
			int order = 0;
			for (; Math.pow(4, order) <= n; order++)
				;
			order--;
			while (n > 3)
			{
				int x = (int) (n / Math.pow(4, order));
				System.out.print(x);
				n = (int) (n % Math.pow(4, order));
				order--;
			}
			System.out.println(n);
		}
	}
}