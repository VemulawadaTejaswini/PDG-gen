import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int N=in.nextInt();
			if(N==0)
				return;
			jump a[][]=new jump[N][N];
			ArrayList<jump>AL=new ArrayList<jump>();
			int field[][]=new int[N][N];
			boolean judge[][]=new boolean[N][N];
			int cnt=0;
			for(int i=0;i<N;i++)
				for(int j=0;j<N;j++)
				{
					jump b=new jump();
					b.x=in.nextInt();
					b.y=in.nextInt();
					a[j][i]=b;
				}

			for(int i=0;i<N;i++)
				for(int j=0;j<N;j++)
				{
					int xx=j;
					int yy=i;
					if(field[j][i]==0)
						for(;;)					
						{
							if(field[xx][yy]==2)
							{
								if(judge[xx][yy]==false)
								{
									cnt++;
									judge[xx][yy]=true;
									break;
								}
								else
									break;
							}
							field[xx][yy]=2;
							jump b=new jump();
							b.x=xx;
							b.y=yy;
							AL.add(b);
							int tx=a[xx][yy].x;
							int ty=a[xx][yy].y;
							xx=tx;
							yy=ty;
						}
					for(int k=0;k<AL.size();k++)
					{
						int rex=AL.get(k).x;
						int rey=AL.get(k).y;
						judge[rex][rey]=true;
					}
				}
			System.out.println(cnt);
		}
	}
}
class jump
{
	int x;
	int y;
}