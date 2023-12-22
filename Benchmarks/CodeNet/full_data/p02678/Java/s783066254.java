
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean[][] road = new boolean[n][n];

		int[] mark = new int[n];
		int[] cost = new int[n];

		Arrays.fill(mark, -1);
		Arrays.fill(cost, Integer.MAX_VALUE / 2);


		for(int i = 0; i < m; i++)
		{
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;

			road[a][b] = true;
			road[b][a] = true;
		}

		cost[0] = 0;
		mark[0] = 0;

		for(int now = 0; now < n; now++)
		{
			for(int next = 0; next < n; next++)
			{
				if(now == next)
				{
					continue;
				}

				if(road[now][next])
				{
					if(cost[now] + 1 < cost[next])
					{
						cost[next] = cost[now] + 1;
						mark[next] = now;
					}
				}
			}
		}

		boolean no = false;

		for(int i = 0; i < n; i++)
		{
			if(mark[i] == -1)
			{
				System.out.println("No");
				no = true;
				break;
			}
		}

		if(!no)
		{
			System.out.println("Yes");
		}

		for(int i = 1; i < n; i++)
		{
			System.out.println(mark[i] + 1);
		}


		sc.close();
	}




}

