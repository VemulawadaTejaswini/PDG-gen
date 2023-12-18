import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		PriorityQueue pq = new PriorityQueue();
		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			pq.add(-temp);
		}
		sc.close();

		for (int i = 1; i <= M; i++) {
			int max = -(int) pq.poll();
			//System.out.println(max + "->" + max / 2);
			pq.add(-max / 2);
		}

		long sum = 0;
		while (!pq.isEmpty()) {
			//System.out.println(pq.peek());
			sum += -(int) pq.poll();
		}
		System.out.println(sum);

	}
}