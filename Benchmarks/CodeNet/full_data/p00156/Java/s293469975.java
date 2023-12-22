import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int dx[]={1,0,-1,0};
		int dy[]={0,1,0,-1};
		for(;;)
		{
			int W=in.nextInt();
			int H=in.nextInt();
			if((H|W)==0)
				return;
			int sh=0,sw=0;
			int cost[][]=new int[H][W];
			char map[][]=new char[H][W];
			LinkedList<String>que=new LinkedList<String>();
			for(int p[]: cost)
				Arrays.fill(p, 100);
			for(int i=0;i<H;i++)
			{
				String st=in.next();
				for(int j=0;j<W;j++)
				{
					map[i][j]=st.charAt(j);
					if(map[i][j]=='&')
					{
						sh=i;
						sw=j;
					}
				}
			}
			cost[sh][sw]=0;
			que.add(sh+" "+sw);
			while(!que.isEmpty())
			{
				int size=que.size();
				for(int i=0;i<size;i++)
				{
					String now[]=que.poll().split(" ");
					int nh=Integer.valueOf(now[0]);
					int nw=Integer.valueOf(now[1]);
					for(int j=0;j<4;j++)
					{
						int h=dy[j]+nh;
						int w=dx[j]+nw;
						if(h>=0&&h<H&&w>=0&&w<W)
						{
							if((map[nh][nw]=='#'||map[h][w]=='.')&&cost[nh][nw]<cost[h][w])
							{
								cost[h][w]=cost[nh][nw];
								que.add(h+" "+w);
							}
							else if(map[nh][nw]!='#'&&map[h][w]=='#'&&cost[nh][nw]+1<cost[h][w])
							{
								cost[h][w]=cost[nh][nw]+1;
								que.add(h+" "+w);
							}
						}
					}
				}
			}
			int ans=100;
			for(int i=0;i<H;i++)
			{
				for(int j=0;j<W;j++)
				{
					if(i<1||i>H-2||j<1||j>W-2)
						ans=Math.min(ans, cost[i][j]);
				}
			}
			System.out.println(ans);
		}
	}
}