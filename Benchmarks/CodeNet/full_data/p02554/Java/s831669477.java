import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		if (N <= 1) {
			System.out.print(0);
			return;
		} else if (N == 2) {
			System.out.print(2);
			return;
		}

		BigInteger all = new BigInteger("10").pow(N);
		BigInteger dame1 = new BigInteger("8").pow(N);
		BigInteger dame2 = new BigInteger("9").pow(N).multiply(BigInteger.TWO);
		System.out.print(all.subtract(dame2).add(dame1).remainder(new BigInteger("1000000007")));
	}
}