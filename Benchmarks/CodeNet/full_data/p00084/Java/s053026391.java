import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[ .,]+");
		boolean first = true;
		while (sc.hasNext())
		{
			String str = sc.next();
			if (2 < str.length() && str.length() < 7)
			{
				if (first)
				{
					first = false;
				}
				else
				{
					System.out.print(" ");
				}
				System.out.print(str);
			}
		}
		System.out.println();
	}
}