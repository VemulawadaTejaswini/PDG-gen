import java.util.Scanner;

public class Main {

	int n;
	int[] a, s;

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			a = new int[n];
			s = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				s[i] = a[i];
				if (i > 0) {
					s[i] += s[i - 1];
				}
			}
			System.out.println(fnc());
		}
	}

	String fnc() {
		long cnt = 0L;

		for (int i = 0; i < n; i++) {
			if (s[i] == 0) {
				cnt++;
			}
			for (int j = i + 1; j < n; j++) {
				if (s[j] == 0) {
					cnt++;
				}
				s[j] -= a[i];
			}
		}

		return "" + cnt;
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
