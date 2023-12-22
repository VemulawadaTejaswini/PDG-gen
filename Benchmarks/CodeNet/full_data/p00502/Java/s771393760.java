import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int D=in.nextInt();
			int N=in.nextInt();
			int T[]=new int[D];
			int A[]=new int[N];
			int B[]=new int[N];
			int C[]=new int[N];
			int dp[][]=new int[D][N];//D日にNを着た時の最大値
			int clo[][]=new int[D][N];//Dの日にNの服を着ることができるか
			int ans=0;
			for(int i=0;i<D;i++)//i日の気温
				T[i]=in.nextInt();
			for(int i=0;i<N;i++)
			{
				A[i]=in.nextInt();
				B[i]=in.nextInt();
				C[i]=in.nextInt();
			}
			for(int i=0;i<D;i++)
				for(int j=0;j<N;j++)
				{
					dp[i][j]=-1;
					if(A[j]<=T[i]&&T[i]<=B[j])//着れる
						clo[i][j]=1;
				}
			for(int i=0;i<N;i++)
				if(clo[0][i]==1)
					dp[0][i]=0;

			for(int i=0;i<D-1;i++)  //i日に jの服 kの服
				for(int j=0;j<N;j++)
				{
					if(dp[i][j]>=0)
						for(int k=0;k<N;k++)
						{
							if(clo[i+1][k]==1)
								dp[i+1][k]=Math.max(dp[i+1][k], dp[i][j]+Math.abs(C[j]-C[k]));
							
							if(i+2==D)
								ans=Math.max(ans,dp[i+1][k]);
						}
				}
			System.out.println(ans);
		}
	}

	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}