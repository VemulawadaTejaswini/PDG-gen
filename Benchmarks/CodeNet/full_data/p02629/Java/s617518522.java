import java.math.BigInteger;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		sc.close();

		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			n -= 1;
			sb.append((char) ('a' + n % 26));
			n /= 26;
		}
		System.out.println(sb.reverse().toString());
	}
}