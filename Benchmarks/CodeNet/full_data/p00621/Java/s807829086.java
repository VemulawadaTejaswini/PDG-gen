import java.util.Scanner;

class Main
{
	private static int wall[];
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int w = sc.nextInt(),
				q = sc.nextInt();
			if (w == 0 && q == 0) break;
			wall = new int[w];
			for (int i = 0; i < w; i++) wall[i] = -1;
			for (int i = 0; i < q; i++)
			{
				char a = sc.next().charAt(0);
				if (a == 's')
				{
					int id = sc.nextInt(),
						width = sc.nextInt();
					int b = -1;
					for (int j = 0; j + width - 1 < w; j++)
					{
						if (check(j, width))
						{
							b = j;
							break;
						}
					}
					if (b == -1)
					{
						System.out.println("impossible");
					}
					else
					{
						System.out.println(b);
						for (int j = b; j < b + width; j++)
						{
							wall[j] = id;
						}
					}
				}
				else if (a == 'w')
				{
					int id = sc.nextInt();
					for (int j = 0; j < w; j++)
					{
						if (wall[j] == id)
							wall[j] = -1;
					}
				}
			}
			System.out.println("END");
		}
	}
	private static boolean check(int begin, int length)
	{
		for (int i = begin; i < begin + length; i++)
		{
			if (wall[i] != -1) return false;
		}
		return true;
	}
}