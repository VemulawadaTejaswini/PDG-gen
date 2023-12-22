import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			int y = sc.nextInt();
			int m = sc.nextInt();
			int d = sc.nextInt();
			if (y == 1868)
			{
				if (m == 9)
				{
					if (d < 8)
					{
						System.out.println("pre-meiji");
					}
					else
					{
						System.out.printf("meiji %d %d %d\n", y - 1868 + 1, m, d);
					}
				}
				else if (m < 9)
				{
					System.out.println("pre-meiji");
				}
				else if (9 < m)
				{
					System.out.printf("meiji %d %d %d\n", y - 1868 + 1, m, d);
				}
			}
			else if (y < 1868)
			{
				System.out.println("pre-meiji");
			}
			else if (1868 < y && y < 1912)
			{
				System.out.printf("meiji %d %d %d\n", y - 1868 + 1, m, d);
			}
			else if (y == 1912)
			{
				if (m == 7)
				{
					if (d < 30)
					{
						System.out.printf("meiji %d %d %d\n", y - 1868 + 1, m, d);
					}
					else
					{
						System.out.printf("taisho %d %d %d\n", y - 1912 + 1, m, d);
					}
				}
				else if (m < 7)
				{
					System.out.printf("meiji %d %d %d\n", y - 1868 + 1, m, d);
				}
				else if (7 < m)
				{
					System.out.printf("taisho %d %d %d\n", y - 1912 + 1, m, d);
				}
			}
			else if (1912 < y && y < 1926)
			{
				System.out.printf("taisho %d %d %d\n", y - 1912 + 1, m, d);
			}
			else if (y == 1926)
			{
				if (m == 12)
				{
					if (m < 25)
					{
						System.out.printf("taisho %d %d %d\n", y - 1912 + 1, m, d);
					}
					else
					{
						System.out.printf("showa %d %d %d\n", y - 1926 + 1, m, d);
					}
				}
				else if (m < 12)
				{
					System.out.printf("taisho %d %d %d\n", y - 1912 + 1, m, d);
				}
				else if (12 < m)
				{
					System.out.printf("showa %d %d %d\n", y - 1926 + 1, m, d);
				}
			}
			else if (1926 < y && y < 1989)
			{
				System.out.printf("showa %d %d %d\n", y - 1926 + 1, m, d);
			}
			else if (y == 1989)				
			{
				if (m == 1)
				{
					if (d < 8)
					{
						System.out.printf("showa %d %d %d\n", y - 1926 + 1, m, d);
					}
					else
					{
						System.out.printf("heisei %d %d %d\n", y - 1989 + 1, m, d);
					}
				}
				else
				{
					System.out.printf("heisei %d %d %d\n", y - 1989 + 1, m, d);
				}
			}
			else
			{
				System.out.printf("heisei %d %d %d\n", y - 1989 + 1, m, d);
			}
		}
	}
}