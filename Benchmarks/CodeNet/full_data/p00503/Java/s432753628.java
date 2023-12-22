import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int N=in.nextInt();
			int K=in.nextInt();
			long x[]=new long[N*2];
			long y[]=new long[N*2];
			long d[]=new long[N*2];
			int X1[]=new int[N];
			int Y1[]=new int[N];
			int D1[]=new int[N];
			int X2[]=new int[N];
			int Y2[]=new int[N];
			int D2[]=new int[N];
			int xl=0;
			int yl=0;
			int dl=0;
			long ans=0;
			for(int i=0;i<N;i++)
			{
				X1[i]=in.nextInt();
				Y1[i]=in.nextInt();
				D1[i]=in.nextInt();
				X2[i]=in.nextInt();
				Y2[i]=in.nextInt();
				D2[i]=in.nextInt();

			}
			for(int i=0;i<N;i++)
			{
				x[xl++]=X1[i];
				x[xl++]=X2[i];
				y[yl++]=Y1[i];
				y[yl++]=Y2[i];
				d[dl++]=D1[i];
				d[dl++]=D2[i];
			}
			Arrays.sort(x);
			Arrays.sort(y);
			Arrays.sort(d);
			for(int i=0;i<N*2-1;i++)//x position
				for(int j=0;j<N*2-1;j++)//y position
					for(int k=0;k<N*2-1;k++)//d position
					{
						int cnt=0;
						for(int l=0;l<N;l++)//
						{
							if((X1[l]<=x[i]&&x[i+1]<=X2[l])&&
									(Y1[l]<=y[j]&&y[j+1]<=Y2[l])&&
									(D1[l]<=d[k]&&d[k+1]<=D2[l]))
								cnt++;
						}
						if(cnt>=K)
							ans+=(x[i+1]-x[i])*(y[j+1]-y[j])*(d[k+1]-d[k]);
					}
			System.out.println(ans);
		}
	}
	static public void debug(Object... o)
	{
		System.err.println(Arrays.deepToString(o));
	}
}