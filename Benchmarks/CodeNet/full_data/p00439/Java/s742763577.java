import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str[] = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);

			if (n == 0 && k == 0)
				break;

			int a[] = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(br.readLine());
			}
			int s[] = new int[n + 1];
			for (int i = 0; i < n; i++) {
				s[i + 1] = s[i] + a[i];
			}

			long max = Long.MIN_VALUE;
			for (int i = 0; i < n - k; i++) {
				long value = s[k + i] - s[i];
				max = Math.max(max, value);
			}
			System.out.println(max);
		}
	}
}
