import java.util.*;

class Main 
{
  	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),
			w = sc.nextInt();

		int W[] = new int[n],
			V[] = new int[n],
			cnt[] = new int[10000000];
		int sum_w  = 0, sum_v = 0;

		for(int i = 0; i < n; i++)
		{
			W[i] = sc.nextInt();
			V[i] = sc.nextInt();
			sum_w += W[i];
			sum_v += V[i];
		}

		for(int i = 0; i < n; i++)
		{
			if(cnt[W[i]] != 0)
				cnt[W[i] + W[i]] = cnt[W[i]] + V[i];
			else
				cnt[W[i]] = V[i];
		}

		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(i == j) continue;
				if(cnt[W[i] + W[j]] != 0)
					cnt[W[i] + W[j]] = Math.max(cnt[W[i] + W[j]], V[i] + V[j]);
				else
					cnt[W[i] + W[j]] = V[i] + V[j];
			}
		}

		if(cnt[w] != 0)
			System.out.println(cnt[w]);
		else
		{
			if(sum_w < w)
				System.out.println(sum_v);
			else
				System.out.println(0);
		}
  	}
}