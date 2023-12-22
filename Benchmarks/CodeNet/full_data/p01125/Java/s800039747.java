import java.util.Scanner;

public class Main
{
	private static final int[] D = { 1, 0, -1, 0 };
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for (;;)
		{
			int N = sc.nextInt();
			if (N==0)break;
			
			boolean[][] map = new boolean[21][21];
			for (int i = 0; i < N; i++)
			{
				map[sc.nextInt()][sc.nextInt()] = true;
			}
			
			int M = sc.nextInt(), x = 10, y = 10;
			for (int i = 0; i < M; i++)
			{
				int j = "ESWN".indexOf(sc.next().charAt(0));
				int d = sc.nextInt();
				for (int k = 0; k < d; k++)
				{
					x += D[j];
					y += D[(j+1)%4];
					if (map[x][y])
					{
						N--;
						map[x][y] = false;
					}
				}
			}
			System.out.println(N == 0 ? "YES" : "NO");
		}
	}
}