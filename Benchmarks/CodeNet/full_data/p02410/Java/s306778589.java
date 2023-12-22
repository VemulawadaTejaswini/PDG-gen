import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 何行何列かを読み取る
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] A = new int[n][m];
		int[] b = new int[m];
		
		// 行列に要素を代入
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				A[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			b[i] = scan.nextInt();
		}
		
		// 結果を出力
		int sum_i = 0; // 行ごとの結果
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sum_i += A[i][j] * b[j];
			}
			System.out.println(sum_i);
			sum_i = 0;
		}
		scan.close();
	}
}