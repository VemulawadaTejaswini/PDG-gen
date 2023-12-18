import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		solve(s);
		s.close();
	}

	public static void solve(Scanner s) {
		int n = s.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		int count = 0;

		for (int i = 0; i < n; i++) {
			int j = a[i];
			if (i == a[j - 1] - 1) {
				count++;
			}
		}

		System.out.println(count / 2);
	}
}