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
		char[]	ca = line.toCharArray();
		boolean[]	ba = new boolean[ca.length];

		for (int i = 0; i < ba.length; ++i)
		{
			ba[i] = (ca[i] == '1');
		}

		boolean	isAllSame = true;
		for (int i = 1; i < ba.length; ++i)
		{
			if (ba[i] != ba[0])
			{
				isAllSame = false;
			}
		}
		if (isAllSame)
		{
			System.out.println(ca.length);
			return;
		}

		int	k;
		for (k = ca.length - 1; k > 0; --k)
		{
			if (checkR(ba, k, 0))
			{
				break;
			}
		}

		System.out.println(k);
	}

	public static boolean	checkR(boolean[] caPrev, int k, int pos)
	{
		if (checkArray(caPrev, k))
		{
			return	true;
		}

		boolean[]	ca = new boolean[caPrev.length];
		System.arraycopy(caPrev, 0, ca, 0, caPrev.length);

		// flip
		for (int i = 0; i < k; ++i)
		{
			ca[pos + i] = !ca[pos + i];
		}

		for (int i = pos + 1; i + k <= caPrev.length; ++i)
		{
			if (checkR(ca, k, i))
			{
				return	true;
			}
		}
		return	false;
	}


	private static boolean checkArray(boolean[] ca, int k)
	{
		boolean	c = ca[0];
		int	len = 1;
		int	nFlip = 0;
		int	twoFlipLen = 0;

		for (int i = 1; i < ca.length; ++i)
		{
			if (ca[i] != c)
			{
				// check
				if (nFlip == 0 && len < k)
				{
					twoFlipLen = len;	// ok
				}
				else if (len % k != 0)
				{
					return	false;
				}
				nFlip += 1;

				// ok
				c = ca[i];
				len = 1;
			}
			else
			{
				len += 1;
			}
		}

		if (nFlip == 1)
		{
			return (twoFlipLen % k == 0 || (ca.length - twoFlipLen) % k == 0);
		}
		return true;
	}
}