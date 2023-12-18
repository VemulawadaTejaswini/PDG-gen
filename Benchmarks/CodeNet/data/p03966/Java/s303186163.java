import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int t = scanner.nextInt();
		int a = scanner.nextInt();
		for (int i = 0; i < N - 1; i++) {
			// t[i] = scanner.nextInt();
			// a[i] = scanner.nextInt();
			int q = scanner.nextInt();
			int w = scanner.nextInt();
			int j = 1;
			int e = q;
			int r = w;
			while (!(t <= e && a <= r)) {
				j++;
				e = q * j;
				r = w * j;
			}
			t = e;
			a = r;
		}
		System.out.println(a + t);

	}
}
