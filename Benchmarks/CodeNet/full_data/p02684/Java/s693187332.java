import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			long k = scanner.nextLong();
			int[] a = new int[n];
			IntStream.range(0, n).forEach(i -> a[i] = scanner.nextInt() - 1);
			List<Integer> list = new ArrayList<>();
			// containsを計算用
			Set<Integer> set = new HashSet<>();
			list.add(0);
			set.add(0);
			int index = 0, count = 0;
			while (!set.contains(a[index])) {
				list.add(a[index]);
				set.add(a[index]);
				count++;
				if (k == count) {
					System.out.println(a[index] + 1);
					return;
				}
				index = a[index];
			}
			int start = list.indexOf(a[index]);
			System.out.println(list.get(start + (int) ((k - list.size()) % (list.size() - start))) + 1);
		}
	}
}
