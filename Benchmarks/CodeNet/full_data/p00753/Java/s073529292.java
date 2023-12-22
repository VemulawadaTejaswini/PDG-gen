import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int count = 0;

	static final int LIMIT = 123456 * 2 + 1;
	static int array[] = new int[LIMIT];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 1; i < LIMIT; i++) {
			if (isPrime(i)) {
				count++;
			}
			array[i] = count;
		}

		while (true) {
			String str = br.readLine();
			int n = Integer.parseInt(str);

			if (n == 0)
				break;

			int ans = array[n * 2] - array[n];
			System.out.println(ans);
		}
	}

	static boolean isPrime(int n) {

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
