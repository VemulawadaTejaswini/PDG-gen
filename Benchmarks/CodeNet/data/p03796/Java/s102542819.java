import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		sc.close();

		BigInteger power = new BigInteger("1");
		BigInteger check = new BigInteger("1000000007");
		power.remainder(check);
		for(int i = 1; i <= N; i++) {
			BigInteger tmp = new BigInteger(String.valueOf(i));
			power = power.multiply(tmp);
			power = power.remainder(check);
		}

		System.out.println(power);
	}

}