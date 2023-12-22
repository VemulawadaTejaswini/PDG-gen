import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			int m = sc.nextInt();
			int n = sc.nextInt();
			if (n == 0 && m == 0)
				break;
			int x = 1;
			int y = 1;
			int dx[] = { 0, 1, 0,-1};
			int dy[] = { 1, 0,-1, 0};
			int d = 0;
			while (true)
			{
				String str = sc.next();
				if (str.equals("STOP"))
				{
					System.out.printf("%d %d\n", x, y);
					break;
				}
				else if (str.equals("FORWARD"))
				{
					int k = sc.nextInt();
					for (int i = 0; i < k; i++)
					{
						if (x + dx[d] < 1 || m < x + dx[d])
							break;
						x += dx[d];
					}
					for (int i = 0; i < k; i++)
					{
						if (y + dy[d] < 1 || n < y + dy[d])
							break;
						y += dy[d];
					}
				}
				else if (str.equals("BACKWARD"))
				{
					int k = sc.nextInt();
					for (int i = 0; i < k; i++)
					{
						if (x - dx[d] < 1 || m < x - dx[d])
							break;
						x -= dx[d];
					}
					for (int i = 0; i < k; i++)
					{
						if (y - dy[d] < 1 || n < y - dy[d])
							break;
						y -= dy[d];
					}
				}
				else if (str.equals("RIGHT"))
				{
					d++;
					if (d == 4) d = 0;
				}
				else if (str.equals("LEFT"))
				{
					d--;
					if (d == -1) d = 3;
				}
			}
		}
	}
}