import java.util.*;

public class Main {
	public static void printArray(int[] a, int N) {
		for (int i = 0; i < N; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] exp = new int[N];

		for (int i = 0; i < N; i++) {
			int v = i + 1;
			exp[i] = Math.max((int)Math.ceil(Math.log(1.0 * K / v) / Math.log(2)), 1);
		}

		// printArray(exp, N);

		double sum = 0;
		for (int i = 0; i < N; i++) {
			sum += Math.pow(2, exp[0] - exp[i]);
		}
		double X = Math.pow(2, exp[0]) * N;
		// System.out.println(sum);
		// System.out.println(X);
		sum = sum / X;
		// System.out.println(sum);
		if (N > K) {
			sum = sum * K / N;
			sum += (((double)N) - K) / N;
		}
		System.out.println(sum);
	}
}
