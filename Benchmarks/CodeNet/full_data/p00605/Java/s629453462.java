import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			if (n == 0 && k == 0) break;
			int s[] = new int[k];
			for (int i = 0; i < k; i++)
			{
				s[i] = sc.nextInt();
			}
			boolean result = true;
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < k; j++)
				{
					s[j] -= sc.nextInt();
					if (s[j] < 0)
					{
						result = false;
					}
				}
			}
			if (result)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}
}