import java.util.*;

public class Main
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int [] height;
		height = new int[N+1];

		int[]dp;
		dp = new int[N+1];

		//height入力
		for(int i=1;i<=N;i++)
		{
		height[i]=sc.nextInt();
		}

		//dp初期化
		for(int i=1;i<=N;i++)
		{
		dp[i]=0;
		}

		dp[2]=Math.abs(height[2]-height[1]);

		//dp実行
		for(int j=3;j<=N;j++)
		{
			int k;
			int l;
			k = dp[j-1] + Math.abs(height[j]-height[j-1]);
			l = dp[j-2] + Math.abs(height[j]-height[j-2]);
			dp[j] = min(k,l);
		}
		System.out.println(dp[N]);
	}

	//dp更新用の関数定義
	public static int min(int i,int j)
	{
		 return Math.min(i,j);
	}

}