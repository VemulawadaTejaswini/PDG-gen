import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String[] nml = input.readLine().split(" ");
			int n = Integer.parseInt(nml[0]);
			int m = Integer.parseInt(nml[1]);
			int l = Integer.parseInt(nml[2]);
			String[][] matrix1 = new String[n][m];
			String[][] matrix2 = new String[m][l];
			StringBuilder answer = new StringBuilder();
			String lb = System.getProperty("line.separator");
			for (int i = 0; i < n; i++) {
				matrix1[i] = input.readLine().split(" ");
			}
			for (int i = 0; i < m; i++) {
				matrix2[i] = input.readLine().split(" ");
			}
			long sum;
			int s = l - 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < l; j++) {
					sum = 0;
					for (int k = 0; k < m; k++) {
						sum += Integer.parseInt(matrix1[i][k]) * Integer.parseInt(matrix2[k][j]);
					}
					answer.append(String.valueOf(sum)).append(j != s ? " "  : "");
				}
				answer.append(lb);
			}
			System.out.print(answer.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}