import java.util.Scanner;

public class Main
{
	private static final int[] D = { 1, 0, -1, 0 };
	
	private static int W, H;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			W = sc.nextInt();
			H = sc.nextInt();
			if (W==0 && H==0) break;
			
			boolean[][] red = new boolean[W][H];
			int sx = -1, sy = -1;
			for (int y = 0; y < H; y++)
			{
				String line = sc.next();
				for (int x = 0; x < W; x++)
				{
					char c = line.charAt(x);
					switch (c)
					{
					case '#':
						red[x][y] = true;
						break;
					case '@':
						sx = x;
						sy = y;
						break;
					}
				}
			}
			System.out.println(dfs(red, sx, sy));
		}
	}
	
	private static boolean valid(int x, int y)
	{
		return 0 <= x && x < W && 0 <= y && y < H;
	}
	
	private static int dfs(boolean[][] red, int sx, int sy)
	{
		red[sx][sy] = true;
		
		int count = 1;
		for (int i = 0; i < 4; i++)
		{
			int x = sx + D[i];
			int y = sy + D[(i + 1) % 4];
			if (valid(x, y) && !red[x][y])
			{
				count += dfs(red, x, y);
			}
		}
		return count;
	}
}