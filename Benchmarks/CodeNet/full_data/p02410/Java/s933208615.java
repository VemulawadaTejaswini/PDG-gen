import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] A = new int[n][m];
		int[] b = new int[m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for(int k =0; k < m; k++) {
			b[k] = sc.nextInt();
		}
		
		int[] c = new int[n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				c[i] += A[i][j] * b[j];
			}
		}
		for (int ans : c)System.out.println(ans);
		sc.close();
	}
}

