import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		BigInteger ans = BigInteger.ONE;

		for (int i = 1; i <= N; i++) {
			ans = ans.multiply(new BigInteger(String.valueOf(i)));
		}
		ans = ans.mod(new BigInteger(String.valueOf(1000000007)));
		System.out.println(ans);
		sc.close();
	}
}
