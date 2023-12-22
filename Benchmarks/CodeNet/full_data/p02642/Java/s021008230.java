import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] A = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(sc.next());
			if (max < A[i])
				max = A[i];
		}
		Arrays.parallelSort(A);

		max++;
		boolean[] primeOfA = new boolean[max];
		boolean[] passedOnce = new boolean[max];
		Arrays.fill(primeOfA, true);
		Arrays.fill(passedOnce, false);

		int count = 0;
		for (int i = 0; i < n; i++) {
			int num = A[i];
			if (passedOnce[num]) { // remove duplicate.
				if (primeOfA[num]) {
					count--;
					primeOfA[num] = false;
				}
				continue;
			}

			passedOnce[num] = true;
			for (int multi = num * 2; multi < max; multi += num)
				primeOfA[multi] = false;

			if (primeOfA[num])
				count++;
		}

		System.out.println(count);
	}
}
