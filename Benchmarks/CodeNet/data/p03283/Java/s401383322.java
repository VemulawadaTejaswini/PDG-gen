import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int Q = sc.nextInt();
		int l;
		int r;
		int[][] sum = new int[n + 2][n + 1];
		for(int i = 0; i <= n + 1; i++)  Arrays.fill(sum[i], 0);
		for(int i = 0; i < m; i++) {
			l = sc.nextInt();
			r = sc.nextInt();
			sum[l][r]++;	
		}
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= n; j++) {
				sum[i][j] += sum[i + 1][j] + sum[i][j - 1] - sum[i + 1][j - 1];
			}
		}
		//for(int i = 0; i <= n + 1; i++) {for(int j = 0; j <= n; j++) {System.out.print(sum[i][j] + "\t");}System.out.println();}
		int p, q;
		for(int i = 0; i < Q; i++) {
			p = sc.nextInt();
			q = sc.nextInt();
			System.out.println(sum[p][q]);
		}
	}
}