import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int W=sc.nextInt();
		int []w=new int[N+1];
		int []v=new int[N+1];
		for(int i=0;i<N;i++){
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
		}
		//dp[i][j]:i番目までの荷物中から重さの合計がj以下になるような価値の最大値
		long[][]dp=new long[2][W+1];
		for(int i=1;i<=W;i++)dp[0][i]=0;
		
		for(int i=0;i<N;i++){
				for(int j=0;j<=W;j++){
					if(j<w[i])dp[(i+1)&1][j]=dp[i&1][j];
					else dp[(i+1)&1][j]=Math.max(dp[i&1][j], dp[i&1][j-w[i]]+v[i]);
			}
		}
		
		System.out.println(dp[N&1][W]);
	}
}
