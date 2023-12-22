import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int INF=1000001;
		for(;;)
		{
			int N=in.nextInt();//町の数
			int M=in.nextInt();//制限時間
			int L=in.nextInt();//冷凍施設の数
			int K=in.nextInt();//道路の数
			int A=in.nextInt();//スタート地点
			int H=in.nextInt();//ゴール^^
			if((N|M|L|K|A|H)==0)
				return;
			int war[][]=new int[N][N];
			int no[]=new int[N];
			for(int i=0;i<L;i++)
				no[in.nextInt()]=1;
			no[A]=no[H]=1;
			int ans=M;
			for(int i=0;i<N;i++)
				Arrays.fill(war[i], INF);
			for(int i=0;i<N;i++)
				war[i][i]=0;
			for(int i=0;i<K;i++)
			{
				int s=in.nextInt();
				int t=in.nextInt();
				int co=in.nextInt();
				war[s][t]=war[t][s]=co;
			}
			
			for (int i=0;i<N;i++)
				for(int j=0;j<N;j++)
					for(int k=0;k<N;k++)
					{
						//j->kへ行くのにiを経由した方が良いかどうか
						int c=war[j][i]+war[i][k];
						war[j][k]=Math.min(war[j][k],c);
					}
			for(int i=0;i<N;i++)
				for(int j=0;j<N;j++)
				{
					if(no[i]==0||no[j]==0||war[i][j]>M)
						war[i][j]=INF;
				}
			for (int i=0;i<N;i++)
				for(int j=0;j<N;j++)
					for(int k=0;k<N;k++)
					{
						//j->kへ行くのにiを経由した方が良いかどうか
						int c=war[j][i]+war[i][k];
						war[j][k]=Math.min(war[j][k],c);
					}
			if(war[A][H]==INF)
				System.out.println("Help!");
			else
			  System.out.println(war[A][H]+Math.max(0,war[A][H]-M));
			System.out.println("war="+war[A][H]);
		}
	}
}