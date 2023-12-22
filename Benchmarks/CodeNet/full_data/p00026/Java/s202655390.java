import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int dx[] = {1, 0, -1, 0, 1, 1, -1, -1, 2, 0, -2, 0};
		int dy[] = {0, -1, 0, 1, 1, -1, 1, -1, 0, -2, 0, 2};
		int field[][] = new int[10][10];
		while(stdIn.hasNext())
		{
			String[] s = stdIn.next().split(",");
			int x = Integer.valueOf(s[0]);
			int y = Integer.valueOf(s[1]);
			int size = Integer.valueOf(s[2]);
			++field[x][y];
			int n = 4 * size;
			for(int i = 0; i < n; ++i)
			{
				if((0 <= x + dx[i] && x + dx[i] < 10) && (0 <= y + dy[i] && y + dy[i] < 10))
				{
					++field[x + dx[i]][y + dy[i]];
				}
			}
		}
		int count = 0;
		int max = 0;
		for(int i = 0; i < 10; ++i)
		{
			for(int j = 0; j < 10; ++j)
			{
				if(field[i][j] >= 1)
				{
					++count;
				}
				if(field[i][j] > max)
				{
					max = field[i][j];
				}
			}
		}
		System.out.println(100 - count);
		System.out.println(max);
	}
}