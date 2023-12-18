import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int[] A = new int[N + 1];
		int[] B = new int[N];
		int idx;
		for (idx = 0; idx < N + 1; idx++) {
			A[idx] = Integer.parseInt(sc.next());
		}
		for (idx = 0; idx < N; idx++) {
			B[idx] = Integer.parseInt(sc.next());
		}

		long defeated = 0;
		// 勇者は手前から全力を尽くす
		for (idx = 0; idx < N; idx++) {
			// 手前の街
			if (A[idx] < B[idx]) {
				defeated += A[idx];
				B[idx] = B[idx] - A[idx];
				// 次の街
				if (A[idx + 1] < B[idx]) {
					defeated += A[idx + 1];
					A[idx + 1] = 0;
				} else {
					defeated += B[idx];
					A[idx + 1] = A[idx + 1] - B[idx];
				}
			} else {
				defeated += B[idx];
			}
		}

		System.out.println(defeated);
	}

}
