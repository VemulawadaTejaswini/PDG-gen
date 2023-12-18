import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x[] = new int[N];
		int y[] = new int[N];
		int h[] = new int[N];

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				int cx = i;
				int cy = j;
				int ch = h[0] + (int)(Math.abs(cx-x[0])) + (int)(Math.abs(cy-y[0]));
				for (int k = 0; k < N; k++) {
					int tmp = Math.abs(cx-x[k]) + Math.abs(cy-y[k]);
					if (Math.max(ch-tmp, 0) != h[k]) {
						break;
					}
					if (k==N-1) {
						System.out.println(cx + " " + cy + " " + ch);
						return;
					}
				}
			}
		}
	}
}
