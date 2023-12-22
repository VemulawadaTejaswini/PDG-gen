import java.util.Scanner;
public class Main
{
	private class Data
	{
		long t;
		int s,d;
		Data(long t,int s,int d)
		{
			this.t = t;
			this.s = s;
			this.d = d;
		}
	}
	public void sort(Data[] datas)
	{
		for(int i = 0;i < datas.length - 1;i++)
		{
			for(int j = i + 1;j < datas.length;j++)
			{
				if(datas[i].t > datas[i].t)
				{
					Data tmp = datas[i];
					datas[i] = datas[j];
					datas[j] = tmp;
				}
			}
		}
	}
	public void solve()
	{
		Scanner cin = new Scanner(System.in);
		while(true)
		{
			int N = cin.nextInt();
			int M = cin.nextInt();
			if( N == 0 && M == 0)break;
			boolean[] infected = new boolean[N];
			infected[0] = true;
			Data[] datas = new Data[M];
			for(int i = 0;i < M;i++)
			{
				datas[i] = new Data(cin.nextLong(),cin.nextInt() - 1,cin.nextInt() - 1);
			}
			
			sort(datas);
			for(int i = 0;i < M;i++)
			{
				if(infected[datas[i].s])
				{
					infected[datas[i].d] = true;
				}else if(infected[datas[i].d])
				{
					infected[datas[i].s] = false;
				}
			}
			int ans = 0;
			for(int i = 0;i < N;i++)
			{
				if(infected[i])ans++;
			}
			
			System.out.println(ans);
		}
	}
	public static void main(String[] args)
	{
		new Main().solve();
	}
}