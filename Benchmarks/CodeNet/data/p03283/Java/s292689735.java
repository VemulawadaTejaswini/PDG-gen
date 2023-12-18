import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int Q = sc.nextInt();
		int l;
		int r;
		int[][] sum = new int[n + 1][n + 1];
		//初期化
		for(int i = 1; i <= n; i++) for(int j = 1; j <= n; j++) sum[i][j] = 0;
		for(int i = 0; i < m; i++) {
			l = sc.nextInt();
			r = sc.nextInt();
			for(int j = 1; j <= l; j++) {
				for(int k = r; k <= n; k++)
					sum[j][k]++;
			}	
		}
		int p, q;
		for(int i = 0; i < Q; i++) {
			p = sc.nextInt();
			q = sc.nextInt();
			System.out.println(sum[p][q]);
		}
	}
}