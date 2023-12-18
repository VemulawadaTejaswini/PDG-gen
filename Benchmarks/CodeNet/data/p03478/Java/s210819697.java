import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class Main
{
	public static void main(String[] args) throws Exception
	{
		invoke(System.in);
//		invoke(new FileInputStream("/tmp/test.txt"));
	}

	public static void	invoke(InputStream is) throws IOException
	{
		// input
		BufferedReader	reader = new BufferedReader(new InputStreamReader(is));
		String	line = reader.readLine();

		String[]	va = line.split(" ");
		int	n = Integer.parseInt(va[0]);
		int a = Integer.parseInt(va[1]);
		int b = Integer.parseInt(va[2]);

		int	resultSum = 0;
		for (int x = 1; x <= n; ++x)
		{
			int y = x;
			int	sum = 0;
			while (y > 0)
			{
				sum += y % 10;
				y /= 10;
			}

			if (a <= sum && sum <= b)
			{
				resultSum += x;
			}
		}

		System.out.println(resultSum);
	}


}