import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] a = new int[M];
		int[] b = new int[M];
		
		int[][] matrix = new int[N][N];

		for (int i = 0; i < M; i++) {
			a[i] = sc.nextInt() -1;
			b[i] = sc.nextInt() -1;
			matrix[a[i]][b[i]] = 1;
			matrix[b[i]][a[i]] = 1;
		}
		
		int maxCol = 0;
		for (int i = 0; i < N; i++) {
			int col = 0;
			for (int j = 0; j < N; j++) {
				col += matrix[i][j];
			}
			maxCol = Math.max(maxCol, col);
		}
		
		System.out.println(maxCol);
	}
}