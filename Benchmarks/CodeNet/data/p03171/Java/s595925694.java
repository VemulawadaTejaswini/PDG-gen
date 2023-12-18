import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long dpF[][] = new long[n + 1][n + 1];
		long dpS[][] = new long[n + 1][n + 1];
		for ( int i = 1; i <= n; i++ ) {
			dpF[i][i] = in.nextInt();
			dpS[i][i] = 0;
		}
		in.close();

		for ( int base = 2; base <= n; base++ ) {
			int r = 1, c = base;
			while ( c <= n ) {

				if ( dpS[r + 1][c] + dpF[r][r] > dpS[r][c - 1] + dpF[c][c] ) {
					dpF[r][c] = dpS[r + 1][c] + dpF[r][r];
					dpS[r][c] = dpF[r + 1][c];
				} else {
					dpF[r][c] = dpS[r][c - 1] + dpF[c][c];
					dpS[r][c] = dpF[r][c - 1];
				}

				r++;
				c++;
			}
		}
		System.out.println(dpF[1][n] - dpS[1][n]);
	}
}