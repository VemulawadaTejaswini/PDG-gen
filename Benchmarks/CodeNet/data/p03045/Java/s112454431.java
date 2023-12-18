

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		UnionFind uf=new UnionFind(n);
		
		for(int i=0;i<m;i++)
		{
			uf.unite(scan.nextInt()-1, scan.nextInt()-1);
			int x=scan.nextInt();
		}
		long ans=0l;
		for(int i=0;i<n;i++)
		{
			if(uf.par[i]<0)
			{
				ans++;
			}
		}
		System.out.println(ans);
		
	}
}

class UnionFind{
	int[] par;
	public UnionFind(int size)
	{
		par=new int[size];
		Arrays.fill(par, -1);
	}
	public int root(int x)
	{
		if(par[x]<0)
		{
			return x;
		}
		int z=root(par[x]);
		par[x]=z;
		return z;
	
	}
	public boolean same(int a,int b)
	{
		return (root(a)==root(b));
	}
	public void unite(int a,int b)
	{
		if(!same(a,b)) {
			int ra=root(a);
			int rb=root(b);
			//right now both ra and rb ==-1
			
			if(par[ra]<par[rb])
			{
				par[ra]+=par[rb];
				par[rb]=ra;
			}else {
				par[rb]+=par[ra];
				par[ra]=rb;
			}
		}
	}
	public int size(int a)
	{
		return -par[root(a)];
	}
	
}