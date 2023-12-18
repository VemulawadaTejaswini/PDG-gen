import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];
		int ans = 0, pre = 0;
		int xc = 0, yc = 0, H = 0;

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}

		loop1:
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				loop3:
				for (int k = 0; k < n; k++) {
					if (k == 0) {
						pre = Math.abs(x[k] - i) + Math.abs(y[k] - j) + h[k];
						continue;
					}
					ans = Math.abs(x[k] - i) + Math.abs(y[k] - j) + h[k];
					if (ans != pre) {
						break loop3;
					}
					pre = ans;
					if (k == n - 1) {
						xc = i;
						yc = j;
						H = pre;
						break loop1;
					}
				}
			}
		}

		System.out.println(xc + " " + yc + " " + ans);

		sc.close();
	}
}
