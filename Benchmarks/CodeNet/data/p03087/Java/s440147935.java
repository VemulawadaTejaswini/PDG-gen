import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		int n, q, i;
		String input;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		q = scanner.nextInt();
		scanner.nextLine();
		input = scanner.nextLine();
		int[][] ranges = new int[q][2];
		for (i = 0; i < q; i++)
		{
			ranges[i][0] = scanner.nextInt();
			ranges[i][1] = scanner.nextInt();
		}
		int[] temp = new int[n];
		i = 1;
		while (i < n)
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
