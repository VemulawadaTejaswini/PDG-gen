import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		long x = 0;
		boolean y = false;
		for (int i = 0; i < N; i++) {
			a[i] = scanner.nextInt();
			x += a[i];
		}
		for (int i = 0; i < N; i++) {
			b[i] = scanner.nextInt();
			if (a[i] != b[i]) {
				y = true;
			}
			x -= b[i];
		}
		if (x == 0 && y) {
			System.out.println("No");
			return;
		}
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				while (a[j] < b[j]) {
					a[i] += 2;
					b[j] += 1;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			if (a[i] != b[i]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
