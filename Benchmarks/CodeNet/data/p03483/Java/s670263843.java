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

		int[]	histgram = new int[26];
		for (char c : ca)
		{
			histgram[c - 'a'] += 1;
		}

		int	nOdd = 0;
		int	nEven = 0;
		for (int i = 0; i < histgram.length; ++i)
		{
			if (histgram[i] != 0)
			{
				if (histgram[i] % 2 == 0)
				{
					++nEven;
				}
				else
				{
					++nOdd;
				}
			}
		}

		if (ca.length % 2 == 1)
		{
			if (nOdd != 1)
			{
				System.out.println("-1");
				return;
			}
		}
		else
		{
			if (nOdd != 0)
			{
				System.out.println("-1");
				return;
			}
		}


		if (chackArray(ca))
		{
			System.out.println("1");
			return;
		}

		int	level = 1;
		while (true)
		{
			if (checkRec(ca, level, 0))
			{
				break;
			}
			++level;
		}

		System.out.println(level);

	}

	private static boolean chackArray(char[] ca)
	{
		for (int i = 0; i < ca.length / 2; ++i)
		{
			if (ca[i] != ca[ca.length - i - 1])
			{
				return	false;
			}
		}
		return true;
	}

	public static boolean	checkRec(char[] caOrg, int maxLevel, int level)
	{
		char[]	ca = new char[caOrg.length];
		System.arraycopy(caOrg, 0, ca, 0, ca.length);

		for (int i = 0; i < ca.length - 1; ++i)
		{
			swap(ca, i);
			if (chackArray(ca))
			{
				return	true;
			}
			if (level == maxLevel)
			{
				return false;
			}
			if (checkRec(ca, maxLevel, level + 1))
			{
				return	true;
			}
			swap(ca, i);
		}
		return	false;
	}

	private static void swap(char[] ca, int i)
	{
		char	c = ca[i];
		ca[i] = ca[i + 1];
		ca[i + 1] = c;
	}
}