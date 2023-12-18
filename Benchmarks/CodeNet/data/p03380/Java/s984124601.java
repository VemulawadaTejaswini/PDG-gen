import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			IntStream.range(0, n).forEach(i -> a[i] = scanner.nextInt());
			Arrays.sort(a);
			int max = a[n - 1];
			for (int i = max / 2; i >= 0; i--) {
				int index = Arrays.binarySearch(a, i);
				if (index >= 0) {
					System.out.println(max + " " + i);
					return;
				}
				index = Arrays.binarySearch(a, max - i);
				if (index >= 0) {
					System.out.println(max + " " + (max - i));
					return;
				}
			}
		}
	}
}
