import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] matrix_A = new int[n][m];
		int[] matrix_B = new int[m];
		int[] matrix_C = new int[n];
		for(int i = 0; i<n; i++){
			for(int j = 0;j<m;j++){
				int matrix_element = scan.nextInt();
				matrix_A[i][j] = matrix_element;
			}
		}

		for(int k=0;k<m;k++){
			int matrix_element2 = scan.nextInt();
			matrix_B[k] = matrix_element2;
		}

		for(int l = 0;l<n; l++){
			for(int p = 0; p<m; p++){
				matrix_C[l] = matrix_C[l]+matrix_A[l][m] * matrix_B[l];
			}
		}

		for(int q = 0; q<matrix_C.length; q++){
			System.out.println(matrix_C[q]);
		}  
	}
}