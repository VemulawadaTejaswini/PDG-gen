import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++)
		{
			int clime = 0, down = 0;
			int pre = -1;
			int n = sc.nextInt();
			for (int j = 0; j < n; j++)
			{
				if (pre == -1)
				{
					pre = sc.nextInt();
				}
				else
				{
					int now = sc.nextInt();
					clime = Math.max(clime, now - pre);
					down = Math.min(down, now - pre);
					pre = now;
				}
			}
			System.out.printf("%d %d\n", clime, -down);
		}
	}
}