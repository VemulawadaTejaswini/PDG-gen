import java.util.LinkedList;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int dx[]={2,2,2,-2,-2,-2,0,1,-1,0,1,-1};
		int dy[]={0,1,-1,0,1,-1,2,2,2,-2,-2,-2};
		int dx2[]={1,1,1,0,0,0,-1,-1,-1};
		int dy2[]={0,1,-1,1,0,-1,1,0,-1};	
		for(;;)
		{
			int w=in.nextInt();
			int h=in.nextInt();
			if((h|w)==0)
				return;
			int s=in.nextInt();
			int map[][]=new int[10][10];
			LinkedList<String>que=new LinkedList<String>();
			for(int i=1;i<=s;i++)
			{
				int sw=in.nextInt();
				int sh=in.nextInt();
				map[sh][sw]=i;
			}
			que.add(h+" "+w);
			int rincle=1;
			boolean judge=false;
			while(!que.isEmpty())
			{
				int size=que.size();
				judge=false;
				for(int i=0;i<size;i++)
				{
					String now[]=que.poll().split(" ");
					int nh=Integer.valueOf(now[0]);
					int nw=Integer.valueOf(now[1]);
					for(int j=0;j<12;j++)
					{
						int xh=dy[j]+nh;
						int xw=dx[j]+nw;
						int rh=0,rw=0;
						for(int I=0;I<10;I++)
							for(int J=0;J<10;J++)
							{
								if(map[I][J]==rincle)
								{
									rh=I;
									rw=J;
								}
							}

						if(xh>=0&&xh<10&&xw>=0&&xw<10)
						{
							for(int I=0;I<9;I++)
							{
								if((rh+dy2[I])==xh&&(rw+dx2[I])==xw)
								{
									que.add(xh+" "+xw);
									judge=true;
								}
							}
						}
					}
				}
				rincle++;
				if(rincle>s)
					break;
			}
			System.out.println(judge ? "OK":"NA");
		}
	}
}