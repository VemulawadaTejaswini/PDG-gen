import java.util.Scanner;

class Main
{
	private static int mesh[][];
	private static int dx[] = {0, 0,1,-1};
	private static int dy[] = {1,-1,0, 0};
	private static int w, h;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			w = 12;
			h = 12;
			if (w == 0 && h == 0) break;
			mesh = new int [h][w];
			for (int i = 0; i < h; i++)
			{
				String str = sc.next();
				for (int j = 0; j < w; j++)
				{
					mesh[i][j] = str.charAt(j) - '0';
				}
			}
			System.out.println(countIlands(0));
		}
	}
	private static int countIlands(int n)
	{
		int x = -1;
		int y = -1;
		for (int i = 0; i < h; i++)
		{
			for (int j = 0; j < w; j++)
			{
				if (mesh[i][j] == 1)
				{
						x = i;
						y = j;
				}
			}
		}
		if (x == -1) return n;
		check(x, y);
		return countIlands(++n);
	}
	private static void check(int x, int y)
	{
		try
		{
			if (mesh[x][y] == 1)
			{
				mesh[x][y] = 0;
				for(int i = 0; i < 4; i++){
					check(x+dx[i], y+dy[i]);
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			return;
		}
	}
}