

import java.util.Scanner;

public class Main {
	static int ar[];
	static int flag[]=new int[8];
	static int n;
	static int ANS=Integer.MAX_VALUE;
	static int A=0;
	static int B=0;
	static int C=0;
	public static void dfs(int cu)
	{
		if(cu==n)
		{
			int sa=0,sb=0,sc=0;
			int aa=0,bb=0,cc=0;
			for(int i=0;i<n;i++)
			{
				if(flag[i]==0) {
					sa+=ar[i];
					aa++;
				}
				if(flag[i]==1)
				{
					sb+=ar[i];
					bb++;
				}
				if(flag[i]==2)
				{
					sc+=ar[i];
					cc++;
				}
				
			}
			if(aa==0 || bb==0 ||cc==0)
			{
				return;
			}
			int tot=10*((aa-1)+(bb-1)+(cc-1));
			tot+=(Math.abs(sa-A)+Math.abs(sb-B)+Math.abs(sc-C));
			ANS=Math.min(ANS, tot);
			return;
		}
		
		
		for(int i=0;i<4;i++)
		{
			flag[cu]=i;
			dfs(cu+1);
		}
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		A=scan.nextInt();
		B=scan.nextInt();
		C=scan.nextInt();
		ar=new int[n];
		
		for(int i=0;i<n;i++)
		{
			ar[i]=scan.nextInt();
		}
		dfs(0);
		System.out.println(ANS);
	}
}
