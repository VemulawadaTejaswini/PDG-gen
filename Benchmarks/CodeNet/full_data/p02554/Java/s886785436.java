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
		int N = Integer.parseInt(args[0].split(" ")[0]);
		System.out.println(bi(10).pow(N).subtract(bi(9).pow(N).multiply(bi(2))).add(bi(8).pow(N)).remainder(bi(10).pow(9).add(bi(7))));
	}

	BigInteger bi(int n) {
		return new BigInteger(String.valueOf(n));
	}

}
