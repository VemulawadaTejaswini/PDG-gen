import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int ans[];
	static int count = 0;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int ans = 0;
		for (int i = 1; i <= n; i += 2) {
			int count = 0;
			for (int j = 1; j <= n; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 8) {
				ans++;
			}
		}

		System.out.println(ans);
	}
}
