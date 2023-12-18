import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		String[] work = line1.split(" ");
		int n = Integer.parseInt(work[0]);
		int m = Integer.parseInt(work[1]);
		int x = Integer.parseInt(work[2]);
		int[][] matrix = new int[n][m+1];
		for (int i = 0; i < n; i++) {
			String lineN = br.readLine();
			work = lineN.split(" ");
			for (int j = 0; j < work.length; j++) {
				matrix[i][j] = Integer.parseInt(work[j]);
			}
		}
		int result = -1;

		for (int bit = 1; bit < Math.pow(2, n); bit++) {
			int amount = 0;
			for (int col = 0; col < m; col++) {
				int sum = 0;
				for (int row = 0; row < n; row++) {
					if ((bit >> row) % 2 == 0) {
						continue;
					}
					sum += matrix[row][col];
				}
				if (col == 0) {
					if (result > 0 && result < sum) {
						amount = -1;
						break;
					}
					amount = sum;
					continue;
				}
				if (sum < x) {
					amount = -1;
					break;
				}
			}
			if (amount > 0) {
				result = amount;
			}
		}
		System.out.println(result);
	}
}
