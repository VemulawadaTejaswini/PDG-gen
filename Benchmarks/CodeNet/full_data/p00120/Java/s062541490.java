import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}

			String s[] = sc.nextLine().split(" ");
			if (f(s, n, new int[s.length - 1], 1)) {
				System.out.println("OK");
			} else {
				System.out.println("NA");
			}
		}
	}

	public static boolean f(String s[], int length, int a[], int k) {
		int n = a.length;
		if (n < k) {
			double sum = 0.0;
			sum += Integer.valueOf(s[1]) / 2.0;
			sum += Integer.valueOf(s[n]) / 2.0;
			for (int i = 2; i <= n; i++) {
				int r1 = Integer.valueOf(s[i - 1]);
				int r2 = Integer.valueOf(s[i]);
				sum += Math.sqrt(Math.pow(r1 + r2, 2) - Math.pow(Math.abs(r1 - r2), 2));
			}
			if (sum <= length) {
				return true;
			} else {
				return false;
			}
		}
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				a[i] = k;
				if (f(s, length, a, k + 1)) {
					return true;
				}
				a[i] = 0;
			}
		}
		return false;
	}
}