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
		@SuppressWarnings("unchecked")
		ArrayList<Item>[] edge = new ArrayList[N + 1];
		for (int i = 0; i < N - 1; i++) {
			int src = sc.nextInt();
			int dst = sc.nextInt();
			int cost = sc.nextInt() % 2 + 2;
			if (edge[src] == null) {
				edge[src] = new ArrayList<Item>();
			}
			edge[src].add(new Item(dst, cost));
			if (edge[dst] == null) {
				edge[dst] = new ArrayList<Item>();
			}
			edge[dst].add(new Item(src, cost));
		}

		int[] C = new int[N + 1];
		Arrays.fill(C, -1);
		PriorityQueue<Item> que = new PriorityQueue<Item>();
		que.add(new Item(1, 0));
		while (que.size() > 0) {
			Item item = que.poll();
			if (C[item.id] < 0) {
				C[item.id] = item.cost;
				if (edge[item.id] != null) {
					for (Item item2 : edge[item.id]) {
						int nextId = item2.id;
						if (C[nextId] < 0) {
							int nextCost = item.cost + item2.cost;
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
