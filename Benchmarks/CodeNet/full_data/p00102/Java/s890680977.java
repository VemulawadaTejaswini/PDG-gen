import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int n;
			while (0 != (n = Integer.parseInt(in.readLine()))) {
				int[][] a = new int[n + 1][n + 1];
				for (int i = 0; i < n; i++) {
					String[] s = in.readLine().split(" ");
					int sum = 0;
					for (int j = 0; j < n; j++) {
						a[i][j] = Integer.parseInt(s[j]);
						sum += a[i][j];
					}
					a[i][n] = sum;
				}
				for (int i = 0; i <= n; i++) {
					int sum = 0;
					for (int j = 0; j <= n; j++) {
						sum += a[j][i];
					}
					a[n][i] = sum;
				}
				for (int i = 0; i <= n; i++) {
					for (int j = 0; j <= n; j++) {
						System.out.printf("%5d", a[i][j]);
					}
					System.out.println();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}