import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = scanner.nextInt();
		}
		Arrays.parallelSort(v);
		long sum = 0;
		for (int i = n - 1; i > 1; i--) {
			sum += v[i];
			sum <<= 1;
		}
		sum += v[0] + v[1];
		System.out.println((double) sum / (1l << (n - 1)));

	}
}