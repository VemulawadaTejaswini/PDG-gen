public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();

		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		int[][] C = new int[n][l];

		for(int i = 0;i < n;i++){
			for(int j = 0;j < m;j++){
				A[i][j] = scan.nextInt();
			}
		}
		for(int i = 0;i < m;i++){
			for(int j = 0;j < l;j++){
				B[i][j] = scan.nextInt();
			}
		}
		for(int i = 0;i < n;i++){
			for(int j = 0;j < l;j++){
				for(int k = 0;k < m;k++){
					C[i][j] += A[i][k]*B[k][j];
				}
				System.out.print(C[i][j]);
			}
		}
	}

}