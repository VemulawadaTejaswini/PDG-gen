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
			int score[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				score[i] = sc.nextInt();
			}
			Arrays.sort(score);
			int total = 0;
			for (int i = 1; i < n - 1; i++)
			{
				total += score[i];
			}
			System.out.println(total / (n - 2));
		}
	}
}