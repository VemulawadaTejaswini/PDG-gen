import java.util.Scanner;

public class Main 
{
	static int n,m;
	static int[] a, b;
	static int[] par; //parent of an element
	static int[] rank; //rank of an element
	static long[] size;
	static long score = 0;
	
	static void union(int a, int b)
	{
		//when union-ing 2 different elements, the root of one of the two elements
		//becomes the parent of the other element's root.
		int ra = root(a);
		int rb = root(b);
		if(ra == rb)return;
		
		int sa = size[ra];
//		System.out.println("size was " + size[ra] + " " + size[rb]);
		long lost1 = ((size[ra]*size[ra])-(size[ra]))/2;
		long lost2 = ((size[rb]*size[rb])-(size[rb]))/2;
//		System.out.println("lost " + lost1 + " " + lost2);
		score += -lost1 -lost2;
		size[ra] = size[ra]+size[rb];
		size[rb] = size[ra];
		score += (((size[ra]*size[ra])-(size[ra]))/2);
//		System.out.println("size now " + size[ra]);
		
		if(rank[ra] >= rank[rb])
		{ //a's root is higher ranked means it should be the parent
			par[rb] = ra;
			if(rank[ra] == rank[rb])rank[rb]++; //if they're same rank,
			//ra's height is now increased due to having rb as a child, so ra's rank is increased
		}
		else par[ra] = rb;
	}
	
	static int root(int i) //alternate name: root()
	{ 
		//unless this is the root (parent == self), walk up the parents and find the root
		//then set that root as the direct parent of this node (path compression)
		if(par[i] != i)
			par[i] = root(par[i]); //path compression
		return par[i];
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		a = new int[m];
		b = new int[m];
		par = new int[n];
		rank = new int[n];
		size = new long[n];
		
		for(int i = 0; i < n; i++)
		{
			par[i] = i;
			size[i]=1;
		}
		
		for(int i = m-1; i >= 0; i--)
		{
			a[i] = sc.nextInt()-1;
			b[i] = sc.nextInt()-1;
//			union(a[i],b[i]);
//			System.out.println("pairs now: " + score);
		}
		
//		if(true)
		long init = (n*(n-1))/2;
		long[] note = new long[m];
		for(int i = 0; i < m; i++)
		{
//			System.out.println("Consider " + i + ": " + a[i] + " " + b[i]);
//			System.out.println("debug " + (init-score));
			note[i] = init-score;
			union(a[i],b[i]);
		}
//		System.out.println("debug " + (init-score));
		
		for(int i = m-1; i >= 0; i--)
		{
			System.out.println(note[i]);
		}
	}

}
