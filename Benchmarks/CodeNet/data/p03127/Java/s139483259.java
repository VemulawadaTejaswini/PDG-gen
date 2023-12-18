import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];

		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}

		Arrays.sort(A);

		int min = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i] % min == 0) {
				continue;
			} else {
				min = A[i] % min;
			}
		}

		System.out.println(min);
	}

}