import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class Main
{
	public static void main(String[] args) throws Exception
	{
		invoke(System.in);
	}
	public static void	invoke(InputStream is) throws IOException
	{
		// input
		BufferedReader	reader = new BufferedReader(new InputStreamReader(is));
		String	line = reader.readLine();

		boolean[]	isPrime = new boolean[100001];	// 3 > 1, 5 > 2, ...
		boolean[]	is2007 = new boolean[100001];	// 3 > 1, 5 > 2, ...

		isPrime[2] = true;
		int	maxN = 3;


		int	q = Integer.parseInt(line);
		for (int i = 0 ; i < q; ++i)
		{
			line = reader.readLine();
			String[]	va = line.split(" ");
			int l = Integer.parseInt(va[0]);
			int r = Integer.parseInt(va[1]);

			while (maxN <= r)
			{
				int	idx = maxN;

				isPrime[idx] = isPrime(maxN, isPrime);
				if (isPrime[idx])
				{
					int	nextN = (maxN + 1) / 2;
					if (isPrime[nextN] )
					{
						is2007[idx] = true;
					}
				}

				maxN += 2;
			}

			int	result = 0;
			for (int j = l; j <= r; j += 2)
			{
				if (is2007[j])
				{
					++result;
				}
			}
			System.out.println(result);
		}
	}

	private static boolean isPrime(int n, boolean[]	isPrime)
	{
//		if (n % 2 == 0)
//		{
//			return	false;
//		}

		int	max = (int)(Math.sqrt(n));
		for (int i = 3; i <= max; i += 2)
		{
			if (isPrime[i] && n % i == 0)
			{
				return	false;
			}
		}
		return	true;
	}
}