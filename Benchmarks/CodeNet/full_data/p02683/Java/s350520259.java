import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int x = Integer.parseInt(str[2]);

		int c[] = new int[n];
		int a[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");
			c[i] = Integer.parseInt(str[0]);

			for (int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(str[j + 1]);
			}
		}

		long ans = Long.MAX_VALUE;
		for (int i = 0; i < Math.pow(2, n); i++) {
			int under[] = new int[m];
			long sum = 0;
			boolean flag = false;

			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					for (int k = 0; k < m; k++) {
						under[k] += a[j][k];
					}
					sum += c[j];
				}
			}
			for (int j = 0; j < m; j++) {
				if (under[j] < x) {
					flag = true;
				}
			}
			if (flag) {
				continue;
			}
			ans = Math.min(ans, sum);
		}

		if (ans == Long.MAX_VALUE) {
			System.out.println("-1");
		} else {
			System.out.println(ans);
		}
	}
}
