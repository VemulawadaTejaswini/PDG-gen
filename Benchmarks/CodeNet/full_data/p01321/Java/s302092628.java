import java.util.Scanner;
import java.util.Arrays;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt();
			if (n == 0) break;
			int points[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < 5; j++)
				{
					points[i] += sc.nextInt();
				}
			}
			Arrays.sort(points);
			System.out.printf("%d %d\n", points[n-1], points[0]);
		}
	}
}