import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt(),
				m = sc.nextInt();
			if (n == 0 && m == 0) break;
			int ans[] = new int[m];
			for (int i = 0; i < n; i++)
			{
				{
				for (int j = 0; j < m; j++)
					ans[j] += sc.nextInt();
				}
			}
			boolean first = true;
			for (int i = n; i >= 0; i--)
			{
				for (int j = 0; j < m; j++)
				{
					if (ans[j] == i)
					{
						if (first) first = false;
						else System.out.print(" ");
						System.out.print(j+1);
					}
				}
			}
			System.out.println();
		}
	}
}