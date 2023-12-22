import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; ;)
		{
			int n = scanner.nextInt();
			if(n == 0)
			{
				break;
			}
			int[][] map = new int[n][n];
			
			int w = n/2;
			int h = n/2+1;
			map[h][w] = 1;
			for(int i=2; i<=n*n; i++)
			{
				h ++;
				w ++;
				for(; ;)
				{
					if(h >= n)
					{
						h = 0;
					}
					if(w < 0)
					{
						w = n-1;
					}
					else if(w >= n)
					{
						w = 0;
					}
					
					if(map[h][w] == 0)
					{
						map[h][w] = i;
						break;
					}
					else
					{
						w --;
						h ++;
					}
				}
			}
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++)
				{
					System.out.printf("%1$2d%2$s", map[i][j], (j<n-1 ? " " : "\n"));
				}
			}
		}
	}
}