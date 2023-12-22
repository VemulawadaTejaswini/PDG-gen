import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			String a = sc.next();
			char x[] = a.toCharArray();

			for (int i = 0; i < x.length; i++)
			{
				if (x[i] == 'P')
				{
					break;
				} else if (x[i] == '?')
				{
					x[i] = 'p';
				}
			}
			for (int i = x.length - 1; i >= 0; i--)
			{
				if (x[i] == 'D')
				{
					break;
				} else if (x[i] == '?')
				{
					x[i] = 'D';
				}
			}
			for (int i = 0; i < x.length; i++)
			{
				if (x[i]=='?')
				{
					x[i]='P';
				}
			}

			for (int i = 0; i < x.length; i++)
			{
				System.out.print(x[i]);
			}
			System.out.println();
		}
	}
}