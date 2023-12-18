import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		long n = in.nextLong();
		System.out.println(solve(n));
		in.close();
	}

	private static long solve(long n) {
		long r = 0;
		for (long i = 1; i < n; i++) {
			long m = n / i;
			if (m <= i + 1)
				break;
			if (n % i == 0)
				r += m - 1;
		}
		return r;
	}
}