import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] aline = br.readLine().split(" ");

		long lcm = 1;
		long[] alinenums = new long[n];

		for (int i = 0; i < n; i++) {
			alinenums[i] = Long.parseLong(aline[i]);
			lcm = lcm(lcm, alinenums[i]);
		}

		lcm -= 1;
		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += lcm % alinenums[i];
		}

		System.out.println(ans);

	}

	public static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}

}