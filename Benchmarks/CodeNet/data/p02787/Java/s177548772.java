import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		int A[][] = new int[N][2];
		int maxA = 0;
		for(int i = 0; i < N; i++) {
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
			maxA = Math.max(maxA, A[i][0]);
		}
		
		int dp[][] = new int[N + 1][H + maxA + 1];
		for(int i = 0; i < N + 1; i++) {
			Arrays.fill(dp[i], Integer.MAX_VALUE / 2);
		}
		dp[0][0] = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < H + maxA; j++) {
				for(int k = 0; k < H / A[i][0] + 1; k++) {
					if(j >= k * A[i][0]) {
						dp[i + 1][j] = Math.min(Math.min(dp[i][j], dp[i + 1][j]), dp[i][j - k * A[i][0]] + (A[i][1] * k));
					}
				}
			}
		}
		
		int ans = Integer.MAX_VALUE;
		for(int i = H; i < H + maxA; i++) {
			ans = Math.min(dp[N][i], ans);
		}
		
		System.out.println(ans);
	}
}
