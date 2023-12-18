import java.util.Scanner;

class Main{





	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[N+1];
		long[] v = new long[N+1];
		for(int  i = 1;i <= N;i++){
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		long[][] dp = new long[N+1][W+1];		//dp[i][j] i番目までで重さjの時の価値の最大値

		for(int i = 1;i <= N;i++){
			dp[i][w[i]] =(long)Math.max(dp[i-1][w[i]], v[i]);
			for(int j = 0;j <= W;j++){
				if(dp[i-1][j] > 0){
					if(j +w[i] <= W){
						dp[i][j+w[i]] =(long)Math.max(dp[i][j+w[i]], dp[i-1][j] + v[i]);
						dp[i][j] =(long)Math.max(dp[i][j], dp[i-1][j]) ;

					}else{
						dp[i][j] =(long)Math.max(dp[i][j], dp[i-1][j]) ;
					}
					
				}else{
					dp[i][j] =(long)Math.max(dp[i][j], dp[i-1][j]) ;
				}
					//	System.out.println("i "+i +" j "+ j+" "+dp[i][j]);
			}
		}
		long max = 0;
		for(int i = 0;i <= W;i++){
			max =(long)Math.max(max, dp[N][i]);
		}
		System.out.println(max);



	}
}







class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

