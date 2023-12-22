import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		double M=1000001;
		for(;;)
		{
			int n=in.nextInt();//ビルの数
			if(n==0)
				return;
			double x[]=new double[n+1];
			double y[]=new double[n+1];
			double cost[][]=new double[n+1][n+1];
			for(int i=0;i<n;i++)
				Arrays.fill(cost[i], M);
			for(int i=0;i<n;i++)
				cost[i][i]=0;
			for(int i=0;i<n;i++)
			{
				int bn=in.nextInt();
				x[bn]=in.nextDouble();
				y[bn]=in.nextDouble();
			}
			for(int i=1;i<=n;i++)
				for(int j=i+1;j<=n;j++)
				{
					if(i==j)
						continue;
					double dif=Math.sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j]));
					if(dif<=50)
						cost[i][j]=cost[j][i]=dif;
					else
						cost[i][j]=cost[j][i]=M;

				}
			int m=in.nextInt();
			for(int I=0;I<m;I++)
			{
				int s=in.nextInt(),g=in.nextInt();

				int p=0;
				int v[] = new int[n+1];// decision flag
				double leng[]=new double[n+1];// minimum distance
				int index[]=new int[n+1];//minimum road
				index[s]=0;
				for(int l=0;l<=n;l++)
				{
					leng[l]=M;
					v[l]=0;
				}
				leng[s]=0;
				for(int j=1;j<=n;j++)
				{
					double min=M;//最小の節点を探す
					for(int l=1;l<=n;l++)
					{
						if(v[l]==0&&leng[l]<min)
						{
							p=l;
							min=leng[l];
						}
					}
					v[p]=1;//確定フラグ
					for(int l=1;l<=n;l++) //pを経由してlに至長さがそれまでの最短経路より小さければ更新
					{
						if((leng[p]+cost[p][l])<leng[l])
						{
							leng[l]=leng[p]+cost[p][l];
							index[l]=p;
						}
					}
				}
				int po=g;
				ArrayList<Integer> L=new ArrayList<Integer>();
				L.add(g);
				if(leng[g]<M)
				{
					while(index[po]!=0)
					{
						L.add(index[po]);
						po=index[po];
					}
					for(int i=L.size()-1;i>0;i--)
						System.out.print(L.get(i)+" ");
					System.out.println(L.get(0));
				}
				else
					System.out.println("NA");
			}
		}
	}
}