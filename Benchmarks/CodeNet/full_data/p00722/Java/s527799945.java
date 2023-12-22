import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		boolean not[] = new boolean[1000000];
		
		not[0] = true;
		not[1] = true;
		
		for (int i = 2; i * i < 1000000; i++)
		{
			if (not[i]) continue;
			for (int x = (i << 1); x < 1000000; x += i)
			{
				if (not[x]) continue;
				not[x] = true;
			}
		}
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			int a = sc.nextInt(),
				d = sc.nextInt(),
				n = sc.nextInt();
			if (a == 0 && d == 0 && n == 0)
			{
				break;
			}
			int m, count = 0;
			while (true)
			{
				if (!not[a])
				{
					count++;
					if (count == n)
					{
						break;
					}
				}
				a += d;
			}
			System.out.println(a);
		}
	}
}