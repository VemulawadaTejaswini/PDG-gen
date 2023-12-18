import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		int xtemp = x[0];
		int ytemp = y[0];
		int htemp = h[0];
		int hmax = 0;
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				hmax = htemp + Math.abs(xtemp - i) + Math.abs(ytemp - j);
				for (int k = 0; k < n; k++) {
					if (hmax - Math.abs(x[k] - i) - Math.abs(y[k] - j) == h[k]) {
						if (k == n - 1) {
							System.out.println(i + " " + j + " " + hmax);
							return;
						}
					} else {
						break;
					}
				}
			}
		}
	}
}
