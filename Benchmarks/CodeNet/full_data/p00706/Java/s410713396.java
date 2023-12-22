import java.util.Scanner;
import java.io.IOException;

class Main 
{
	private static int[][] field;
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);	
		int N, W, H, S, T, x, y;

		while(true)
		{
			N = sc.nextInt();	

			if(N == 0)
			{
				break;
			}

			W = sc.nextInt();
			H = sc.nextInt();

			field = new int[H][W];

			for(int i = 0; i < field.length; i++)
			{
				for(int j = 0; j < field[i].length; j++)
				{
					field[i][j] = 0;
				}
			}

			for(int i = 0; i < N; i++)
			{
				x = sc.nextInt();
				y = sc.nextInt();

				field[y - 1][x - 1] = 1;
			}

			S = sc.nextInt();
			T = sc.nextInt();

			System.out.println(search(S, T));
		}
	}

	private static int search(int S, int T)
	{
		int max = 0, cnt = 0;

		for(int si = 0; si < field.length - T + 1; si++)
		{
			for(int sj = 0; sj < field[si].length - S + 1; sj++)
			{
				cnt = 0;

				for(int i = 0; i < T; i++)
				{
					for(int j = 0; j < S; j++)
					{
						if(field[si + i][sj + j] == 1)
						{
							cnt++;
						}
					}
				}

				max = max < cnt ? cnt : max;
			}
		}

		return max;
	}
}