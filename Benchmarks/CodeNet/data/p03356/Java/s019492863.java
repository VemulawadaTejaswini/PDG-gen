

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int par[]=new int[200007];
	static int root(int x)
	{
		if(par[x]==x)return x;
		
		return par[x]=root(par[x]);
	}
	static void unite(int x,int y)
	{
		x=root(x);
		y=root(y);
		par[x]=y;
		
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int ar[]=new int[n+2];
		for(int i=1;i<=n;i++)
		{
			ar[i]=scan.nextInt();
		}
		for(int i=0;i<par.length;i++)
		{
			par[i]=i;
		}
		for(int i=0;i<m;i++)
		{
			unite(scan.nextInt(),scan.nextInt());
		}
		boolean gg[]=new boolean[n+2];
		for(int i=1;i<=n;i++)
		{
			if(root(i)==root(ar[i]))
			{
				gg[i]=true;
			}
		}
		int count=0;
		for(int i=1;i<=n;i++) {
			if(gg[i])count++;
		}
		System.out.println(count);
		
		
	}
}
