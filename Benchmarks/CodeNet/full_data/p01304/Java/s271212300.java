import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	static int cnt[][];
	static int obs[][][][];
	static int a,b,ob;
	static int res;
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int I=in.nextInt();
		while(I-->0)
		{
			a=in.nextInt();b=in.nextInt();ob=in.nextInt();
			obs=new int[a+1][b+1][a+1][b+1];
			cnt=new int[a+1][b+1];
			int ans=0;
			for(int i=0;i<ob;i++)
			{
				int x1=in.nextInt(),y1=in.nextInt();
				int x2=in.nextInt(),y2=in.nextInt();
				obs[x1][y1][x2][y2]=1;
				obs[x2][y2][x1][y1]=1;
			}
			res=0;
			ans=count(0,0);
			System.out.println(ans==0?"Miserable Hokusai!":ans);
		}
	}
	static int count(int x,int y)
	{
		if (cnt[x][y]>0)  //already-count!
			return cnt[x][y];
		if (x==a&&y==b)
			return 1;
		res=0;
		if (x+1<=a&&obs[x][y][x+1][y]!=1)
			res+=count(x+1,y);
		if(y+1<=b&&obs[x][y][x][y+1]!=1)
			res+=count(x,y+1);
		return cnt[x][y] = res;	
	}
}