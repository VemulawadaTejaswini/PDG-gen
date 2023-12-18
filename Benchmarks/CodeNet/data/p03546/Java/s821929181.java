
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());

		int[][] c = new int[10][10];
		int[] a = new int[10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				c[i][j] = Integer.parseInt(sc.next());
			}
		}

		int b;
		for (int i = 0; i < h * w; i++) {
			b = Integer.parseInt(sc.next());
			if (b != -1)
				a[b]++;
		}

		for (int k = 0; k < 10; k++) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					c[i][j] = Math.min(c[i][j], c[i][k] + c[k][j]);
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < 10; i++) {
			ans += a[i] * c[i][1];
		}

		System.out.println(ans);

	}

}
