import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;

		int count = 0;
		int m = 0;
		int n = 0;
		int l = 0;
		int[][] matrix1 = null;
		int[][] matrix2 = null;
		try {
			while ((buffer = reader.readLine())  != null) {
				String[] input = buffer.split(" ");

				if (count == 0) {
					n = Integer.valueOf(input[0]);
					m = Integer.valueOf(input[1]);
					l = Integer.valueOf(input[2]);
					matrix1 = new int[n][m];
					matrix2 = new int[m][l];
				}
				else if (count <= n) {
					for (int i = 0; i < m; i++) {
						matrix1[count - 1][i] = Integer.valueOf(input[i]);
					}
				}
				else if (count <= n + m) {
					for (int i = 0; i < l; i++) {
						matrix2[count - 1 - n][i] = Integer.valueOf(input[i]);
					}
				}
				if (count == n + m) {
					for (int h = 0; h < n; h++) {
						for (int w = 0; w < l; w++) {
							long calc = 0;
							for (int i = 0; i < m; i++) {
								calc += matrix1[h][i] * matrix2[i][w];
							}
							System.out.print(calc);
							if (w != l - 1) {
								System.out.print(" ");
							}
							else {
								System.out.println();
							}
						}
					}
					//output
					reader.close();
					return;
				}

				count++;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

