import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int t[], b[];
		int a[];
		int sum;
		boolean flag;

		n = sc.nextInt();
		while (n != 0) {
			flag = true;
			t = new int[n];
			b = new int[n];
			a = new int[n];
			sum = 0;
			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
				b[i] = sc.nextInt();
				if (b[i] < t[i]) {
					flag = false;
				}
				sum += t[i];
			}
			if (flag) {
				flag = false;
				for (int i = 0; i < n; i++) {
					if (sum < b[i]) {
						flag = true;
					}
				}
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