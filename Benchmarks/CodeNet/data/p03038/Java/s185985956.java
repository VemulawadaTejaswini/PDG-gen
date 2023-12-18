import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		long sum = 0;

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 1; i < M + 1; i++) {
			int Bi = sc.nextInt();
			int Ci = sc.nextInt();

			for (int j = 0; j < Bi; j++) {
				int minIdx = minIdxOfArray(A);
				if (A[minIdx] < Ci) {
					A[minIdx] = Ci;
				} else {
					break;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			sum += A[i];
		}
		System.out.println(sum);
	}

	//配列の中の値の最小値を求めるメソッド
	public static int minIdxOfArray(int[] a) {
		int c = a[0];
		int idx = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < c) {
				c = a[i];
				idx = i;
			}
		}
		return idx;
	}

}