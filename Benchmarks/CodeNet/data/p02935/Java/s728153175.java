import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		PriorityQueue<Double> pq = new PriorityQueue<Double>();
		for (int i = 0; i < n; i++) {
			pq.add(sc.nextDouble());
		}

		while (pq.size() > 1) {
			pq.add((pq.poll() + pq.poll()) / 2);
		}
		System.out.println(pq.peek());
		sc.close();
	}

}
