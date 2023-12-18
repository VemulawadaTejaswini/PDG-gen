

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long N = scan.nextInt();
		long A = scan.nextInt();
		long B = scan.nextInt();
		long AB = A + B;

		long c = 0;

		if (N % AB > A) {
			c = A;
		} else {
			c = N % AB;
		}

		System.out.println(A * (N / AB) + c);

	}

}
