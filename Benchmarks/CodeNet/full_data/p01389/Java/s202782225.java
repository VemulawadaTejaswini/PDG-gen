import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[][] dp, field;
	static int H, W;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		if(!sc.hasNext())return false;
		H = sc.nextInt(); W = sc.nextInt();
		dp = new int[H][W]; field = new int[H][W];
		for(int i = 0; i < H; i++){
			String line = sc.next();
			for(int j = 0; j < W; j++){
				field[i][j] = line.charAt(j) - '0';
			}
		}
		return true;
	}
	static void solve(){
		dp[0][0] = 0;
		for(int i = 1; i < H; i++){
			dp[i][0] = field[i][0] + dp[ i - 1 ][0];
		}
		for(int j = 1; j < W; j++){
			dp[0][j] = field[0][j] + dp[0][ j - 1 ];
		}
		for(int i = 1; i < H; i++){
			for(int j = 1; j < W; j++){
				dp[i][j] = field[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		System.out.println(dp[H-1][W-1]);
	}
}