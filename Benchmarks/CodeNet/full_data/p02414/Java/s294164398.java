import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
			String[] array = input.split(" ");
			int n = Integer.parseInt(array[0]);
			int m = Integer.parseInt(array[1]);
			int l = Integer.parseInt(array[2]);

			long a[][] = new long[n][m];
			for (int i = 0; i < n; i++) {
				input = reader.readLine();
				array = input.split(" ");
				for (int j = 0; j < m; j++) {
					a[i][j] = Long.parseLong(array[j]);
				}
			}

			long b[][] = new long[m][l];
			for (int i = 0; i < m; i++) {
				input = reader.readLine();
				array = input.split(" ");
				for (int j = 0; j < l; j++) {
					b[i][j] = Long.parseLong(array[j]);
				}
			}
			long[][] c = new long[n][l];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < l; j++) {
					for (int k = 0; k < m; k++) {
						c[i][j] += a[i][k] * b[k][j];
					}
					System.out.print(c[i][j]);
					if (j != (l - 1)) {
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}