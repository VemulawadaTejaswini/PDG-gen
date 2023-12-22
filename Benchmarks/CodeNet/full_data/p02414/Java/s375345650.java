import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		
		int[][] A = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		int[][] B = new int[m][l];
		for(int j=0; j<m; j++) {
			for(int k=0; k<l; k++) {
				B[j][k] = sc.nextInt();
			}
		}
		
		int[][] C = new int[n][l];
		for(int i=0; i<n; i++) {
			for(int k=0; k<l; k++) {
				int sum = 0;
				for(int j=0; j<m; j++){
					sum += A[i][j] * B[j][k];
				}
				C[i][k] = sum;
				
				if(k != l-1) {
					System.out.print(C[i][k] + " ");
				} else {
					System.out.println(C[i][k]);
				}
			}
			System.out.println();
		}
	}

}