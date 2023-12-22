import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int[][] a = new int[n][m];
		int[] b = new int[m];

		for (int i = 0; i < n; i++) {
			String[] aStr = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(aStr[j]);
			}
		}
		for (int i = 0; i < m; i++) {
			b[i] = Integer.parseInt(br.readLine());
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int c = a[i][j] * b[j];
				sum += c;
			}
			sb.append(sum).append("\n");
			sum = 0;
		}

		System.out.print(sb);
	}
}