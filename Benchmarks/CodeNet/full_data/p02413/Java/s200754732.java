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
				data[r][c] = data[r][c] + data[i][j];
				System.out.print(data[i][j] + " ");
				if (j == c - 1) {
					System.out.println(data[i][c]);
				}
			}
			if (i == r - 1) {
				for (int k = 0; k <= c; k++) {
					System.out.print(data[r][k]);
					if (k != c) {
						System.out.print(" ");
					} else {
						System.out.println();
					}
				}
			}
		}
	}
}