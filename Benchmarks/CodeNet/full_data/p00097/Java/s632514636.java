import java.util.Scanner;
public class Main
{
	static int n,s,ans;
	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);
		for(;;)
		{
			n=in.nextInt();
			s=in.nextInt();
			if((n|s)==0)
				return;
			ans=0;
			solve(0,0,0);
			System.out.println(ans);
		}
	}
	public static void solve(int i,int sum,int N)
	{
		if(sum==s&&N==n)
		{
			ans++;
			return;
		}
		if(i>=10||sum>s)
			return;
		solve(i+1,sum,N);
		solve(i+1,sum+i,N+1);
		return;
	}
}