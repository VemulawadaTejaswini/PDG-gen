import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int a = sc.nextInt(),
				b = sc.nextInt();
			if (a == 0 && b == 0) break;
			int x = Math.max(a, b),
				y = Math.min(a, b),
				z = x % y;
			int count = 1;
			while (z != 0)
			{
				x = y;
				y = z;
				z = x % y;
				count++;
			}
			System.out.printf("%d %d\n", y, count);
		}
	}
}