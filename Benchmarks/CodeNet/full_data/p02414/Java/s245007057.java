import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		int[][]A = new int[n][m];
		int[][]B = new int[m][l];
		long[][]C = new long[n][l];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				A[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < l; j++) {
				B[i][j] = scan.nextInt();
			}
		}
		scan.close();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < l; j++) {
				long sum = 0;
				for(int k = 0; k < m; k++) {
					sum += A[i][k] * B[k][j];
				}
				C[i][j] = sum;
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < l; j++) {
				if(j == l - 1) {
					System.out.println(C[i][j]);
				}else {
					System.out.print(C[i][j] + " ");
				}
			}
		}
	}
}
