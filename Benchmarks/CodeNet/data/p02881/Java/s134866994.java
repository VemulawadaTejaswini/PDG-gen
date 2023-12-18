import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Long.parseLong(br.readLine());

		ArrayList<Long> list = divisor(n);

		long min = Long.MAX_VALUE;
		long ans = 0;

		for (int i = 0; i < list.size(); i += 2) {
			long a = list.get(i);
			long b = list.get(i + 1);

			if (a + b < min) {
				ans = (a - 1) + (b - 1);
			}
		}

		System.out.println(ans);
	}

	public static ArrayList<Long> divisor(long n) {
		final ArrayList<Long> list = new ArrayList<>();

		for (long i = 1; i * i <= n; i++) { // √n
			if (n % i == 0) {
				list.add(i);
				list.add(n / i);
			}
		}
		return list;
	}
}
