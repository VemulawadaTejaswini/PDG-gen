import java.util.Scanner;

/**
 * 2019/06/09
 * AtCoder Beginner Contest 129
 * 
 * D - Lamp
 * 
 * @author rued97
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		boolean S[][] = new boolean[H][W];		// 障害物なし：true 障害物あり：false
		for(int i = 0; i < H; i++) {
			String line = sc.next();
			for(int j = 0; j< W; j++) {
				S[i][j] = (line.charAt(j) == '.');
			}
		}
		
		int max = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j< W; j++) {
				int cnt = calc(i, j, H, W, S);
				if(cnt > max) {
					max = cnt;
				}
			}
		}
		
		System.out.println(max);
	}
	
	private static int calc(int i, int j, int H, int W, boolean [][] S) {
		if(S[i][j] == false) {
			return 0;
		}
		
		int cnt = 1;
		// 上方向
		for(int ii = i - 1; ii >= 0 && S[ii][j]; ii--) {
			cnt++;
		}
		// 下方向
		for(int ii = i + 1; ii < H && S[ii][j]; ii++) {
			cnt++;
		}
		// 左方向
		for(int jj = j - 1; jj >= 0 && S[i][jj]; jj--) {
			cnt++;
		}
		// 右方向
		for(int jj = j + 1; jj < W && S[i][jj]; jj++) {
			cnt++;
		}
		return cnt;
	}
	
}
