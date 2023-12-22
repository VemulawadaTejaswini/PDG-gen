import java.util.*;
public class Main{
	static class Disjoint
	{
		int[] rank,parent;
		int n;
		public Disjoint(int n)
		{
			this.n = n;
			rank = new int[n];
			parent = new int[n];
			makeSet();
		}
		private void makeSet()
		{
			for(int i = 0;i<n;i++)
			{
//				rank[i] = i;
				parent[i] = i;
			}
			
		}
		
		int find(int i)
		{
			if(parent[i] != i)
				parent[i] = find(parent[i]);
			
			return parent[i];
		}
		void union(int x,int y)
		{
			int xRoot = find(x);
			int yRoot = find(y);
			
			if(xRoot == yRoot)
				return;
			
//			if(rank[xRoot] <= rank[yRoot])
//			{
//				parent[xRoot] = yRoot;
//				rank[yRoot]++;
//			}
//			else 
//			{
//				parent[yRoot] = xRoot;
//				rank[xRoot]++;
//			}
			
			 
	        if (rank[xRoot] < rank[yRoot]) 
	            parent[xRoot] = yRoot; 
	  
	        else if (rank[yRoot] < rank[xRoot]) 
	        	parent[yRoot] = xRoot; 
	  
	        else 
	        { 
	            parent[yRoot] = xRoot; 
	            rank[xRoot] = rank[xRoot] + 1; 
	        } 
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Disjoint dis = new Disjoint(n + 1);
		
		while(m-- > 0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			dis.union(a, b);
		}
		int max = 0;
		for(int i : dis.rank)
		{
			max = Math.max(max, i);
		}
		System.out.println(max + 1);
		
	}

}
