import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n= stdIn.nextInt();
		int m= stdIn.nextInt();
		int l= stdIn.nextInt();
		int x[][] = new int[n][m];
		int y[][] = new int[m][l];
		int z[][] = new int[n][l];
		for(int i=0;i<n; i++) {
			for(int j=0;j<m; j++) {
				x[i][j] = stdIn.nextInt();
			}
		}
		for(int i=0;i<m; i++) {
			for(int j=0;j<l; j++) {
				y[i][j] = stdIn.nextInt();
			}
		}
		stdIn.close();
		for(int i=0;i<n; i++) {
			for(int j=0;j<l; j++) {
				for(int k=0;k<m; k++) {
					z[i][j] += x[i][k] * y[k][j];
					if (k == m-1) {
						System.out.print(z[i][j]);
						if (j != l-1) {
							System.out.print(" ");
						}
					}
				}
			}
			System.out.println();
		}
	}
}

