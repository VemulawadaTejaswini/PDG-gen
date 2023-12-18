package AtCoder_Grand_Contest_024;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();
		long answer = 0L;

		try {
			answer = solve(A, B, C, K);
			if (answer> BigInteger.valueOf(10).pow(18).longValue()) {
				System.out.println("Unfair");
			} else {
				System.out.println(answer);
			}

		} catch (Exception e) {
			System.out.println("Unfair");
		}

	}

	private static long solve(long A, long B, long C, long K) throws Exception {
		long tempA = 0L;
		long tempB = 0L;

		for (long i = 0; i < K; i++) {
			tempA = A;
			tempB = B;
			A = tempB + C;
			B = C + tempA;
			C = tempA + tempB;
		}

		return A - B;

	}

}
