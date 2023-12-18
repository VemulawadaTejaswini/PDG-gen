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
			int count = 0;
			while (pq.peek() > c && count < b) {
				pq.poll();
				count++;
			}
			while (count-- > 0) pq.offer(c);
		}

		long a = 0;
		while (!pq.isEmpty()) {
			a += pq.poll();
		}
		System.out.println(a);
	}
}
