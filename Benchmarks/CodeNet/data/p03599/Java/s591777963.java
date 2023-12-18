import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();
		sc.close();
		int[]dp = new int[F + 1];
		dp[100 * A] = 1;
		dp[100 * B] = 1;
		for(int i = A; i <= F; i++) {
			if(dp[i] == 1) {
				int da = i + 100 * A;
				int db = i + 100 * B;
				if(da <= F) {
					dp[da] = 1;
				}
				if(db <= F){
					dp[db] = 1;
				}
			}
		}
//		for(int i = 100 * A; i <= F; i += 100) {
//			if(dp[i] == 1) {
//				System.out.print(i + " ");
//			}
//		}
//		System.out.println();
		int m = (F / 100) * E;
		int[]dp2 = new int[m + 1];
		dp2[C] = 1;
		dp2[D] = 1;
		for(int i = C; i <= m; i++) {
			if(dp2[i] == 1) {
				int dc = i + C;
				int dd = i + D;
				if(dc <= m) {
					dp2[dc] = 1;
				}
				if(dd <= m){
					dp2[dd] = 1;
				}
			}
		}
//		for(int i = C; i <= m; i++) {
//			if(dp2[i] == 1) {
//				System.out.print(i + " ");
//			}
//		}
//		System.out.println();
		int w = 0;
		int s = 0;
		double max = 0;
		for(int i = 100 * A; i <= F; i += 100) {
			if(dp[i] == 1) {
				int k = i / 100 * E;
				//System.out.println(k);
				for(int j = k; j >= 0; j--) {

					if(dp2[j] == 1) {
						double t = (double)100 * dp[i] / (dp2[j] + dp[i]);
						if(max < t && i + j <= F) {
							max = t;
							w = i + j;
							s = j;
							break;
						}
					}
				}
			}
		}
		System.out.println(w + " " + s);
	}
}