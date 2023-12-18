import java.util.Scanner;

public class Main {
  
  public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long W = sc.nextLong();
		int vmax = 100000;

		long[][] dp = new long[N+1][vmax+1];
		long INF = 1000000001;

		for(int i=0;i<=N;i++){
			for(int j=0;j<=vmax;j++){
				dp[i][j] = INF;
			}
		}

		dp[0][0] = 0;

		for(int i=1;i<=N;i++){

			long wi = sc.nextLong();
			int vi = sc.nextInt();

			for(int j=0;j<=vmax;j++){


				if(j + vi <= vmax){
					dp[i][j+vi] = chmin(dp[i-1][j]+wi, dp[i][j+vi]);
				}

				dp[i][j] = chmin(dp[i-1][j]+0, dp[i][j]);
			}
		}

		long ans = 0;

		/*
		for(int i=0;i<=N;i++){
			for(int j=0;j<=vmax;j++){
				System.out.print(dp[i][j]);;
			}
			System.out.println();
		}
		*/

		for(int vi=vmax;vi>=0;vi--){
//			System.out.println(dp[N][vi]);
			if(dp[N][vi] <= W){
				ans = vi;
				break;
			}
		}

		System.out.println(ans);
	}



	public static long chmin(long a, long b){

		if(a <= b){
			return a;
		}else{
			return b;
		}
	}

}