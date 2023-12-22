import java.util.Scanner;

public class Main {
	boolean check(char[] a, char[] b) {
		for (int i = 0; i < 8; i++) {
			if (a[i] != '*' && a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}

			char[][] c = new char[n][];
			int[] d = new int[n];
			for (int i = 0; i < n; i++) {
				c[i] = sc.next().toCharArray();
				d[i] = sc.nextInt();
			}
			char[][] e = new char[m][];
			for (int i = 0; i < m; i++) {
				e[i] = sc.next().toCharArray();
			}

			int sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (check(c[i], e[j])) {
						sum += d[i];
					}
				}
			}

			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}