import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		int k2 = k * 2;
		int k4 = k * 4;
		int[][] sum = new int[k4 + 1][k4 + 1];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			int x = Integer.parseInt(sa[0]) % k2;
			int y = Integer.parseInt(sa[1]) % k2;
			if (sa[2].equals("W")) {
				y = (y + k) % k2;
			}
			sum[x + 1][y + 1]++;
		}
		br.close();

		for (int i = 1; i <= k2; i++) {
			for (int j = 1; j <= k2; j++) {
				sum[i][j + k2] = sum[i][j];
				sum[i + k2][j] = sum[i][j];
				sum[i + k2][j + k2] = sum[i][j];
			}
		}

		for (int i = 1; i <= k4; i++) {
			for (int j = 1; j <= k4; j++) {
				sum[i][j] += sum[i][j - 1];
			}
		}
		for (int i = 1; i <= k4; i++) {
			for (int j = 1; j <= k4; j++) {
				sum[i][j] += sum[i - 1][j];
			}
		}

		int ans = 0;
		for (int i = 0; i < k2; i++) {
			for (int j = 0; j < k2; j++) {
				int val1 = sum[i + k][j + k]
						- sum[i + k][j]
						- sum[i][j + k]
						+ sum[i][j];
				int val2 = sum[i + k2][j + k2]
						- sum[i + k2][j + k]
						- sum[i + k][j + k2]
						+ sum[i + k][j + k];
				ans = Math.max(ans, val1 + val2);
			}
		}
		System.out.println(ans);
	}
}
