import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long K = sc.nextLong();
		long[] A = new long[N];
		long[] B = new long[M];
		long aSum = 0;
		for (int i = 0; i < N; i++) {
			long tmp = sc.nextLong();
			A[i] = tmp;
			aSum += tmp;
		}
		for (int i = 0; i < M; i++) {
			long tmp = sc.nextLong();
			B[i] = tmp;
		}
		int bPos = 0;
		if (aSum <= K) {
			while (bPos < B.length) {
				if (aSum + B[bPos] <= K) {
					aSum += B[bPos];
					bPos++;
				} else {
					break;
				}
			}
		}
		int res = aSum <= K ? N + bPos : 0;
		for (int i = N - 1; i >= 0; i--) {
			aSum -= A[i];
			if (aSum > K) {
				continue;
			}
			while (bPos < B.length) {
				if (aSum + B[bPos] <= K) {
					aSum += B[bPos];
					bPos++;
				} else {
					break;
				}
			}
			if (res < i + bPos) {
				res = i + bPos;
			}
		}
		System.out.println(res);
	}
}