import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n + 1][3];
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 3; j++) a[i][j] = sc.nextInt();
		}
		int DP[][] = new int[n + 1][3];
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (j != k) DP[i][j] = Math.max(DP[i - 1][k] + a[i][j],DP[i][j]);
				}
			}
		}
		int Res = 0;
		for (int i = 0; i < 3; i++) Res = Math.max(DP[n][i], Res);
		System.out.print(Res);
	}

}
