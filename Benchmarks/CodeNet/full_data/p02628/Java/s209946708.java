import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		// top k in maxheap (store min elements)
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			// System.out.println("val: " + val);
			if (maxHeap.size() < k) {
				maxHeap.offer(val);
			} else {
				if (val < maxHeap.peek()) {
					maxHeap.poll();
					maxHeap.offer(val);
				}
			}
		}

		int ans = 0;
		while (!maxHeap.isEmpty()) {
			ans += maxHeap.poll();
		}
		System.out.println(ans);
	}

}
