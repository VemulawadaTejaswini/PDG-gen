import java.util.*;
public class Main {
	static String S;
	static int p;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int m = sc.nextInt();
			int w = sc.nextInt();
			if(m == 0 && w == 0) break;
			int[] bm = new int[m];
			int[] bw = new int[w];
			
			for (int i = 0; i < m; i++) {
				bm[i] = sc.nextInt();
			}
			for (int i = 0; i < w; i++) {
				bw[i] = sc.nextInt();
			}
			int[][] dp = new int[m+1][1 << w];
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < 1 << w; j++) {
					for(int k = 0; k < w; k++) {
						if((j & 1 << k) != 0) continue;
						dp[i+1][j | 1 << k] = Math.max(dp[i+1][j | 1 << k], dp[i][j] + Math.abs(bm[i] - bw[k]) * (Math.abs(bm[i] - bw[k])-30) * (Math.abs(bm[i] - bw[k])-30));
					}
				}
			}
			int max = 0;
			for(int i = 0; i < m+1; i++) {
				max = Math.max(max, dp[i][(1 << w) -1]);
			}
			System.out.println(max);
		}




	}

}