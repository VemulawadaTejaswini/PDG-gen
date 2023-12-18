import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void solve() throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		String b = new String();
		b = a[0] + " ";
		if (n % 2 == 0) {
			for (int i = 1; i < (n - 2) / 2 + 1; i++) {
				b = a[2 * i - 1] + " " + b + a[2 * i] + " ";
			}
			b = a[n - 1] + " " + b;
		} else {
			for (int i = 1; i < (n - 1) / 2 + 1; i++) {
				b = a[2 * i] + " " + b + a[2 * i - 1] + " ";
			}
		}
		System.out.println(b);
	}

	public static void main(String[] args) {
		try {
			solve();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}