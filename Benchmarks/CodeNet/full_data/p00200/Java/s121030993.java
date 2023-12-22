import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int M=10000;
		for(;;)
		{
			int n=in.nextInt();//路線数
			int m=in.nextInt();//駅数
			if((n|m)==0)
				return;
			int cost[][]=new int[m+1][m+1];
			int time[][]=new int[m+1][m+1];
			for(int i=0;i<=m;i++)	{
				Arrays.fill(cost[i], M);
				Arrays.fill(time[i], M);}
			for(int i=0;i<=m;i++){
				cost[i][i]=0;
				time[i][i]=0;	}
			for(int i=0;i<n;i++)
			{
				int S=in.nextInt();
				int T=in.nextInt();
				int c=in.nextInt();
				int t=in.nextInt();
				cost[S][T]=c;
				cost[T][S]=c;
				time[S][T]=t;
				time[T][S]=t;
			}
			int nn=in.nextInt();
			for(int I=0;I<nn;I++)
			{
				int s=in.nextInt();
				int t=in.nextInt();
				int or=in.nextInt();
				if(or==0)
				{
					int p=0;
					int leng[]=new int[n+1];// minimum distance
					int v[] = new int[n+1];// decision flag
					for(int k=0;k<=m;k++)
					{
						leng[k]=M;
						v[k]=0;
					}
					leng[s]=0;
					for(int i=0;i<=m;i++)
					{
						int min=M;//最小の節点を探す
						for(int k=0;k<=m;k++)
						{
							if(v[k]==0&&leng[k]<min)
							{
								p=k;
								min=leng[k];
							}
						}
						v[p]=1;//確定フラグ
						for(int k=0;k<=m;k++) //pを経由してkに至長さがそれまでの最短経路より小さければ更新
						{
							if((leng[p]+cost[p][k])<leng[k])
								leng[k]=leng[p]+cost[p][k];
						}
					}
					System.out.println(leng[t]);
				}
				else
				{
					int p=0;
					int leng[]=new int[n+1];// minimum distance
					int v[] = new int[n+1];// decision flag
					for(int k=0;k<=m;k++)
					{
						leng[k]=M;
						v[k]=0;
					}
					leng[s]=0;
					for(int i=0;i<=m;i++)
					{
						int min=M;//最小の節点を探す
						for(int k=0;k<=m;k++)
						{
							if(v[k]==0&&leng[k]<min)
							{
								p=k;
								min=leng[k];
							}
						}
						v[p]=1;//確定フラグ
						for(int k=0;k<=m;k++) //pを経由してkに至長さがそれまでの最短経路より小さければ更新
						{
							if((leng[p]+time[p][k])<leng[k])
								leng[k]=leng[p]+time[p][k];
						}
					}
					System.out.println(leng[t]);
				}
			}
		}
	}
}