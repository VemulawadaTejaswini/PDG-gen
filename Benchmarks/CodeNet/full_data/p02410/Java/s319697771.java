import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arA = new int [n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arA[i][j] = scan.nextInt();
			}
		}
		int[] vecb = new int[m];
		for (int i = 0; i < m; i++) {
			vecb[i] = scan.nextInt();
		}
		int[] vecc = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				vecc[i] += arA[i][j] * vecb[j];
			}
		}
		for (int i: vecc) {
			System.out.println(i);
		}
	}
}