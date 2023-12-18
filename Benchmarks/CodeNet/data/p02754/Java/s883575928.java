import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigInteger N = new BigInteger(sc.next());
		BigInteger A = new BigInteger(sc.next());
		BigInteger B = new BigInteger(sc.next());

		BigInteger sum = A.add(B);
		BigInteger setCount = N.divide(sum);
		BigInteger remain = N.remainder(sum);

		BigInteger result = A.multiply(setCount);
		if (remain.compareTo(A) >= 0) {
			result = result.add(A);
		} else {
			result = result.add(remain);
		}

		System.out.println(result);

		sc.close();
	}
}
