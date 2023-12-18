import java.util.*;

class Main {
	Scanner sc;
	int H, W;
	Set<Integer>[][] dp;
	int[][] A, B;
	
	@SuppressWarnings("unchecked")
	private void calc() {
		sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		A = new int[H+1][W+1];
		B = new int[H+1][W+1];
		for (int i = 1; i < H+1; i++)
			for (int j = 1; j < W+1; j++)
				A[i][j] = sc.nextInt();
		for (int i = 1; i < H+1; i++)
			for (int j = 1; j < W+1; j++)
				B[i][j] = sc.nextInt();
		
		dp = new HashSet[H+1][W+1];
		for (int i = 0; i < H+1; i++) {
			for (int j = 0; j < W+1; j++) {
				dp[i][j] = new HashSet<>();
				if ( i==0 || j==0 ) {
					dp[i][j].add(0);
					continue;
				}
				for (int v : dp[i-1][j]) {
					dp[i][j].add(Math.abs(v+A[i][j]-B[i][j]));
					dp[i][j].add(Math.abs(v-A[i][j]+B[i][j]));
				}
				for (int v : dp[i][j-1]) {
					dp[i][j].add(Math.abs(v+A[i][j]-B[i][j]));
					dp[i][j].add(Math.abs(v-A[i][j]+B[i][j]));
				}
			}
		}
		int min = Integer.MAX_VALUE;
		for (int v : dp[H][W]) {
			min = Math.min(min, v);
		}
				
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
