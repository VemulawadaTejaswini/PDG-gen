import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
	static List<Integer> path;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		br.close();

		long ans = 0;
		long n2 = (long) Math.ceil(Math.sqrt(n));
		for (long i = n2 - 1; i > 0; i--) {
			if (n % i == 0) {
				long d = n / i;
				ans += d - 1;
			}
		}
		System.out.println(ans);
	}
}
