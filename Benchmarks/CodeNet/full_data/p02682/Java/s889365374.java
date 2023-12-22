import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		Integer D[] = new Integer[A + B + C - 1];

		for (int i = 0; i < A - 1; i++) {
			D[i] = 1;

		}

		for (int i = A - 1; i < A + B - 1; i++) {
			D[i] = 0;

		}

		for (int i = A + B - 1; i < A + B + C - 1; i++) {
			D[i] = -1;

		}
		Arrays.sort(D, Collections.reverseOrder());
		
		int sum = 0;
		for (int i = 0; i < K - 1; i++) {
			 sum +=  D[i];
		}
		System.out.println(sum);
	}

}
