import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		PriorityQueue<Double> pq = new PriorityQueue<Double>(N, Collections.reverseOrder());
		for (int i = 0; i < N; i++) {
			pq.add((double) sc.nextLong());
		}
		sc.close();

		long cnt = 1;
		while (cnt <= K) {
			double num = pq.poll();
			pq.add(num / 2.0);
			pq.add(num / 2.0);
			cnt++;
		}

		if (K % 2 == 0) {
			System.out.println((long) Math.ceil(pq.poll()));
		} else {
			double max = pq.poll();
			double next = pq.poll();
			System.out.println((long) Math.ceil(Math.max(max * 2 / 3, next)));
		}
	}
}
