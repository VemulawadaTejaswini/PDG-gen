import java.util.Scanner;
import java.lang.Math;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		double m = (1 + Math.sqrt(1 + 8 * n)) / 2;
		int k = (int)m;
		if (k == m) {
			System.out.println("Yes");
			System.out.println(k);
			int[][] a = new int[k][k];
			for (int b = 0; b < k; b++)
				a[b][b] = 0;
			int i = 1;
			for (int c = 0; c < k; c++) {
				for (int d = c + 1; d < k; d++) {
					a[c][d] = i;
					a[d][c] = i;
					i = i + 1;
				}
			}
					
			for (int j = 0; j < k; j++ ) {
				System.out.print(k - 1);
				for (int e = 0; e < k; e++) {
					if (j != e)
						System.out.print(" " + a[j][e]);
				}
				System.out.println();
			}
		}
		else
			System.out.println("No");
		
	}
}