import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strAry = br.readLine().split(" ");
		int r = Integer.parseInt(strAry[0]);
		int c = Integer.parseInt(strAry[1]);
		int[][] table = new int[r + 1][c + 1];
		for (int i = 0; i < r; i++) {
			String[] tableAry = br.readLine().split(" ");
			for (int j = 0; j < c; j++) {
				table[i][j] = Integer.parseInt(tableAry[j]);
				table[i][c] += Integer.parseInt(tableAry[j]);
				table[r][j] += Integer.parseInt(tableAry[j]);
			}
			table[r][c] += table[i][c];
		}
		for (int i = 0; i <= r; i++) {
			for (int j = 0; j <= c; j++) {
				if (j == c) System.out.println(table[i][j]);
				else System.out.print(table[i][j] + " ");
			}
		}
	}
}