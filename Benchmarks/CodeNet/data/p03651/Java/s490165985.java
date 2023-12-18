
/* Filename: AGC018A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int K = input.nextInt();
			int[] A = new int[N];
			int maxA = -1;
			boolean isPossible = false;

			for (int i = 0; i < A.length; ++i) {
				A[i] = input.nextInt();
				maxA = Math.max(maxA, A[i]);

				if (K == A[i]) {
					isPossible = true;
				}
			}

			if (K < maxA) {
				for (int i = 0; i < A.length; ++i) {
					for (int j = i + 1; j < A.length; ++j) {
						if (K % GCD(A[i], A[j]) == 0) {
							isPossible = true;
							break;
						}
					}
					
					if(isPossible){
						break;
					}
				}
			}

			if (isPossible) {
				System.out.println("POSSIBLE");
			} else {
				System.out.println("IMPOSSIBLE");
			}
		}
	}

	private static int GCD(int a, int b) {
		return b == 0 ? a : GCD(b, a % b);
	}
}
