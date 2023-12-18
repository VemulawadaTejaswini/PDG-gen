import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

class Main
{
	public static void main(String[] args) throws Exception
	{
		invoke(System.in);
	}

	public static void	invoke(InputStream is) throws IOException
	{
		try (Scanner in = new Scanner(is))
		{
			int	n = in.nextInt();
			int	y = in.nextInt();

			for (int a = n; a >= 0; --a)
			{
				for (int b = n - a; b >= 0; --b)
				{
					int c = n - a - b;
					int	total = (10000 * a + 5000 * b + 1000 * c);
					if (total == y)
					{
						System.out.println(a + " " + b + " " + c);
						return;
					}
				}
			}
			System.out.println("-1 -1 -1");
		}
	}
}