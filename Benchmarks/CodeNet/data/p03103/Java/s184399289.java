import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long money = 0;

		int[] A = new int[N];
		int[] B = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}

		while (M > 0) {
			int Amidx = minIdx(A);
			if (B[Amidx] > M) {
				money += A[Amidx] * M;
				M = 0;
			} else {
				money += ((long) A[Amidx] * (long) B[Amidx]);
				A[Amidx] = 1000000000;
				M -= B[Amidx];
			}
		}

		System.out.println(money);
	}

	static int minIdx(int[] a) {
		int idx = 0;
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				idx = i;
				min = a[i];
			}
		}
		return idx;
	}
}
