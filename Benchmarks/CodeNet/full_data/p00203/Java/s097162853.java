import java.util.*;

class Main {


	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int w = in.nextInt(), h = in.nextInt();
			int board[][] = new int[h][w];
			int dp[][] = new int[h+1][w];
			for(int i=0; i<h; i++)for(int j=0; j<w; j++) board[i][j] = in.nextInt();
			for(int j=0; j<w; j++) dp[0][j] = 1;
			for(int i=0; i<h-1; i++){
				for(int j=0; j<w; j++){
					if(board[i][j] == 0){
						if(j>0 && board[i+1][j-1] != 2) dp[i+1][j-1] += dp[i][j];
						if(j<w-1 && board[i+1][j+1] != 2) dp[i+1][j+1] += dp[i][j];
						dp[i+1][j] += dp[i][j];
					}
					else if(board[i][j] == 2){
						if(i<h-1) dp[i+2][j] += dp[i][j];
						else dp[h][j] += dp[i][j];
					}
				}
			}
			int ans = 0;
			for(int j=0; j<w; j++) ans += dp[h][j];
			System.out.println(ans);
		}
	}

}