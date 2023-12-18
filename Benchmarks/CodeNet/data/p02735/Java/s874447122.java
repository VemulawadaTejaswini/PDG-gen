
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] as = br.readLine().split(" ");
		int h = Integer.parseInt(as[0]);
		int w = Integer.parseInt(as[1]);
		char[][] map = new char[h+1][w+1];
		for(int i = 0 ; i < h ; i++) {
			String line = br.readLine();
			char[] ca  = line.toCharArray();
			for(int j = 0 ; j < w ; j++) {
				map[i][j] = ca[j];
			}
		}
//		for(int i = 0 ; i < h ; i++) {
//			for(int j = 0 ; j < w ; j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
		int[][] dp = new int[h][w];
		for(int i = 0  ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				if(i == 0 && j == 0) {
					dp[i][j] =(map[i][j]=='#'?1:0);
				}else if(i == 0) {
					dp[i][j] =(map[i][j]=='#'?dp[i][j-1]+1:dp[i][j-1]);
				}else if(j == 0) {
					dp[i][j] =(map[i][j]=='#'?dp[i-1][j]+1:dp[i-1][j]);

				}else {
					dp[i][j] = (map[i][j]=='#'? 
							Math.min(dp[i][j-1], dp[i-1][j])+1:Math.min(dp[i][j-1], dp[i-1][j]));
				}
			}
		}
		System.out.println(dp[h-1][w-1]);
	}

}
