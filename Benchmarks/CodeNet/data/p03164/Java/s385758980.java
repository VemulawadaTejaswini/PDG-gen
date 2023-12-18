import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int W = sc.nextInt();
		int w[] = new int[n];
		int v[] = new int[n];
		int Sv = 0;
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
			Sv += v[i];
		}
		int oo = (int)1e9 + 100;
		int DP[][] = new int[n][Sv + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= Sv; j++) DP[i][j] = oo;
		}
		DP[0][v[0]] = w[0];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= Sv; j++) {
				DP[i][j] = DP[i - 1][j];
				if (j >= v[i]) DP[i][j] = Math.min(DP[i - 1][j - v[i]] + w[i],DP[i][j]);
			}
		}
		for (int i = Sv; i >= 0; i--) {
			if (DP[n - 1][i] <= W) {
				System.out.print(i);
				System.exit(0);
			}
		}
	}

}
