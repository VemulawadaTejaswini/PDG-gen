import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long K = sc.nextLong();
		long[] A = new long[N];
		long[] B = new long[M];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		for (int i = 0; i < M; i++) {
			B[i] = sc.nextLong();
		}
		int pa = 0;
		int pb = 0;
		long sum = 0;
		long ans = 0;
		while (sum <= K) {
			if (pa < N && pb < M) {
				if (A[pa] < B[pb]) {
					sum += A[pa];
					pa++;
				} else {
					sum += B[pb];
					pb++;
				}
				ans++;
			} else if (pa >= N && pb < M) {
				sum += B[pb];
				pb++;
				ans++;
			} else if (pa < N && pb >= M) {
				sum += A[pa];
				pa++;
				ans++;
			} else {
				break;
			}
		}
		if (sum > K) {
			ans--;
		}
		System.out.println(ans);
	}

}
