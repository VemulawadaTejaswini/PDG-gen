import java.util.*;
public class Main
{
	static int H,W;
	static int f[][];
	static int dx[]={1,-1,0,0};
	static int dy[]={0,0,1,-1};
	static int cnt;
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			W=in.nextInt();
			H=in.nextInt();
			int sw=-1;
			int sh=-1;
			f=new int[H][W];
			cnt=0;
			for(int i=0;i<H;i++)
			{
				String s=in.next();
				for(int j=0;j<W;j++)
				{
					if(s.charAt(j)=='#')
						f[i][j]=1;
					else
						f[i][j]=0;

					if(s.charAt(j)=='@')
					{
						sw=j;
						sh=i;
					}
				}
			}
			dfs(sw,sh);
			System.out.println(cnt);
		}
	}

	static  int dfs(int w,int h)
	{
		cnt++;
		f[h][w]=1;
		for(int i=0;i<4;i++)
		{
			int nw=dx[i]+w;
			int nh=dy[i]+h;
			if(nw>=0&&nw<W&&nh>=0&&nh<H&&f[nh][nw]==0)
				dfs(nw,nh);
		}
		return cnt;
	}
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}