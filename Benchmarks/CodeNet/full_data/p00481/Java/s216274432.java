package nofill_nosubmit;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class AOJ_0558 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int dx[]={1,0,-1,0};
		int dy[]={0,1,0,-1};
		while(in.hasNext())
		{
			int H=in.nextInt(),W=in.nextInt();
			int N=in.nextInt();
			int sh=0,sw=0,gh=0,gw=0;
			int ans=0,cnt=0;
			int visit[][]=new int[H][W];
			char map[][]=new char[H][W];
			LinkedList<String>que=new LinkedList<String>();
			for(int i=0;i<H;i++)
			{
				String st=in.next();
				for(int j=0;j<W;j++)
				{
					map[i][j]=st.charAt(j);
					if(map[i][j]=='S')
					{
						sh=i;
						sw=j;
					}
					else if(map[i][j]=='1')
					{
						gh=i;
						gw=j;
					}
				}
			}
			que.add(sh+" "+sw);
			while(!que.isEmpty())
			{
				int size=que.size();
				for(int i=0;i<size;i++)
				{
					String now[]=que.poll().split(" ");
					int nh=Integer.valueOf(now[0]);
					int nw=Integer.valueOf(now[1]);
					visit[nh][nw]=1;
					if(nh==gh&&nw==gw)
					{
						i=size-1;
						while(!que.isEmpty())
							que.poll();
						cnt++;
						if(cnt==N)
							break;
						else
							for(int j=0;j<H;j++)
								for(int k=0;k<W;k++)
								{
									if(cnt==1)
										if(map[j][k]=='2')
										{
											gh=j;
											gw=k;
										}
									if(cnt==2)
										if(map[j][k]=='3')
										{
											gh=j;
											gw=k;
										}
									if(cnt==3)
										if(map[j][k]=='4')
										{
											gh=j;
											gw=k;
										}
									if(cnt==4)
										if(map[j][k]=='5')
										{
											gh=j;
											gw=k;
										}
									if(cnt==5)
										if(map[j][k]=='6')
										{
											gh=j;
											gw=k;
										}
									if(cnt==6)
										if(map[j][k]=='7')
										{
											gh=j;
											gw=k;
										}
									if(cnt==7)
										if(map[j][k]=='8')
										{
											gh=j;
											gw=k;
										}
									if(cnt==8)
										if(map[j][k]=='9')
										{
											gh=j;
											gw=k;
										}
								}
						visit =new int[H][W];
					}
					for(int j=0;j<4;j++)
					{
						int h=dy[j]+nh;
						int w=dx[j]+nw;
						if(h>=0&&h<H&&w>=0&&w<W&&map[h][w]!='X'&&visit[h][w]==0)
							que.add(h+" "+w);
					}
				}
				if(cnt==N)
					break;
				ans++;
			}
			System.out.println(ans);
		}
	}
}