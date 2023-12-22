import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strAry = br.readLine().split(" ");
		int n = Integer.parseInt(strAry[0]);
		int m = Integer.parseInt(strAry[1]);
		int l = Integer.parseInt(strAry[2]);
		int[][] a = new int[n][m];
		int[][] b = new int[m][l];
		for (int i = 0; i < n; i++) {
			String[] matrixA = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(matrixA[j]);
			}
		}
		for (int i = 0; i < m; i++) {
			String[] matrixB = br.readLine().split(" ");
			for (int j = 0; j < l; j++) {
				b[i][j] = Integer.parseInt(matrixB[j]);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				long c = 0;
				for (int k = 0; k < m; k++) {
					c += a[i][k] * b[k][j];
				}
				if (j == l - 1) System.out.print(c);
				else System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}