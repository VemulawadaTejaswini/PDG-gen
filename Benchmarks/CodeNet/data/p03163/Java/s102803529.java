import java.util.*;
public class Main
{

	public static void main(String [] args)
	{
	
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int W =sc.nextInt();
		
		int []w =new int[N];
		int []v =new int[N];
		
		for(int i=0;i<N;i++)
		{
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
		}
		
		
		int [][]dp =new int[N+1][W+1];
		
		for(int i=0;i<N;i++) dp[i][0] =0;
		for(int i=0;i<W;i++) dp[0][i] =0;
		
		for(int i=1;i<=N;i++)
		{
			for(int j=0;j<=W;j++)
			{
				 if(w[i]>j) dp[i][j]=dp[i-1][j];
				dp[i][j]= Math.max(v[i]+dp[i-1][j-w[i]], dp[i-1][j])
			}	
		}	
		
		return dp[N][W];	
	}

}