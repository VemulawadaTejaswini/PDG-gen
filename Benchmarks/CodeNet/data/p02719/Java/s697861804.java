import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

			BigInteger N = scanner.nextBigInteger();
			BigInteger K = scanner.nextBigInteger();

			BigInteger newN = N;

			newN = (N.remainder(K)).abs();


			N = K.subtract(newN);

			if(N.compareTo(newN) == 1) {
				System.out.println(newN);
			}else {
				System.out.println(N);
			}

	}

}
