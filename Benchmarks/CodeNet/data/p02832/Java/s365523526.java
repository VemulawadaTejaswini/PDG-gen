import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		sc.close();

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] != i + 1 - count) {
				count++;
			}
		}
		System.out.println(count < n ? count : -1);
	}
}
