import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[][] a = new char[n][n];
		for (int i = 0; i < n; i++) {
			a[i] = br.readLine().toCharArray();
		}
		br.close();

		int col = 0;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				if (a[i][j] == '.') {
					col++;
					break;
				}
			}
		}

		int min = n + 1;
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				if (a[i][j] == '.') {
					cnt++;
				}
			}

			boolean flg = false;
			for (int i2 = 0; i2 < n; i2++) {
				if (a[i2][i] == '#') {
					flg = true;
					break;
				}
			}
			if (!flg) {
				cnt++;
			}
			min = Math.min(min, cnt);
		}
		if (min == n + 1) {
			System.out.println(-1);
		} else {
			System.out.println(min + col);
		}
	}
}
