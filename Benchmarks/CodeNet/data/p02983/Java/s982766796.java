import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int l = Integer.parseInt(sc.next());
		int r = Integer.parseInt(sc.next());

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int i = l; i <= r; i++) {
			pq.add(i % 2019);
		}

		System.out.println(pq.poll() * pq.poll());
	}
}