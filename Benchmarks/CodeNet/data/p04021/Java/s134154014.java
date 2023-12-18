import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int[] B = Arrays.copyOf(A, A.length);
		Arrays.sort(B);
		long ans = 0;
		for (int i = 0; i < N; i++) {
			int idx = Arrays.binarySearch(B, A[i]);
			if (Math.abs(idx - i) % 2 == 1)
				ans++;
		}
		System.out.println(ans / 2);

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
