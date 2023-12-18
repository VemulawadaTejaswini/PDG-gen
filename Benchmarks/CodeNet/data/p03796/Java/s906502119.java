import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			BigInteger power = new BigInteger("1");
			for (int i = 1; i <= n; i++) {
				power = power.multiply(new BigInteger(Integer.toString(i)));
			}
			power = power.mod(new BigInteger("1000000007"));

			System.out.println(power.toString());

		} finally {
			sc.close();
		}
	}
}