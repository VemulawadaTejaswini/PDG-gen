import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		if (n == 1) {
			System.out.println(1);
			return;
		}

		int ans = 1;
		int base = 0;
		for (int i = 1; i < n; i++) {
			int d = a[i] - a[i - 1];
			if (d > 0) {
				if (base < 0) {
					ans++;
					base = 0;
				} else {
					base = 1;
				}
			} else if (d < 0) {
				if (base > 0) {
					ans++;
					base = 0;
				} else {
					base = -1;
				}
			}
		}
		System.out.println(ans);
	}
}
