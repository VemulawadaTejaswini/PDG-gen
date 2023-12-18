import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int[] a = new int[n];
			IntStream.range(0, n).forEach(i -> a[i] = scanner.nextInt());
			Arrays.sort(a);
			IntStream.range(0, m).forEach(i -> {
				a[n - 1] /= 2;
				resort(a);
			});
			System.out.println(Arrays.stream(a).mapToLong(i -> (long) i).sum());
		}
	}

	/**
	 * aを再度ソートする
	 * 
	 * @param a
	 */
	private static void resort(int[] a) {
		int n = a.length;
		int max = a[n - 1];
		int index = Arrays.binarySearch(a, 0, n - 1, max);
		if (index >= 0) {
			for (int i = n - 2; i > index; i--) {
				a[i + 1] = a[i];
			}
			a[index + 1] = max;
		} else {
			index = -index - 1;
			for (int i = n - 2; i >= index; i--) {
				a[i + 1] = a[i];
			}
			a[index] = max;
		}
	}
}
