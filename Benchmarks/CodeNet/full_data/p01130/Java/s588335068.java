import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int M=10000000;
		for(;;)
		{
			int n=in.nextInt(),m=in.nextInt();
			int s=in.nextInt(),g1=in.nextInt(),g2=in.nextInt();
			if((n|m|s|g1|g2)==0)
				return;
			int war[][]=new int[n+1][n+1];
			int ans=M;
			for(int i=0;i<=n;i++)
				Arrays.fill(war[i], M);
			for(int i=0;i<=n;i++)
				war[i][i]=0;
			for(int i=0;i<m;i++)
				war[in.nextInt()][in.nextInt()]=in.nextInt();
			
			//ワーシャルフロイド j->kと行くのにiを通った方が良いか
			for (int i=0;i<=n;i++)
				for(int j=0;j<=n;j++)
					for(int k=0;k<=n;k++)						
						war[j][k]=Math.min(war[j][k], war[j][i]+war[i][k]);
			for(int i=0;i<=n;i++)
				ans=Math.min(ans, war[s][i]+war[i][g1]+war[i][g2]);	
			System.out.println(ans);
		}
	}
}