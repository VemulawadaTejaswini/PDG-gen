import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int change = 1000 - sc.nextInt(),
				count = 0;
			if (change == 1000) break;
			while (change > 0)
			{
				if (change >= 500)		change -= 500;
				else if (change >= 100)	change -= 100;
				else if (change >= 50)	change -= 50;
				else if (change >= 10)	change -= 10;
				else if (change >= 5)	change -= 5;
				else if (change >= 1)	change -= 1;
				count++;
			}
			System.out.println(count);
		}
	}
}