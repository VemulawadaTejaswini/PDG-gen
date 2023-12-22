import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		try (Stream<String> lines = new BufferedReader(new InputStreamReader(System.in)).lines()) {
			new Main().exec(lines.toArray(String[]::new));
		}
	}

	void exec(String[] args) {
		int S = Integer.parseInt(args[0].split(" ")[0]);
		BigInteger n = bi(0);
		for (int i = 1; i <= S / 3; i++) {
			n = n.add(c(S, i));
		}
		System.out.println(n.remainder(bi(10).pow(9).add(bi(7))));
	}

	BigInteger bi(int n) {
		return new BigInteger(String.valueOf(n));
	}

	BigInteger c(int s, int n) {
		int a = Math.min(s - 3 * n, n - 1);
		return f(s - 2 * n - 1, a).divide(f(a, a));
	}

	BigInteger f(int a, int b) {
		BigInteger n = bi(1);
		for (int i = 0; i < b; i++) {
			n = n.multiply(bi(a).subtract(bi(i)));
		}
		return n;
	}

}
