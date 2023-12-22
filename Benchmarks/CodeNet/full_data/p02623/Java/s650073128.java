import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long K = sc.nextLong();
		Queue<Long> A = new ArrayDeque<Long>();
		for (int i = 0; i < N; i++) {
			A.offer(sc.nextLong());
		}
		Queue<Long> B = new ArrayDeque<Long>();
		for (int i = 0; i < M; i++) {
			B.offer(sc.nextLong());
		}
		sc.close();

		long time = 0;
		int cnt = 0;
		while (true) {
			// 全て見終わったらbreak
			if (A.isEmpty() && B.isEmpty()) {
				break;
			}

			long a = Long.MAX_VALUE;
			if (!A.isEmpty()) {
				a = A.peek();
			}
			long b = Long.MAX_VALUE;
			if (!B.isEmpty()) {
				b = B.peek();
			}
			// 時間を超えたらNG
			if (time + a > K && time + b > K) {
				break;
			}

			cnt++;
			if (a <= b) {
				time += A.poll();
			} else {
				time += B.poll();
			}
		}

		System.out.println(cnt);
	}
}
