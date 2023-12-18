import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long N = scanner.nextLong();
		long x = scanner.nextLong();
		long[] a = new long[(int) N];
		for (int i = 0; i < N; i++) {
			a[i] = scanner.nextLong();
		}
		scanner.close();

		long time = 0;
		for (int i = 0; i < N; i++) {
			long min = Long.MAX_VALUE;
			for (int j = 0; j < N; j++) {
				if (i == j) {

					min = Math.min(a[j], min);
				} else if (j < i) {
					min = Math.min(a[j] + (i - j) * x, min);
				} else {
					min = Math.min(a[j]+(N+i-j)*x,min);
				}
			}
			time += min;
		}
		System.out.println(time);
	}
}
