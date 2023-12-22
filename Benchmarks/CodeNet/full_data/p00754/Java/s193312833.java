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
		int previousFlag = 0; // 1つ外側のflag
		for (int i = 0; i < str.length(); i++)
		{
			switch (str.charAt(i))
			{
				case '(':
					nestParentheses++;
					previousFlag = flag;
					flag = 1;
					break;
				case '[':
					nestBracket++;
					previousFlag = flag;
					flag = 2;
					break;
				case ')':
					if (flag == 1)
					{
						nestParentheses--;
						flag = previousFlag;
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
						flag = previousFlag;
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
