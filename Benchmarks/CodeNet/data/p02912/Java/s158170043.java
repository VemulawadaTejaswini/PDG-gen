import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), m = scan.nextInt();
		long count = 0;
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		Arrays.sort(array);

		for (int i = 0; i < m; i++) {
			array[n - 1] = array[n - 1] / 2;
			Arrays.sort(array);
		}
		for (int i = 0; i < n; i++) {
			count += array[i];
		}

		System.out.println(count);
	}
}