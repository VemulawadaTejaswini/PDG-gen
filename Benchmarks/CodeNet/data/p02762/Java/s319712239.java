public class Main 
{
	static int n, m, k;
	static int[] par;
	static int[] rank;
	static int[] size;
	
	static void union(int x, int y)
	{
		int rx = root(x);
		int ry = root(y);
		
		if(rank[rx] >= rank[ry])
		{
			par[ry] = rx;
			if(rank[rx] == rank[ry])
				rank[rx]++;
		}
		else par[rx] = ry;
	}
	
	static int root(int x)
	{
		if(par[x] != x)
			par[x] = root(par[x]);
		return par[x];
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		par = new int[n];
		rank = new int[n];
		size = new int[n];
		int[] penalty = new int[n];
		
		for(int i = 0; i < n; i++)
			par[i] = i;
			
		for(int i = 0; i < m; i++)
		{ //read friendships
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			union(a, b);
			
			//penalty for each direct friend on the same set
			penalty[a]++;
			penalty[b]++;
		}
		
		for(int i = 0; i < n; i++)
		{ //count size of each set
			size[root(i)]++;
		}
		
		for(int i = 0; i < k; i++)
		{ //read blockships
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			if(root(a) == root(b))
			{ //penalty for each blocked user on the same set
				penalty[a]++;
				penalty[b]++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++)
		{
			int an = size[root(i)] - 1 - penalty[i];
			if(i>0)sb.append(' ');
			sb.append(an);
		}
		System.out.println(sb);
	}

}
