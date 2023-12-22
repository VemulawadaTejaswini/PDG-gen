import java.util.*;

class P
{
	int x;
	int y;
	P(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
public class Main 
{
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int W = stdIn.nextInt();
			int H = stdIn.nextInt();
			if(W == 0 && H == 0)
			{
				break;
			}
			char[][] field = new char[H][W];
			Queue<P> que = new ArrayDeque<P>();
			for(int i = 0; i < H; ++i)
			{
				String s = stdIn.next();
				for(int j = 0; j < W; ++j)
				{
					if(s.charAt(j) == '@')
					{
						P p = new P(j, i);
						que.add(p);
						field[i][j] = '#';
					}
					else
					{
						field[i][j] = s.charAt(j);
					}
				}
			}
			int count = 1;
			while(!que.isEmpty())
			{
				P p = que.poll();
				for(int i = 0; i < dx.length; ++i)
				{
					P np = new P(0, 0);
					np.x = p.x + dx[i];
					np.y = p.y + dy[i];
					if((0 <= np.x && np.x < W) && (0 <= np.y && np.y < H) && field[np.y][np.x] == '.')
					{
						que.add(np);
						field[np.y][np.x] = '#';
						++count;
					}
				}
			}
			System.out.println(count);
		}
	}
}