import java.util.Scanner;

public class Main {

	public static final long IMAX = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		long K = Long.parseLong(sc.next());
		int[] A = new int[N];
		int idx;
		for (idx = 0; idx < N; idx++) {
			A[idx] = Integer.parseInt(sc.next());
		}
		sc.close();

		long cnt = 0;
		long sum = 0;
		long numP, numN;

		int inIdx;
		for (idx = 0; idx < N; idx++) {
			numP = 0;
			numN = 0;
			for (inIdx = 0; inIdx < N; inIdx++) {
				if (idx > inIdx) {
					// 基準より前
					if (A[idx] > A[inIdx]) {
						++numP;
					}
				} else if (idx < inIdx) {
					// 基準より後
					if (A[idx] > A[inIdx]) {
						++numN;
					}
				}
			}
			if (K % 2 == 0) {
				// Kが偶数
				// 前たす
				sum = (K/2) * (K-1) % IMAX * numP % IMAX;
				cnt += sum;
				// 後ろたす
				sum = (K+1) * (K/2) % IMAX * numN % IMAX;
				cnt += sum;
			} else {
				// Kが奇数
				// 前たす
				sum = K * ((K-1)/2) % IMAX * numP % IMAX;
				cnt += sum;
				// 後ろたす
				sum = ((K+1)/2) * K % IMAX * numN % IMAX;
				cnt += sum;
			}

			// あまり
			if (cnt >= IMAX) {
				cnt = cnt % IMAX;
			}
		}

		System.out.println(cnt);

	}

}
