import java.util.Scanner;
class Main
{
	
	static int H,W,h,w;
	static int ans =0;
	static int  base[][];
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		for(;;)
		{
			ans=0;
			int W=in.nextInt();
			int H=in.nextInt();
			if((H|W)==0)
				return;
			base=new int [H][W];
			String str;
			for(int i=0;i<H;i++)
			{
				str=in.next();
				for(int j=0;j<W;j++)
				{
					if(str.charAt(j)=='#')
						base[i][j]=0;
					else if(str.charAt(j)=='.')
						base[i][j]=1;
					else if(str.charAt(j)=='@')
					{
						h=i;
						w=j;
						base[i][j]=1;
					}

				}
			}
			System.out.println(solve(h,w,H,W));
		}
	}
	
	public static int solve(int m, int n,int H,int W)
	{
		if((0<=m&&m<H)&&(0<=n&&n<W))
		{
			if(base[m][n]==0||base[m][n]==2)
				return 0;
			else if(base[m][n]==1)
			{
				ans++;
				base[m][n]=2;
				if(m-1>=0&&base[m-1][n]==1)
					solve(m-1,n,H,W);
				if(m+1<H&&base[m+1][n]==1)
					solve(m+1,n,H,W);
				if(n-1>=0&&base[m][n-1]==1)
					solve(m,n-1,H,W);
				if(n+1<W&&base[m][n+1]==1)
					solve(m,n+1,H,W);
			}
		}
		return ans;
	}
}