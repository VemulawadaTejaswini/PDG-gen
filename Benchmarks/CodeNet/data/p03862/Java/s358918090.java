import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		int a[] = new int[n];
		int count = 0;
		int mod = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int j = 0; j < n - 1; j++) {
			mod = (a[j] + a[j + 1]) - x;
			if (mod > 0) {
				count += mod;
				if (a[j] > a[j + 1]) {
					a[j] -= mod;
				} else {
					a[j + 1] -= mod;
				}
			}
		}

		System.out.println(count);
	}

}
