import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			C[i] = sc.nextInt();
		}
		solve(N, A, B, C);
	}

	static void solve(int N, int[] A, int[] B, int[] C) {

		//0→A,　1→B,　2→C
		int[][] dp = new int[N][3];
		dp[0][0] = A[0];
		dp[0][1] = B[0];
		dp[0][2] = C[0];

		for (int i = 1; i < N; i++) {
			dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]) + A[i];
			dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2]) + B[i];
			dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1]) + C[i];
		}

		int answer = Math.max(dp[N-1][0],Math.max(dp[N-1][1], dp[N-1][2]));

		System.out.println(answer);
	}

}




