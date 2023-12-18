import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		String[] input = new String[h];
		int[][] mineCnt = new int[h][w];

		for (int i = 0; i < h; i++)
		{
			input[i] = scanner.next();
		}

		for (int i = 0; i < h; i++)
		{
			for (int j = 0; j < w; j++)
			{
				if (input[i].charAt(j) == '#')
				{
					if ((i > 0) && (j > 0))		mineCnt[i-1][j-1]++;
					if (i > 0)					mineCnt[i-1][j]++;
					if ((i > 0) && (j < w-1))	mineCnt[i-1][j+1]++;
					if (j > 0)					mineCnt[i][j-1]++;
					if (j < w-1)				mineCnt[i][j+1]++;
					if ((i < h-1) && (j > 0))	mineCnt[i+1][j-1]++;
					if (i < h-1)				mineCnt[i+1][j]++;
					if ((i < h-1) && (j < w-1))	mineCnt[i+1][j+1]++;
				}
			}
		}

		for (int i = 0; i < h; i++)
		{
			for (int j = 0; j < w; j++)
			{
				if (input[i].charAt(j) == '#')
				{
					System.out.print('#');
				}
				else
				{
					System.out.print(mineCnt[i][j]);
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}