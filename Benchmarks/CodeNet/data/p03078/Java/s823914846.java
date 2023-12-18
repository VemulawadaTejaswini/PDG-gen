import java.util.*;

public class Main {

	private static class SizedPriorityQueue<T> extends PriorityQueue<T> {
		int max;

		public SizedPriorityQueue(int max) {
			this.max = max;
		}

		@Override
		public boolean add(T t) {
			boolean a = super.add(t);
			if (super.size() > max) super.poll();
			return a;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int k = sc.nextInt();

		long[] a = new long[x];
		long[] b = new long[y];
		long[] c = new long[z];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLong();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextLong();
		}
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.nextLong();
		}

		PriorityQueue<Long> pq = new SizedPriorityQueue<>(k);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				pq.add(a[i] + b[j]);
			}
		}

		PriorityQueue<Long> pq2 = new SizedPriorityQueue<>(k);
		for (long t : pq) {
			for (long i : c) {
				pq2.add(i + t);
			}
		}

		List<Long> answer = new ArrayList<>(pq2);
		Collections.sort(answer, Comparator.reverseOrder());
		for (long i : answer) System.out.println(i);
	}


}
