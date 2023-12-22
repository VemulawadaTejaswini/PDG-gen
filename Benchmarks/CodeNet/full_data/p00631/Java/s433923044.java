import java.util.*;
public class Main
{
	static int n,ans;
	static int a[];
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			n=in.nextInt(); //n<=20
			if(n==0)
				return;
			a=new int[n];
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			ans=1000000;
			dfs(0,0,0);
			System.out.println(ans);
		}
	}

	static void dfs(int i,int A,int B)
	{
		if(i==n)
			ans=Math.min(ans,Math.abs(A-B));
		else
		{
			dfs(i+1,A+a[i],B);
			dfs(i+1,A,B+a[i]);
		}
	}
}