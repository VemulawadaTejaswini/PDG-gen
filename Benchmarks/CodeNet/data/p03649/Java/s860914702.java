import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Long> queue = new PriorityQueue<Long>(new Comparator<Long>() {
		public int compare(Long lon1, Long lon2) {
			if (lon1.longValue() < lon2.longValue()) {
				return 1;
			} else if (lon1.longValue() > lon2.longValue()) {
				return -1;
			} else {
				return 0;
			}
		}
		});
		PriorityQueue<Long> next = new PriorityQueue<Long>(new Comparator<Long>() {
		public int compare(Long lon1, Long lon2) {
			if (lon1.longValue() < lon2.longValue()) {
				return 1;
			} else if (lon1.longValue() > lon2.longValue()) {
				return -1;
			} else {
				return 0;
			}
		}
		});
		for (int i = 0; i < n; i++) {
			queue.add(sc.nextLong());
		}
		long count = 0;
		while (true) {
			long x = queue.poll();
			if (x < n) {
				break;
			}
			long ans = x / n;
			next.add(x % n);
			while (queue.size() >  0) {
				next.add(queue.poll() + ans);
			}
			count += ans;
			PriorityQueue<Long> tmp = next;
			next = queue;
			queue = tmp;
		}
		System.out.println(count);
	}
	
}
