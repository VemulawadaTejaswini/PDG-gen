import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int K;
	static int[] A;
	static int[] B;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		A = new int[N];
		B = new int[M];
		for (int i = N - 1; i > 0; i--) {
			A[i] = sc.nextInt();
		}
		for (int i = M - 1; i > 0; i--) {
			B[i] = sc.nextInt();
		}

		int result = maxCnt(N, M, K);

		System.out.println(result);
	}

	static int maxCnt(int resA, int resB, int resK) {
		if (resA == 0 && resB == 0) {
			return 0;
		} else if (resA == 0) {
			if (B[resB - 1] > resK) {
				return 0;
			} else {
				return maxCnt(resA, resB - 1, resK - B[resB - 1]) + 1;
			}
		} else if (resB == 0) {
			if (A[resA - 1] > resK) {
				return 0;
			} else {
				return maxCnt(resA - 1, resB, resK - A[resA - 1]) + 1;
			}
		} else {
			if (A[resA - 1] > resK && B[resB - 1] > resK) {
				return 0;
			} else if (A[resA - 1] > resK) {
				return maxCnt(resA, resB - 1, resK - B[resB - 1]) + 1;
			} else if (B[resB - 1] > resK) {
				return maxCnt(resA - 1, resB, resK - A[resA - 1]) + 1;
			} else {
				return Math.max(maxCnt(resA, resB - 1, resK - B[resB - 1]),
						maxCnt(resA - 1, resB, resK - A[resA - 1])) + 1;
			}
		}
	}
}
