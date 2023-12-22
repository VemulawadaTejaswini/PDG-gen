
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			BigInteger b = BigInteger.ONE;
			BigInteger[] d = new BigInteger[n];
			BigInteger[] v = new BigInteger[n];

			for (int i = 0; i < n; i++) {
				d[i] = new BigInteger(scanner.next());
				v[i] = new BigInteger(scanner.next());
				b = v[i].multiply(b.divide(b.gcd(v[i])));
			}
			for (int i = 0; i < n; i++) {
				d[i] = d[i].multiply(b.divide(v[i]));
			}
			b = BigInteger.ONE;
			for (int i = 0; i < n; i++) {
				b = d[i].multiply(b.divide(b.gcd(d[i])));
			}
			for (int i = 0; i < n; i++) {
				System.out.println(b.divide(d[i]));
			}

		}
	}
}