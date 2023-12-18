import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		PriorityQueue<Long> pq = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			pq.offer(sc.nextLong());
		}

		while (m-- > 0) {
			int b = sc.nextInt();
			long c = sc.nextLong();
			for (int i = 0; i < b; i++) {
				if (pq.peek() < c) {
					pq.poll();
					pq.offer(c);
				} else {
					break;
				}
			}
		}

		long a = 0;
		while (!pq.isEmpty()) {
			a += pq.poll();
		}
		System.out.println(a);
	}
}
