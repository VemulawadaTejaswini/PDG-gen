import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String line;
		String sentence;
		StringBuilder buf = new StringBuilder();
		while (true)
		{
			line = sc.nextLine();
			if (line.equals("."))
			{
				break;
			}

			buf.append(line);
			if (buf.toString().endsWith("."))
			{
				sentence = buf.toString();

				if (isBalanced(sentence))
				{
					System.out.println("yes");
				}
				else
				{
					System.out.println("no");
				}
			}
		}
	}

	static boolean isBalanced(String str)
	{
		int nestParentheses = 0, nestBracket = 0;
		int flag = 0; // 1:'('の中 2:'['の中
		int[] previousFlags = new int[1000]; // 外側のflag
		for (int p :
				previousFlags)
		{
			p = 0;
		}

		for (int i = 0; i < str.length(); i++)
		{
			switch (str.charAt(i))
			{
				case '(':
					previousFlags[nestParentheses + nestBracket] = flag;
					nestParentheses++;
					flag = 1;
					break;
				case '[':
					previousFlags[nestParentheses + nestBracket] = flag;
					nestBracket++;
					flag = 2;
					break;
				case ')':
					if (flag == 1)
					{
						nestParentheses--;
						flag = previousFlags[nestParentheses + nestBracket];
					}
					else
					{
						return false;
					}
					break;
				case ']':
					if (flag == 2)
					{
						nestBracket--;
						flag = previousFlags[nestParentheses + nestBracket];
					}
					else
					{
						return false;
					}
					break;
			}
		}

		return (nestParentheses == 0 && nestBracket == 0);
	}
}
