import java.util.*;

public class Main
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int [] height;
		height = new int[N];

		int[]dp;
		dp = new int[N];

		//height入力
		for(int i=1;i<=N;i++)
		{
		height[i-1]=sc.nextInt();
		}

		//dp初期化
		for(int i=1;i<=N;i++)
		{
		dp[i-1]=0;
		}
		dp[1]=Math.abs(height[1]-height[0]);

		//dp実行
		for(int j=3;j<=N;j++)
		{
			int k;
			int l;
			k = dp[j-3] + Math.abs(height[j-1]-height[j-3]);
			l = dp[j-2] + Math.abs(height[j-1]-height[j-2]);
			dp[j-1] = min(k,l);
		}
		System.out.println(dp[N-1]);
	}

	//dp更新用の関数定義
	public static int min(int i,int j)
	{
		 return Math.min(i,j);
	}

}