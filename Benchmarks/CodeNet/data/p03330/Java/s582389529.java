import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[][] x = new int[c][c];
		int[][] y = new int[n][n];
		for(int i = 0 ; i < c ; i++) {
			for(int j = 0 ; j < c ; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				y[i][j] = sc.nextInt();
			}
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 1 ; i <= c ; i++) {
			for(int j = 1 ; j <= c ; j++) {
				for(int k = 1 ; k <= c ; k++) {
					if(i == j || j == k || k == i) continue;
					int cnt = 0;
					for(int l = 1 ; l <= n ; l++) {
						for(int m = 1 ; m <= n ; m++) {
							if((l + m) % 3 == 2 && y[l - 1][m - 1] != i) cnt += x[y[l - 1][m - 1] - 1][i - 1];
							if((l + m) % 3 == 0 && y[l - 1][m - 1] != j) cnt += x[y[l - 1][m - 1] - 1][j - 1];
							if((l + m) % 3 == 1 && y[l - 1][m - 1] != k) cnt += x[y[l - 1][m - 1] - 1][k - 1];
						}
					}
					ans = Math.min(ans, cnt);
				}
			}
		}
		System.out.println(ans);
	}
}
