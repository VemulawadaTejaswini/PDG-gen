import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		long edge[][] = new long[n][n];

		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			for (int j = 0; j < n; j++) {
				edge[i][j] = Long.parseLong(str[j]);
			}
		}
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				if (edge[i][k] == 0)
					continue;
				for (int j = 0; j < n; j++) {
					if (edge[j][k] == 0)
						continue;
					if (edge[i][k] + edge[k][j] < edge[i][j]) {
						System.out.println(-1);
						return;
					}

					if (edge[i][k] + edge[k][j] == edge[i][j]) {
						edge[i][j] = 0;
						edge[j][i] = 0;
					}
				}
			}
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ans += edge[i][j];
			}
		}

		System.out.println(ans / 2);
	}
}