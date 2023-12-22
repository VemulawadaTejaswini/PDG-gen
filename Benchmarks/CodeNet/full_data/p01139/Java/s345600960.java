import java.util.Scanner;
public class Main
{
	static int field[][];
	static int which[][];
	static int white,black,cnt;
	static int W,H;
	static int dx[]={0,1,-1,0};
	static int dy[]={1,0,0,-1};
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
			which=new int[H][W];
			for(int i=0;i<H;i++)
			{
				String st=in.next();
				for(int j=0;j<W;j++)
				{
					if(st.charAt(j)=='.')
						field[i][j]=0;
					else if(st.charAt(j)=='W')
						field[i][j]=1;
					else if(st.charAt(j)=='B')
						field[i][j]=2;
				}
			}
			black=0;
			white=0;
			for(int i=0;i<H;i++)
			{
				for(int j=0;j<W;j++)
				{
					if(field[i][j]==1)//白で未訪問かつ白色なら
						dfs(i,j,"w",0);
					if(field[i][j]==2)//黒で未訪問かつ黒色なら
						dfs(i,j,"b",0);
				}
			}
			for(int i=0;i<H;i++)
			{
				for(int j=0;j<W;j++)
				{
					if(which[i][j]==1)
						white++;
					else if(which[i][j]==2)
						black++;
				}
			}
			System.out.println(black+" "+white);
		}	
	}
	public static void dfs(int h,int w,String s,int n)
	{
		if(n!=0)
		{
			if(s.equals("w"))
			{
				field[h][w]=3;//白で訪問済み
				which[h][w]+=1;//白なら1足す
			}
			else if(s.equals("b"))
			{
				field[h][w]=4;//黒で訪問済み
				which[h][w]+=2;//黒なら2足す
			}
		}
		for(int i=0;i<4;i++)
		{
			int nh=h+dy[i];
			int nw=w+dx[i];
			if(s.equals("w"))
				if(nh>=0&&nh<H&&nw>=0&&nw<W&&(field[nh][nw]==0||field[nh][nw]==4))//白で未訪問なら
					dfs(nh,nw,s,n+1);
			if(s.equals("b"))
				if(nh>=0&&nh<H&&nw>=0&&nw<W&&(field[nh][nw]==0||field[nh][nw]==3))//黒で未訪問なら
					dfs(nh,nw,s,n+1);
		}
	}
}