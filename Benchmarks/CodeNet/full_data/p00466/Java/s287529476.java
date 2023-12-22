import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int total = sc.nextInt();
			if (total == 0)break;
			for (int i = 0; i < 9; i++)
			{
				total -= sc.nextInt();
			}
			System.out.println(total);
		}
	}
}