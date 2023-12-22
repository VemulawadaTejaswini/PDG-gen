import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		long a[] = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);
		}

		long s[] = new long[n + 1];
		s[0] = a[0];

		for (int i = 0; i < n - 1; i++) {
			s[i + 1] = s[i] + a[i + 1];
		}

		long ans = 0;
		for (int i = 0; i < n - 1; i++) {
			ans += (a[i] % 1000000007 * (s[n - 1] - s[i]) % 1000000007) % 1000000007;
		}

		System.out.println(ans % 1000000007);
	}
}
