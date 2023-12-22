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
			int friends[] = new int[n];
			friends[0] = 0;
			for (int i = 0; i < m; i++)
			{
				int ai = sc.nextInt()-1,
					bi = sc.nextInt()-1;
				if (ai == 0)
				{
					friends[bi] = 1;
				}
				else if (friends[ai] == 1)
				{
					friends[bi] = 2;
				}
			}
			int total = 0;
			for (int i = 0; i < n; i++)
			{
				if (friends[i] != 0)total++;
			}
			System.out.println(total);
		}
	}
}