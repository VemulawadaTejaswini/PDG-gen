import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main
{
	public static void main(String[] args) throws Exception
	{
		invoke(System.in);
	}
	public final static int	N = 100000;

	public static void	invoke(InputStream is) throws IOException
	{
		// input
		BufferedReader	reader = new BufferedReader(new InputStreamReader(is));
		String	line = reader.readLine();

		boolean[]	isPrime = new boolean[N];

		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		int	sqrtN = (int)(Math.sqrt(N));
		for (int i = 2; i <= sqrtN; ++i)
		{
			if (isPrime[i])
			{
				for (int mul = i + i; mul < N; mul += i)
				{
					isPrime[mul] = false;
				}
			}
		}

		int[]	is2017 = new int[N];
		int	sum2017 = 0;

		for (int i = 3; i < N; i += 2)
		{
			if (isPrime[i] && isPrime[(i + 1) / 2])
			{
				++sum2017;
			}
			is2017[i] = sum2017;
		}


		int	q = Integer.parseInt(line);
		for (int i = 0 ; i < q; ++i)
		{
			line = reader.readLine();
			String[]	va = line.split(" ");
			int l = Integer.parseInt(va[0]) - 2;
			int r = Integer.parseInt(va[1]);

			if (l < 0)
			{
				l = 0;
			}
			System.out.println(is2017[r] - is2017[l]);
		}
	}

}