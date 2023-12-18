import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long a = Long.parseLong(str[0]);
		long b = Long.parseLong(str[1]);

		System.out.println(f(a - 1) ^ f(b));
	}

	static long f(long n) {
		if (n < 0) {
			return 0;
		}
		if (n % 4 == 0) {
			return n;
		} else if (n % 4 == 1) {
			return 1;
		} else if (n % 4 == 2) {
			return 1 ^ n;
		} else {
			return 0;
		}
	}
}