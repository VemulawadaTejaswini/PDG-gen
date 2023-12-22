import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt();
			if (n == 0) break;
			int data[] = new int[7];
			for (int i = 0; i < n; i++)
			{
				int x = sc.nextInt();
				data[Math.min(x / 10, 6)]++;
			}
			for (int i = 0; i < 7; i++)
			{
				System.out.println(data[i]);
			}
		}
	}
}