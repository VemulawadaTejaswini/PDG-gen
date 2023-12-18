import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int N = scan.nextInt();
		int M = scan.nextInt();

		Integer[] A = new Integer[N];

		int sum = 0;

		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
			sum += A[i];
		}

		Arrays.sort(A, Comparator.reverseOrder());

		int Mth = A[M-1];

		System.out.println(Mth >= sum /(4.0 * M) ? "Yes" : "No");
	}
}