import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			long k = scanner.nextLong();
			int[] a = new int[n];
			IntStream.range(0, n).forEach(i -> a[i] = scanner.nextInt() - 1);
			List<Integer> list = new ArrayList<>();
			list.add(0);
			int index = 0;
			while (!list.contains(a[index])) {
				list.add(a[index]);
				index = a[index];
			}
			if (k >= list.size()) {
				int start = list.indexOf(a[index]);
				System.out.println(list.get(start + (int) ((k - list.size()) % (list.size() - start))) + 1);
			} else {
				System.out.println(list.get((int) k) + 1);
			}
		}
	}
}
