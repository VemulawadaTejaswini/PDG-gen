import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, w;
		int[] prime, weigh;
		String[] sp;
		int[][] dp;
		int[][] dpW;
		int cnt = 0;
		while((w = sc.nextInt()) != 0){
			cnt++;
			n = sc.nextInt();
			prime = new int[n + 1];
			weigh = new int[n + 1];
			for(int i = 1; i <= n; i++){
				sp = sc.next().split(",");
				prime[i] = Integer.parseInt(sp[0]);
				weigh[i] = Integer.parseInt(sp[1]);
			}

			dp = new int[w + 1][n + 1];
			dpW = new int[w + 1][n + 1];
			for(int i = 1; i <= w; i++){
				for(int j = 1; j <= n; j++){
					if(i < weigh[j]){
						dp[i][j] = dp[i][j - 1];
						dpW[i][j] = dpW[i][j - 1];

					//ツつ「ツづェツづ按つ「ツ陛サツつェツ可ソツ値ツつェツ債つつ「ツづつォ
					}else if(prime[j] + dp[i - weigh[j]][j - 1] < dp[i][j - 1]){
						dp[i][j] = dp[i][j - 1];
						dpW[i][j] = dpW[i][j - 1];

					//ツ禿シツづェツつスツ陛サツつェツ可ソツ値ツつェツつスツつゥツつュツづ按づゥツづつォ
					}else{
						dp[i][j] = prime[j] + dp[i - weigh[j]][j - 1];
						dpW[i][j] = weigh[j] + dpW[i - weigh[j]][j - 1];
					}
				}
			}

			System.out.println("Case " + cnt + ":");
			System.out.println(dp[w][n]);
			System.out.println(dpW[w][n]);

		}
	}
}