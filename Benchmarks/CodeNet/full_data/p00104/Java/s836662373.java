import java.util.Scanner;

class Main
{
	static final int dx[] = {  0,  1,  0, -1};
	static final int dy[] = { -1,  0,  1,  0};

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		LOOP1: while(true)
		{
			int h = sc.nextInt();
			int w = sc.nextInt();
			
			if (h == 0 && w == 0) break;
			
			sc.nextLine();
			String map[] = new String[h];
			for (int i = 0; i < h; i++)
			{
				map[i] = sc.nextLine();
			}
			boolean visited[][] = new boolean[w][h];
			
			int x = 0;
			int y = 0;
			
			while (map[y].charAt(x) != '.')
			{
				visited[x][y] = true;
				int d = charToDirect(map[y].charAt(x));
				x += dx[d];
				y += dy[d];
				if (visited[x][y])
				{
					System.out.println("LOOP");
					break LOOP1;
				}
			}
			System.out.println(Integer.toString(x) + " " + Integer.toString(y));
		}
	}
	private static int charToDirect(char c)
	{
		switch (c)
		{
		case '^':
			return 0;
		case '>':
			return 1;
		case 'v':
			return 2;
		case '<':
			return 3;
		}
		return -1;
	}
}