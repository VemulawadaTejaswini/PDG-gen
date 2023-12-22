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
			int p = 0;
			int d = 0;
			for (int i = 0; i < x.length; i++)
			{
				if (x[i] == 'P')
				{
					p++;
				} else if (x[i] == 'D')
				{
					d++;
				} else
				{
					if (d < p)
					{
						x[i] = 'D';
						d++;
					} else
					{
						x[i] = 'P';
						p++;
					}
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