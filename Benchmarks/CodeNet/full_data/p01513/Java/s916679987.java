import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int N = stdIn.nextInt();
			if(N == 0)
			{
				break;
			}
			boolean[][] info = new boolean[101][101];
			for(int i = 0; i < 101; ++i)
			{
				for(int j = 0; j < 101; ++j)
				{
					info[i][j] = false;
				}
			}
			for(int i = 1; i <= N; ++i)
			{
				int M = stdIn.nextInt();
				for(int j = 0; j < M; ++j)
				{
					int p = stdIn.nextInt();
					info[i][p] = true;
				}
			}
			int K = stdIn.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < K; ++i)
			{
				int a = stdIn.nextInt();
				list.add(a);
			}
			int alreadyFlag = 0;
			int ans = 0;
			for(int i = 1; i <= N; ++i)
			{
				boolean flag = true;
				for(int j = 0; j < K; ++j)
				{
					if(!info[i][list.get(j)])
					{
						flag = false;
						break;
					}
				}
				if(flag)
				{
					++alreadyFlag;
					ans = i;
					if(alreadyFlag >= 2)
					{
						System.out.println(-1);
						break;
					}
				}
			}
			if(alreadyFlag == 1)
			{
				System.out.println(ans);
			}
			else if(alreadyFlag == 0)
			{
				System.out.println(-1);
			}
		}
	}
}