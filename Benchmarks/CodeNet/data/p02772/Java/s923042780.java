

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}

		String anser = "APPROVED";

		for (int i : A) {
			if (i % 2 == 0) {
				if (i % 3 != 0 && i % 5 != 0)
					anser = "DENIED";
			}
		}

		System.out.println(anser);
	}

}
