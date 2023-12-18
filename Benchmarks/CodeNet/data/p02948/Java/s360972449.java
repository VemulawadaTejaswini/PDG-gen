import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Work[] works = new Work[n];
		for (int i = 0; i < n; i++) {
			works[i] = new Work(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(works, new Comparator<Work>() {
		public int compare(Work w1, Work w2) {
			if (w1.a == w2.a) {
				return w2.b - w1.b;
			} else {
				return w2.a - w1.a;
			}
		}
		});
		PriorityQueue<Work> queue = new PriorityQueue<Work>(new Comparator<Work>() {
		public int compare(Work w1, Work w2) {
			return w1.b - w2.b;
		}
		});
		int total = 0;
		int idx = 0;
		for (int i = 0; i <= m; i++) {
			while (idx < n && works[idx].a + i > m) {
				Work x = queue.peek();
				if (x != null && x.b < works[idx].b) {
					total -= x.b;
					total += works[idx].b;
					queue.poll();
					queue.add(works[idx]);
				}
				idx++;
			}
			if (idx >= n) {
				break;
			}
			if (i >= m) {
				break;
			}
			total += works[idx].b;
			queue.add(works[idx]);
			idx++;
		}
		System.out.println(total);
	}
	
	static class Work {
		int a;
		int b;
		public Work(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
}
