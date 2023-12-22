import java.util.Scanner;
public class Main
{
	static int W,H;
	static int map[][];
	static int C,xg,yg,judge=0;
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			W=in.nextInt();
			H=in.nextInt();
			if((W|H)==0)
				return;
			map=new int[H+1][W+1];
			int xs=in.nextInt(),ys=in.nextInt();
			xg=in.nextInt();yg=in.nextInt();
			int n=in.nextInt();
			for(int i=0;i<n;i++)
			{
				int c=in.nextInt(),d=in.nextInt();
				int x=in.nextInt(),y=in.nextInt();
				if(d==0)
				{
					for(int h=y;h<y+2;h++)
						for(int w=x;w<x+4;w++)
							map[h][w]=c;
				}
				else
				{
					for(int h=y;h<y+4;h++)
						for(int w=x;w<x+2;w++)
							map[h][w]=c;
				}
			}
			C=map[ys][xs];
			if(C!=0&&solve(ys,xs)==1)
				System.out.println("OK");
			else
				System.out.println("NG");
		}
	}

	public static int solve(int h, int w)
	{
		if(h==yg&&w==xg)
		{
			judge=1;
			return judge;
		}
		map[h][w]=0;
		if(h-1>=1&&map[h-1][w]==C)
			solve(h-1,w);
		if(w-1>=1&&map[h][w-1]==C)
			solve(h,w-1);
		if(h+1<=H&&map[h+1][w]==C)
			solve(h+1,w);
		if(w+1<=W&&map[h][w+1]==C)
			solve(h,w+1);

		return judge;
	}
}