import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		boolean first = true;
		while (true)
		{
			int n = sc.nextInt();
			if (n == 0) break;
			if (first) first = false;
			{
				System.out.println();
			}
			String team[] = new String[n];
			int point[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				team[i] = sc.next();
				point[i] = sc.nextInt() * 3 + sc.nextInt() * 0 + sc.nextInt();
			}
			for (int i = n * 3; i >= 0; i--)
			{
				for (int j = 0; j < n; j++)
				{
					if (i == point[j])
					{
						System.out.printf("%s,%d\n", team[j], i);
					}
				}
			}
		}
	}
}