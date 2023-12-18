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
		long	x = Long.parseLong(va[0]);
		long	x2 = x * 2;
		long	y = Long.parseLong(va[1]);


		long	sumMax = 0;
		for (long i = x; i < x2; ++i)
		{
			long	sum = 0;

			while (i <= y)
			{
				sum += 1;
				i *= 2;
			}

			if (sum > sumMax)
			{
				sumMax = sum;
			}
		}

		System.out.println(sumMax);
	}
}