import java.util.*;

public class Main {

	static class Item implements Comparable<Item> {
		public int cost;
		public int id;

		public Item(int id, int cost) {
			this.id = id;
			this.cost = cost;
		}

		@Override
		public int compareTo(Item that) {
			return this.cost - that.cost;
		}
	}

	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] u = new int[N - 1];
		int[] v = new int[N - 1];
		int[] w = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			u[i] = sc.nextInt();
			v[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}

		int[] C = new int[N + 1];
		Arrays.fill(C, -1);
		PriorityQueue<Item> que = new PriorityQueue<Item>();
		que.add(new Item(1, 0));
		while (que.size() > 0) {
			Item item = que.poll();
			// System.out.println("id = " + item.id + ", cost = " + item.cost);
			if (C[item.id] < 0) {
				C[item.id] = item.cost;
				for (int i = 0; i < N - 1; i++) {
					if (u[i] == item.id) {
						int nextId = v[i];
						int nextCost = item.cost + w[i];
						if (C[nextId] < 0) {
							// System.out.println("nextId = " + nextId + ", nextCost = " + nextCost);
							que.add(new Item(nextId, nextCost));
						}
					}
				}
				for (int i = 0; i < N - 1; i++) {
					if (v[i] == item.id) {
						int nextId = u[i];
						int nextCost = item.cost + w[i];
						if (C[nextId] < 0) {
							que.add(new Item(nextId, nextCost));
						}
					}
				}
			}
		}
		// printArray(C);
		for (int i = 1; i <= N; i++) {
			System.out.println(C[i] % 2 == 0 ? 0 : 1);
		}
	}
}
