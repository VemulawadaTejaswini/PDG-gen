import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		int height;
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				height = 0;
				for (int k = 0; k < N; k++) {
					if (h[k] != 0 && height == 0) {
						height = h[k] + Math.abs(x[k] - i) + Math.abs(y[k] - j);
					}
					if (h[k] != Math.max(height - Math.abs(x[k] - i) - Math.abs(y[k] - j), 0)) {
						break;
					}
					if (k == N - 1) {
						System.out.println(i + " " + j + " " + height);
						sc.close();
						return;
					}
				}
			}
		}

		sc.close();
	}

}
