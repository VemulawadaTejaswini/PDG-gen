import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int H=in.nextInt();
			int W=in.nextInt();
			int base[][]=new int[H+1][W+1];
			for(int i=0;i<H;i++)
				Arrays.fill(base[i], 0);
			for(int i=0;i<n;i++)
			{
				int h=in.nextInt();
				int w=in.nextInt();
				base[h][w]=1;
			}

			int S=in.nextInt();
			int T=in.nextInt();
			int max=0;
			for(int s=1;s<=H;s++)
				for(int t=1;t<=W;t++)
				{
					int cnt=0;
					for(int p=s;p<S+s;p++)
						for(int q=t;q<T+t;q++)
						{
							if(p>H||q>W)
								break;
							if(base[p][q]==1)
								cnt++;
						}
					max=Math.max(cnt, max);
				}
			System.out.println(max);
		}
	}
}