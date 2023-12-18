import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * ABC157
 */
public class Main {

	public static void main(String[] args) throws Exception {
		Main main = new Main();

		try (Scanner scan = new Scanner(System.in)) {
			main.bingo(scan);
		}
	}

	private void bingo(Scanner scan) {
		int[][] a = IntStream.range(0, 3)
			.mapToObj(i -> IntStream.range(0, 3).map(i2 -> scan.nextInt()).toArray())
			.toArray(int[][]::new);
		int n = scan.nextInt();
		int[] b = IntStream.range(0, n).map(i -> scan.nextInt()).toArray();
		List<Pair<Integer, Integer>> hit = new ArrayList<>();

		for (int i : b) {
			for (int i2 = 0; i2 < a.length; i2++) {
				for (int i3 = 0; i3 < a[i2].length; i3++) {
					if (i == a[i2][i3]) {
						hit.add(new Pair<Integer, Integer>(i2, i3));
					}
				}
			}
		}

		// 横
		if (IntStream.range(0, 3).anyMatch(i -> hit.stream().filter(i2 -> i2.left == i).count() == 3)) {
			System.out.println("Yes");
			return;
		}
		// 縦
		if (IntStream.range(0, 3).anyMatch(i -> hit.stream().filter(i2 -> i2.right == i).count() == 3)) {
			System.out.println("Yes");
			return;
		}
		// 斜め (0, 0) -> (2, 2)
		if (hit.stream().filter(i -> i.left == i.right).count() == 3) {
			System.out.println("Yes");
			return;
		}
		// 斜め (0, 2) -> (2, 0)
		if (hit.stream().filter(i -> i.left == 2 - i.right).count() == 3) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
 	}

	@SuppressWarnings("unused")
	private void duplexPrinting(Scanner scan) {
		int n = scan.nextInt();

		System.out.println(n / 2 + n % 2);

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
