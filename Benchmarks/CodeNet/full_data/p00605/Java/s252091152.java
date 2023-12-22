import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt(),
				k = sc.nextInt();
			if (n == 0 && k == 0) break;
			int s[] = new int[k];
			for (int i = 0; i < k; i++)
			{
				s[i] = sc.nextInt();
			}
			boolean result = true;
			for (int i = 0; i < n; i++)
			{
				if (result)
					for (int j = 0; j < k; j++)
					{
						s[j] -= sc.nextInt();
						if (s[j] < 0) result = false;
					}
				else
					sc.nextLine();
			}
			if (result)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}