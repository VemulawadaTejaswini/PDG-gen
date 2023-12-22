import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			// data input
			String str = sc.next();
			if (str.equals("-"))
			{
				break;
			}
			int m = sc.nextInt();
			int[] shuffle = new int[m];
			for (int i = 0; i < m; i++)
			{
				shuffle[i] = sc.nextInt();
			}

			// shuffle
			String after = str;
			String before;
			for (int i = 0; i < m; i++)
			{
				before = after;
				after = before.substring(shuffle[i]) + before.substring(0, shuffle[i]);
			}

			System.out.println(after);
		}
	}
}
