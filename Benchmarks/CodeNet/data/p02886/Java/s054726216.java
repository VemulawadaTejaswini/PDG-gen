import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");
		int d[] = new int[n];

		for (int i = 0; i < n; i++) {
			d[i] = Integer.parseInt(str[i]);
		}

		int ans = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				ans += d[i] * d[j];
			}
		}
		System.out.println(ans);
	}
}