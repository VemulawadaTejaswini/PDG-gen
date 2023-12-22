import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigInteger[] A = new BigInteger[N];

		for (int i = 0; i < N; i++) {
			A[i] = new BigInteger(sc.next());
		}

		sc.close();

		BigInteger result = new BigInteger("0");
		BigInteger r = BigInteger.TEN.pow(9).add(new BigInteger("7"));

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				result = result.add(A[i].multiply(A[j]));
			}
		}
		System.out.print(result.mod(r));
	}

}
