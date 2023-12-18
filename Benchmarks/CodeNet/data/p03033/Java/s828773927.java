import java.util.*;

public class Main {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static<T> void printArrayLT(List<T> a) {
		for (T t : a) {
			System.out.print(t + ", ");
		}
		System.out.println();
	}

	public enum Event {
		Block, Unblock, Walk,
	}

	public static final class Item implements Comparable<Item> {
		public int time, X;
		public Event event;
		public Item(int time, Event event, int X) {
			this.time = time;
			this.event = event;
			this.X = X;
		}

		@Override
		public int compareTo(Item o) {
			int x = this.X - o.X;
			if (x != 0) {
				return x;
			}
			return this.event.compareTo(o.event);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 2 * 10^5
		int Q = sc.nextInt(); // 2 * 10^5

		ArrayList<Item> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int s = sc.nextInt(); // 10^9
			int t = sc.nextInt(); // 10^9
			int x = sc.nextInt(); // 10^9
			list.add(new Item(s - x, Event.Block, x));
			list.add(new Item(t - x, Event.Unblock, x));
		}
		for (int i = 0; i < Q; i++) {
			int d = sc.nextInt(); // 10^9
			list.add(new Item(d, Event.Walk, i));
		}
		Collections.sort(list);
		int[] answers = new int[Q];
		TreeSet<Integer> blocks = new TreeSet<Integer>();

		for (Item item : list) {
			if (item.event == Event.Block) {
				blocks.add(item.X);
			}
			if (item.event == Event.Unblock) {
				blocks.remove(item.X);
			}
			if (item.event == Event.Walk) {
				answers[item.X] = blocks.first();
			}
		}
		for (int x : answers) {
			System.out.println(x);
		}
	}
}
