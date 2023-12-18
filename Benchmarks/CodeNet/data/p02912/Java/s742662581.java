import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), m = scan.nextInt();
		long count = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
		for (int i = 0; i < n; i++) {
			pq.add(scan.nextInt());
		}

		for (int i = 0; i < m; i++) {
			pq.add(pq.poll() / 2);
		}
		for (int i = 0; i < n; i++) {
			count += pq.poll();
		}

		System.out.println(count);
	}
}
