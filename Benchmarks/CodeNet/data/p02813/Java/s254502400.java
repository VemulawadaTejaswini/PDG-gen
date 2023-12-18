import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		int[] q = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		sc.close();

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		create(n, new ArrayList<Integer>(), list);
		int pi = getIndex(list, p);
		int qi = getIndex(list, q);
		System.out.println(Math.abs(pi - qi));
	}

	public static void create(int n, List<Integer> numbers, List<List<Integer>> list) {
		if (numbers.size() == n) {
			list.add(numbers);
		}

		for (int i = 1; i <= n; i++) {
			if (!numbers.contains(i)) {
				List<Integer> newNumbers = new ArrayList<Integer>(numbers);
				newNumbers.add(i);
				create(n, newNumbers, list);
			}
		}
	}

	public static int getIndex(List<List<Integer>> list, int[] p) {
		for (int i = 0; i < list.size(); i++) {
			boolean check = true;
			for (int j = 0; j < list.get(i).size(); j++) {
				if (list.get(i).get(j) != p[j]) {
					check = false;
					break;
				}
			}
			if (check) {
				return i;
			}
		}

		return -1;
	}
}
