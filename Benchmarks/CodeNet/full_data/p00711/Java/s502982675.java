import java.util.Scanner;

class Main
{
	private static StringBuffer map[];
	private static int count;
	static int[] dx = {0, 1, 0 ,-1};
	static int[] dy = {-1, 0, 1, 0};
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt(), m = sc.nextInt();
			if (n == 0 && m == 0) break;
			map = new StringBuffer[m];
			count = 0;
			int x = 0, y = 0;
			for (int i = 0; i < m; i++)
			{
				String str = sc.next();
				if (str.indexOf('@') != -1)
				{
					x = str.indexOf('@');
					y = i;
				}
				map[i] = new StringBuffer(str);
			}
			walk(x, y);
			System.out.println(count);
		}
	}
	private static void walk(int x, int y)
	{
		count++;
		map[y].setCharAt(x, '#');
		for (int i = 0; i < 4; i++)
		{
			try{
				if (map[y+dy[i]].charAt(x+dx[i]) == '.') walk(x+dx[i], y+dy[i]);
			}catch (IndexOutOfBoundsException e){}
		}
	}
}