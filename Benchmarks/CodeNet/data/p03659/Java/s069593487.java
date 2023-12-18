import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int a[] = new int[n];

		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		Arrays.sort(a);

		long s[] = new long[n];
		s[0] = a[0];

		for (int i = 1; i < n; i++) {
			s[i] = s[i - 1] + a[i];
		}

		long ans = Long.MAX_VALUE;
		for (int i = 1; i < n; i++) {
			ans = Math.min(ans, Math.abs((s[n - 1] - s[i]) - s[i]));
		}

		System.out.println(ans);
	}
}