import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] a;
		int[] b;
		int c;
		int n = 0;
		int m = 0;

		Scanner sc= new Scanner( System.in );
		n = sc.nextInt();
		m = sc.nextInt();

		a = new int[n][m];
		b = new int[m];


		for ( int i = 0 ; i < n ; i++ ) {
			for ( int j = 0 ; j < m ; j++ ) {
				a[i][j] = sc.nextInt();
			}
		}

		for ( int j = 0 ; j < m ; j++ ) {
			b[j] = sc.nextInt();
		}

		for ( int i = 0 ; i < n ; i++ ) {
			c = 0;
			for ( int j = 0 ; j < m ; j++ ) {
				c += a[i][j] * b[j];
			}
			System.out.println( c );
		}
		sc.close();
	}
}
