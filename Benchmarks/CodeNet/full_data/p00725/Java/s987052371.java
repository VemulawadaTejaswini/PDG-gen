import java.util.Scanner;
public class Main
{
	static int W,H,ans;
	static int field[][];
	static int dh[]={1,0,-1,0};
	static int dw[]={0,1,0,-1};
	static int sw,sh,tw,th;
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			W=in.nextInt();
			H=in.nextInt();
			if((W|H)==0)
				return;
			field=new int[H][W];
			ans=11;
			for(int i=0;i<H;i++)
				for(int j=0;j<W;j++)
				{	
					int state=in.nextInt();
					field[i][j]=state;
					if(state==2)
					{
						sw=j;
						sh=i;
					}
				}	
			dfs(sw,sh,1);
			System.out.println(ans>10 ? -1:ans);
		}
	}
	static void dfs(int w,int h,int cnt)
	{
		if(cnt>=ans||cnt>10)
			return;
		for(int i=0;i<4;i++)
		{

			int nh=h;
			int nw=w;
			nh+=dh[i];
			nw+=dw[i];
			if(nh<0||nh>=H||nw<0||nw>=W||field[nh][nw]==1)
				continue;
			for(;;)
			{
				if(field[nh][nw]==3)
					ans=cnt;
				nh+=dh[i];
				nw+=dw[i];
				if(nh<0||nh>=H||nw<0||nw>=W)
					break;

				if(field[nh][nw]==1)
				{
					field[nh][nw]=0;
					dfs(nw-dw[i],nh-dh[i],cnt+1);
					field[nh][nw]=1;
					break;
				}
			}
		}
	}
}