import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * ABC155
 */
public class Main {

	public static void main(String[] args) throws Exception {
		Main main = new Main();

		try (Scanner scan = new Scanner(System.in)) {
			main.poll(scan);
		}
	}

	private void poll(Scanner scan) {
		int n = scan.nextInt();
		HashMap<String, Integer> counts = IntStream.range(0, n)
			.mapToObj(i -> scan.next())
			.collect(Collectors.toMap(i -> i, i -> 1, (v1, v2) -> v1 + v2, () -> new HashMap<>()));

		int max = counts.entrySet().stream().mapToInt(i2 -> i2.getValue()).max().getAsInt();

		counts.entrySet().stream()
			.filter(i -> i.getValue() >= max)
			.sorted(Comparator.comparing(i -> i.getKey()))
			.map(i -> i.getKey())
			.forEachOrdered(System.out::println);
	}

	@SuppressWarnings("unused")
	private void paperPlease(Scanner scan) {
		int n = scan.nextInt();
		System.out.println(IntStream.range(0, n)
			.map(i -> scan.nextInt())
			.allMatch(i -> i % 2 != 0 || i % 3 == 0 || i % 5 == 0) ? "APPROVED" : "DENIED");
	}

	@SuppressWarnings("unused")
	private void poor(Scanner scan) {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if (a == b) {
			if (b == c){
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		} else if (a == c) {
			System.out.println("Yes");
		} else if (b == c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	@SuppressWarnings("unused")
	private static class Pair<T1, T2> {

		private T1 left;
		private T2 right;

		public Pair(T1 left, T2 right) {
			this.left = left;
			this.right = right;
		}

		public T1 left() {
			return left;
		}

		public T2 right() {
			return right;
		}
	}


	@SuppressWarnings("unused")
	private static class UnionFindTree {
		private List<Integer> parents;

		public static UnionFindTree initialize(int n) {
			return new UnionFindTree(n);
		}

		public UnionFindTree(int n) {
			parents = IntStream.range(0, n).boxed().collect(Collectors.toCollection(() -> new ArrayList<>()));
		}

		public int find(int index) {
			if (index == parents.get(index)) {
				return index;
			}
			// 自分の親の親は自分の親とできるため経路圧縮
			parents.set(index, find(parents.get(index)));
			return parents.get(index);
		}

		public void union(int x, int y) {
			int xParent = find(x);
			int yParent = find(y);
			parents.set(yParent, xParent);
		}

		public long size() {
			return parents.stream().map(i -> find(i)).distinct().count();
		}
	}

}
