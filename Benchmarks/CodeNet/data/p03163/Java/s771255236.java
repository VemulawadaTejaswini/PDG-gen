import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int W = sc.nextInt();
		int w[] = new int[n];
		int v[] = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		long DP[][] = new long[n][W + 1];
		DP[0][w[0]] = v[0];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= W; j++) {
				DP[i][j] = DP[i - 1][j];
				if (j >= w[i]) DP[i][j] = Math.max(DP[i - 1][j - w[i]] + v[i],DP[i][j]);
			}
		}
		long Res = 0;
		for (int i = 0; i <= W; i++) Res = Math.max(Res, DP[n - 1][i]);
		System.out.print(Res);
	}

}
