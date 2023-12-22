import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		int Matrix_A[][] = new int[n][m];
		int Matrix_B[][] = new int[m][l];
		int Matrix_C[][] = new int[n][l];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < l; j++) {
				Matrix_C[i][j] = 0;
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				Matrix_A[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < l; j++) {
				Matrix_B[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				for(int k = 0; k < l; k++) {
					Matrix_C[i][k] += Matrix_A[i][j] * Matrix_B[j][k]; 
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < l; j++) {
				if( j == l - 1) {
					System.out.println(Matrix_C[i][j]);
				}else {
					System.out.print(Matrix_C[i][j] + " ");
				}
			}
		}
		
		
	}
}

