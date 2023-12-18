import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int q = scanner.nextInt();
		scanner.nextLine();
		String input = scanner.nextLine();
		int[][] ranges = new int[q][2];
		int i;
		for (i = 0; i < q; i++)
		{
			ranges[i][0] = scanner.nextInt();
			ranges[i][1] = scanner.nextInt();
		}
		int[] temp = new int[n];
		i = 1;
		while (i < n - 1)
		{
			if (input.charAt(i - 1) == 'A' && input.charAt(i) == 'C')
			{
				temp[i] = temp[i++ - 1] + 1;
			}
			temp[i] = temp[i++ - 1];
		}
		for (i = 0; i < q; i++)
		{
			System.out.println(temp[ranges[i][1] - 1] - temp[ranges[i][0] - 1]);
		}
	}
}
