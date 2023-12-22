import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[] r = new int[n + 1];
			r[2] = 1;
			if (n > 900000) {
				r[900000] = 12478098;
				IntStream.rangeClosed(900001, n).forEach(i -> r[i] = r[i - 1] + getFactorNumbers(i - 1));
			} else if (n > 800000) {
				r[800000] = 10997400;
				IntStream.rangeClosed(800001, n).forEach(i -> r[i] = r[i - 1] + getFactorNumbers(i - 1));
			} else if (n > 700000) {
				r[700000] = 9529244;
				IntStream.rangeClosed(700001, n).forEach(i -> r[i] = r[i - 1] + getFactorNumbers(i - 1));
			} else if (n > 600000) {
				r[600000] = 8075420;
				IntStream.rangeClosed(600001, n).forEach(i -> r[i] = r[i - 1] + getFactorNumbers(i - 1));
			} else if (n > 500000) {
				r[500000] = 6638407;
				IntStream.rangeClosed(500001, n).forEach(i -> r[i] = r[i - 1] + getFactorNumbers(i - 1));
			} else if (n > 400000) {
				r[400000] = 5221424;
				IntStream.rangeClosed(400001, n).forEach(i -> r[i] = r[i - 1] + getFactorNumbers(i - 1));
			} else if (n > 300000) {
				r[300000] = 3829761;
				IntStream.rangeClosed(300001, n).forEach(i -> r[i] = r[i - 1] + getFactorNumbers(i - 1));
			} else if (n > 200000) {
				r[200000] = 2472071;
				IntStream.rangeClosed(200001, n).forEach(i -> r[i] = r[i - 1] + getFactorNumbers(i - 1));
			} else if (n > 100000) {
				r[100000] = 1166714;
				IntStream.rangeClosed(100001, n).forEach(i -> r[i] = r[i - 1] + getFactorNumbers(i - 1));
			} else {
				IntStream.rangeClosed(3, n).forEach(i -> r[i] = r[i - 1] + getFactorNumbers(i - 1));
			}
			System.out.println(r[n]);
		}
	}

	private static int getFactorNumbers(int n) {
		int result = 0;
		for (int i = 1; i * i <= n; i++) {
			if (0 == (n % i)) {
				result += (i == (n / i)) ? 1 : 2;
			}
		}
		return result;
	}
}
