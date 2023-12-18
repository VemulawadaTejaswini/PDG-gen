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
		for (int i = 0; i < q; i++)
		{
			ranges[i][0] = scanner.nextInt();
			ranges[i][1] = scanner.nextInt();
		}
		int[] temp = new int[n];
		int t = 0, i = 0;
		while (i < n)
		{
			temp[i] = t;
			if (input.charAt(i) == 'A' && input.charAt(i + 1) == 'C')
			{
				t++;
				i++;
				temp[i] = t;
			}
			i++;
		}
		for (int[] range : ranges)
		{
			System.out.println(temp[range[1] - 1] - temp[range[0] - 1]);
		}
	}
}
