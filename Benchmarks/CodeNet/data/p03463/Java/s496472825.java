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
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();


			int	diff = b - a;
			if (diff % 2 == 0)
			{
				System.out.println("Alice");
			}
			else
			{
				System.out.println("Borys");
			}
		}
	}

}
