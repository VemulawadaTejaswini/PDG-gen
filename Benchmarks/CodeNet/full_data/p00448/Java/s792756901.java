import java.util.Scanner;
public class Main
{
	static int ans;
	static int os[][];
	static int re[];
	static int r,c;
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			r=in.nextInt();
			c=in.nextInt();
			if((r|c)==0)
				return;
			os=new int[r][c];
			re=new int[r];
			ans=0;
			for(int i=0;i<r;i++)
				for(int j=0;j<c;j++)
					os[i][j]=in.nextInt();
			turn(0);
			System.out.println(ans);
		}
	}
	public static void turn(int n)
	{
		if(n==r)
		{
			ans=Math.max(ans, count(os));
			return;
		}
		re[n]=0;
		turn(n+1);
		re[n]=1;
		turn(n+1);
	}
	public static int count(int o[][])
	{
		int cnt=0;
		for(int i=0;i<c;i++)
		{
			int t=0;
			for(int j=0;j<r;j++)
			{
				if((re[j]==1&&o[j][i]==1)||(re[j]==0&&o[j][i]==0))
				t++;
			}
			if(t<r-t)
				cnt+=r-t;
			else
				cnt+=t;
		}
		return cnt;
	}
}