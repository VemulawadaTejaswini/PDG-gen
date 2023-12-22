import java.util.*;
public class Main
{
	static int n,ans;
	static int A,B;
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
			A=0;
			B=0;
			dfs(0,A,B);
			System.out.println(ans);
		}
	}

	static void dfs(int i,int A,int B)
	{
		if(i==n)
		{
			int dif=Math.abs(A-B);
			ans=Math.min(ans,dif);
		}
		else
		{
			dfs(i+1,A+a[i],B);
			dfs(i+1,A,B+a[i]);
		}
	}

	static public void debug(Object... o)
	{
		System.err.println(Arrays.deepToString(o));
	}
}