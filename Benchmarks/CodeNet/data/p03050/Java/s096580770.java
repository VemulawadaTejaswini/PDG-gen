import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Long.parseLong(br.readLine());

		ArrayList<Long> list = divisor(n);
		long sum = 0;
		for (long l : list) {
			long m = n / l - 1;
			if (m == 0)
				continue;

			if (n / m == n % m) {
				sum += m;
			}
		}

		System.out.println(sum);
	}

	public static final ArrayList<Long> divisor(final long n) {
		final ArrayList<Long> list = new ArrayList<>();

		for (long i = 1; i * i <= n; i++) { // √n
			if (n % i == 0) {
				list.add(i); // a x b
				if (i != n / i) {
					list.add(n / i); // b x a (逆向き)
				}
			}
		}
		return list;
	}
}