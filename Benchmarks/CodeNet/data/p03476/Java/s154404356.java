import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int a[] = new int[100010];

		for (int i = 1; i < 100001; i++) {
			if (i % 2 == 0)
				continue;
			if (isPrime(i) && isPrime((i + 1) / 2)) {
				a[i] = 1;
			}
		}

		int s[] = new int[100010];
		s[0] = a[0];

		for (int i = 1; i < 100010; i++) {
			s[i] = s[i - 1] + a[i - 1];
		}

		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			int l = Integer.parseInt(str[0]);
			int r = Integer.parseInt(str[1]);

			System.out.println(s[r + 1] - s[l]);
		}

	}

	static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}