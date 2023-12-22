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
			int[] dp = new int[1 << m << w];
			for (int i = 0; i < 1 << m << w; i++) {
				for (int j = 0; j < m; j++) {
					for (int k = 0; k < w; k++) {
						if ((i & (1 << j << w)) != 0) {
							break;
						}
						if ((i & (1 << k)) != 0) {
							continue;
						}

						dp[i | (1 << j << w) | (1 << k)] = (int) Math.max(
								dp[i | (1 << j << w) | (1 << k)],
								dp[i]
										+ Math.abs(bm[j] - bw[k])
										* Math.pow(
												(Math.abs(bm[j] - bw[k]) - 30),
												2));
					}
				}
			}
			System.out.println(dp[(1 << m << w) - 1]);
		}

		
		
		
	}

}