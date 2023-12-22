import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		boolean not[] = new boolean[100000];
		not[0] = true;
		not[1] = true;
		for (int i = 2; i * i < 100000; i++)
		{
			if (not[i]) continue;
			for (int x = (i << 1); x < 100000; x += i)
			{
				if (not[x]) continue;
				not[x] = true;
			}
		}
		Scanner sc = new Scanner(System.in);
		int n;
		while ((n = sc.nextInt()) != 0)
		{
			if (n != 5 && !not[n])
			{
				System.out.println(0);
				continue;
			}
			int count = 0;
			for (int i = 2; i < n; i++)
			{
				for (int j = i; j < n; j++)
				{
					if (!not[i] && !not[j] && i + j == n)
					{
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}