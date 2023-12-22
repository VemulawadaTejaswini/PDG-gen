import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] A = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		int[] b = new int[m];
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		sc.close();
		
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			
			int ans = 0;
			for (int j = 0; j < m; j++) {
				ans += A[i][j] * b[j];
			}
			c[i] = ans;
			
		}

		for (int ans : c) {
			System.out.println(ans);
		}
	}
}