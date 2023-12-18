import java.util.*;

class Solution {

	public static void main() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		PriorityQueue<Double> queue = new PriorityQueue<>();
		for (int i = 0; i < x; i++) {
			queue.add(sc.nextDouble());
		}

		while (queue.size() != 1) {
			Double a = queue.poll();
			Double b = queue.poll();
			queue.add((a + b) / 2);
		}

		System.out.println(queue.poll());

	}

}
