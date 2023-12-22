import java.util.LinkedList;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String field[][]=
			{
				{"A","B","C"},
				{"D","E","F"},
				{"G","H","I"}	
			};
		int dx[]={1,0,0,-1};
		int dy[]={0,1,-1,0};
		for(;;)
		{
			int n=in.nextInt();//battery
			if(n==0)
				return;
			String te=in.nextLine();
			String str[]=in.nextLine().split(" ");
			String s=str[0];//start
			String t=str[1];//charge
			String b=str[2];//no-enter
			double ans=1;
			int sh=-1,sw=-1;
			int th=-1,tw=-1;
			double dp[][][]=new double[n+1][3][3];
			for(int i=0;i<3;i++)
				for(int j=0;j<3;j++)
				{
					if(s.equals(field[i][j]))
					{
						sh=i;
						sw=j;
					}
					if(t.equals(field[i][j]))
					{
						th=i;
						tw=j;
					}
				}
			dp[n][sh][sw]=1;
			for(int i=n-1;i>=0;i--)
				for(int j=0;j<3;j++)
					for(int k=0;k<3;k++)	
						for(int l=0;l<4;l++)
						{
							int h=j+dy[l];
							int w=k+dx[l];
							if(0<=h&&h<3&&0<=w&&w<3&&!field[h][w].equals(b))
								dp[i][h][w]+=dp[i+1][j][k]/4;
							else
								dp[i][j][k]+=dp[i+1][j][k]/4;
						}
			System.out.printf("%.8f\n",dp[0][th][tw]);
		}
	}
}