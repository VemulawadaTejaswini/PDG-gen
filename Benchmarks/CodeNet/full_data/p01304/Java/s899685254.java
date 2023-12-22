import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static Scanner sc = new Scanner(System.in);
	
	public static int gx, gy, N, P;
 
	
	public static void main(String[] args) {
		N = sc.nextInt();
		while (N-- > 0) {
			gx = sc.nextInt();
			gy = sc.nextInt();

			boolean[][][][] road = new boolean[16][16][16][16];
			
			P = sc.nextInt();
			for (int i = 0; i < P; i++) {
				int x1 = sc.nextInt(), y1 = sc.nextInt(), 
				    x2 = sc.nextInt(), y2 = sc.nextInt();
				road[y1][x1][y2][x2] = road[y2][x2][y1][x1] = true;
			}
			
			int[][] dp = new int[16][16];
			dp[0][0] = 1;
			for (int y = 1; y <= gy; y++) {
				if (road[y][0][y - 1][0]) {
					dp[y][0] = 0;  
				} else {
					dp[y][0] = dp[y - 1][0];
				}
			}
			
			for (int x = 1; x <= gx; x++) {
				if (road[0][x][0][x - 1]) {
					dp[0][x] = 0;  
				} else {
					dp[0][x] = dp[0][x - 1];
				}
			}
			
			for (int y = 1; y <= gy; y++) {
				for (int x = 1; x <= gx; x++) {
					dp[y][x] = 0;
					if (!road[y][x][y][x - 1])
						dp[y][x] += dp[y][x - 1];
					if (!road[y][x][y - 1][x])
						dp[y][x] += dp[y - 1][x];
				}
			}
			
			if (dp[gy][gx] == 0) {
				System.out.println("Miserable Hokusai!");
			} else {
				System.out.println(dp[gy][gx]);
			}
		}
	}
}