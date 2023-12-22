import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] size = str.split(" ", 2);
		int r = Integer.parseInt(size[0]);
		int c = Integer.parseInt(size[1]);
		int[][] data = new int[r + 1][c + 1];
		String[] datastr = new String[c];
		for (int i = 0; i < r; i++) {
			str = br.readLine();
			datastr = str.split(" ", c);
			for (int j = 0; j < c; j++) {
				data[i][j] = Integer.parseInt(datastr[j]);
				data[i][c] = data[i][c] + data[i][j];
				data[r][j] = data[r][j] + data[i][j];
			}
		}
		int allSum = 0;
		for (int sum : data[r]) {
			allSum = allSum + sum;
		}
		data[r][c] = allSum;
		for (int[] datar : data) {
			for (int datas : datar) {
				System.out.print(datas + " ");
			}
			System.out.println();
		}
	}
}