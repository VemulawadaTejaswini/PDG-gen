import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

import java.io.*;

public class Main
{

	int[][] visited;
	int[][] ma;
	int h, w;
	int dx[] = {0, 1, 1, 1, 0, -1, -1, -1};
	int dy[] = {-1, -1, 0, 1, 1, 1, 0, -1};

	public int rec(int y, int x)
	{
		if(y < 0 || y >= h || x < 0 ||x >= w || visited[y][x] != 0 || ma[y][x] == 0)
		{
			return 0;
		}
		visited[y][x] = 1;
		int re = 1;
		for (int i = 0; i < 8; i++)
		{
			re += rec(y + dy[i], x + dx[i]);
		}
		return re;
	}

	public void solve()
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0)
			{
				break;
			}
			ma = new int[52][52];
			visited = new int[52][52];
			for (int i = 0; i < h; i++)
			{
				for (int j = 0; j < w; j++)
				{
					ma[i][j] = sc.nextInt();
				}
			}
			int ans = 0;
			for (int i = 0; i < h; i++)
			{
				for (int j = 0; j < w; j++)
				{
					if(visited[i][j] == 0 && rec(i, j) != 0)
					{
						++ans;
					}
				}
			}
			System.out.println(ans);
		}
		
		sc.close();
	}

	public static void main(String[] args)
	{
		Main obj = new Main();
		obj.solve();
	}
}
