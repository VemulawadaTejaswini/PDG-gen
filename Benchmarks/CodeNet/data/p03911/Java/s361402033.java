import java.util.Scanner;

public class Main 
{
	static int n, m, k;
	static int[] par;
	static int[] rank;
	
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
		
		int n = sc.nextInt(); //par
		int m = sc.nextInt(); //lang
		par = new int[n + m];
		rank = new int[n + m];
		for(int i = 0; i < n+m;i++)
			par[i] = i;
		
		for(int i = 0; i < n; i++)
		{
			int l = sc.nextInt();
			for(int k = 0; k < l; k++)
			{
				int lan = sc.nextInt()-1;
				union(i,n+lan);
			}
		}	
		
		int root = root(0);
		for(int i = 1; i<n; i++)
		{
			if(root != root(i))
			{
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");
	}

}
