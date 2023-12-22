import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		scan.nextLine();

		long[][] mat1 = new long[n][m];
		long[][] mat2 = new long[m][l];
		long[][] mat3 = new long[n][l];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat1[i][j] = scan.nextInt();
			}
			scan.nextLine();
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < l; j++) {
				mat2[i][j] = scan.nextInt();
			}
			scan.nextLine();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				for (int k = 0; k < m; k++) {
					mat3[i][j] += mat1[i][k] * mat2[k][j];
				}
			}
		}
				
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				System.out.print(mat3[i][j]);
				if(j!=l-1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		scan.close();
	}
}

