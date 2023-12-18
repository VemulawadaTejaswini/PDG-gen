
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());

		long[] V = new long[N + 1];
		for (int i = 1; i <= N; i++) {
			V[i] = Long.parseLong(sc.next());
		}

		sc.close();

		long max = 0;
		for (int L = 0; L <= K; L++) {
			for (int R = 0; R <= Math.min(K, N) - L; R++) {
				long sum = 0;
				PriorityQueue<Long> pq = new PriorityQueue<Long>();
				for (int l = 1; l <= L; l++) {
					sum += V[l];
					pq.add(V[l]);
				}
				for (int r = 1; r <= R; r++) {
					int i = N - r + 1;
					sum += V[i];
					pq.add(V[i]);
				}
//				System.out.println("L:" + L + "R:" + R + "sum:" + sum);

				for (int d = 1; d <= K - L - R; d++) {
					if(pq.peek() == null) break;
					long i = pq.poll();
					if (i >= 0) {
						break;
					} else {
						sum -= i;
					}
				}
//				System.out.println(sum);

				if(sum > max) max = sum;

			}
		}

		System.out.println(max);

	}
}
