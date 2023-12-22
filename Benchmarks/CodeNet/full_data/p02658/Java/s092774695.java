import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigInteger sum = BigInteger.ONE;
		long[] input = new long[N];
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextLong();
			if (input[i] == 0) {
				System.out.println(0);
				System.exit(0);
			}
		}
		BigInteger MAX = new BigInteger("1000000000000000000");
		for (int i = 0; i < N; i++) {
			sum = sum.multiply(new BigInteger(String.valueOf(input[i])));
			if (sum.compareTo(MAX) > 0) {
				System.out.println(-1);
				System.exit(0);
			}
		}
		System.out.println(sum.longValueExact());
	}

}
