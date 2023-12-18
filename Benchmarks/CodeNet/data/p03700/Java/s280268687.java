import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h[] = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();

		}
		int sum = sum(h);
		int x = 1;

		while (true) {

			sum = sum - b * n;
			if (sum < x * (a - b)) {
				break;
			}

			x++;
		}
		int need = 0;
		for (int i = 0; i < n; i++) {
			h[i] = (h[i] - (b * x));
			need += (h[i]) / (a - b);
			need++;
			if ((h[i]) % (a - b) == 0) {
				need--;
			}
		}

		while (need > x) {
			need = 0;
			x++;

			for (int i = 0; i < n; i++) {
				h[i]=(h[i] - b);
				need += (h[i] ) / (a - b);

				need++;
				if ((h[i] ) % (a - b) == 0) {
					need--;
				}

			}


		}
		System.out.println(x);
	}

	static int sum(int a[]) {
		int n = a.length;
		int ans = 0;
		for (int i = 0; i <= n - 1; i++) {
			ans += a[i];
		}
		return ans;
	}

}