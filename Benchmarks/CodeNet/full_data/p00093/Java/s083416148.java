import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0) break;
			boolean flg = false;
			for (; a <= b; a++)
			{
				if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
				{
					System.out.println(a);
					flg = true;
				}
			}
			if (!flg)System.out.println("NA");
		}
	}
}