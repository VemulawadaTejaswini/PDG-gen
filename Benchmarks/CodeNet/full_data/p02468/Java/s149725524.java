import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] num = str.split(" ");
		int m = Integer.parseInt(num[0]);
		long n = Integer.parseInt(num[1]);
		long ans = 1;
		long m1000 = 1;
		long r = n % 1000;
		long k = (n - r) / 1000;
		if (r == 0) {
			r += 1000;
			k -= 1;
		}
		if (n > 10_000_000) {
			for (int i = 0; i < 1000; i++)
				m1000 = (m1000 * m) % 1_000_000_007;
			for (int i = 0; i < k; i++)
				ans = (ans * m1000) % 1_000_000_007;
		}
		for (int i = 0; i < r; i++)
			ans = (ans * m) % 1_000_000_007;
		System.out.println(ans);
	}
}