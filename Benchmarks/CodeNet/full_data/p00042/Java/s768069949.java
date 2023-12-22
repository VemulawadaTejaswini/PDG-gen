import java.util.Scanner;

class Main {
	int W,N;
	int[] w,v;
	int[][] dp;
	int count;
	
	public static void main(String args[]){
		Main app = new Main();
		Scanner scan = new Scanner(System.in);
		app.count = 0;
		while(true){
			app.W = Integer.valueOf(scan.nextLine());
			if(app.W==0){
				break;
			}
			app.N = Integer.valueOf(scan.nextLine());
			app.w = new int[app.N];
			app.v = new int[app.N];
			String[] str;
			for(int i=0;i<app.N;i++){
				str = scan.nextLine().split(",");
				app.v[i] = Integer.valueOf(str[0]);
				app.w[i] = Integer.valueOf(str[1]);
			}
			app.dp = new int[app.N+1][app.W+1];
			app.count++;
			app.DP(app.count);
		}
	}
	
	public void DP(int count){
		for(int i=0;i<N;i++){
			for(int j=0;j<W+1;j++){
				if(j<w[i]){
					dp[i+1][j] = dp[i][j];
				}else{
					dp[i+1][j] = Math.max(dp[i][j],dp[i][j-w[i]]+v[i]);
				}
			}
		}
		
		for(int i=W;i>0;i--){
			if(dp[N][i]>dp[N][i-1]){
				System.out.println("Case "+count+":");
				System.out.println(dp[N][i]);
				System.out.println(i);
				break;
			}
		}
	}
}