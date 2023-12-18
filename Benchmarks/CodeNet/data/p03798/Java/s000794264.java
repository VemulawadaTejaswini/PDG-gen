import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		char[] s = sc.nextLine().toCharArray();
		char[] a = new char[n];

		for (int i = 0; i < 4; i++) {
			Arrays.fill(a, 'X');
			if (i % 2 == 1) {
				a[0] = 'S';
			} else {
				a[0] = 'W';
			}

			if ((i >> 1) % 2 == 1) {
				a[1] = 'S';
			} else {
				a[1] = 'W';
			}

			for (int j = 1; j < n - 1; j++) {
				if (s[j] == 'o') {
					if (a[j] == 'S') {
						a[(j + 1) % n] = a[j - 1];
					} else {
						a[(j + 1) % n] = a[j - 1] == 'S' ? 'W' : 'S';
					}
				} else {
					if (a[j] == 'S') {
						a[(j + 1) % n] = a[j - 1] == 'S' ? 'W' : 'S';
					} else {
						a[(j + 1) % n] = a[j - 1];
					}
				}
			}

			boolean valid = true;
			if (s[n - 1] == 'o') {
				if (a[n - 1] == 'S') {
					valid = a[n - 2] == a[0];
				} else {
					valid = a[n - 2] != a[0];
				}
			} else {
				if (a[n - 1] == 'S') {
					valid = a[n - 2] != a[0];
				} else {
					valid = a[n - 2] == a[0];
				}
			}
			if (!valid) continue;

			if (s[0] == 'o') {
				if (a[0] == 'S') {
					valid = a[n - 1] == a[1];
				} else {
					valid = a[n - 1] != a[1];
				}
			} else {
				if (a[0] == 'S') {
					valid = a[n - 1] != a[1];
				} else {
					valid = a[n - 1] == a[1];
				}
			}

			if (valid) {
				System.out.println(a);
				return;
			}
		}

		System.out.println(-1);
	}
}
