import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int t[], b[];
		int a[];

		n = sc.nextInt();
		while (n != 0) {
			t = new int[n];
			b = new int[n];
			a = new int[n];
			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				a[i] = 0;
			}
			if (f(t, b, n, a, 0)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			n = sc.nextInt();
		}
	}

	public static boolean f(int t[], int b[], int n, int a[], int sum) {
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			return true;
		}

		for (int i = 0; i < n; i++) {
			if (a[i] == 0 && sum + t[i] <= b[i]) {
				a[i] = 1;
				if (f(t, b, n, a, sum + t[i])) {
					return true;
				}
				a[i] = 0;
			}
		}
		return false;
	}
}