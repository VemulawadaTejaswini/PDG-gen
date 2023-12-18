import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = sc.nextInt();
			}
		}

		int[] a = new int[3];
		int[] b = new int[3];

		for (int i = 0; i < 3; i++) {
			int min = 100;
			for (int j = 0; j < 3; j++) {
				if (c[i][j] < min)
					min = c[i][j];
			}
			a[i] = min;
		}
		System.out.println(Arrays.toString(a)); // debug

		for (int j = 0; j < 3; j++) {
			int min = 100;
			for (int i = 0; i < 3; i++) {
				if (c[i][j] < min)
					min = c[i][j];
			}
			b[j] = min;
		}
		System.out.println(Arrays.toString(b)); // debug

		int cnt = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k <= a[i]; k++) {
					for (int l = 0; l <= b[j]; l++) {
						if (k + l == c[i][j])
							cnt++;
					}
				}
			}
		}
		System.out.println(cnt);

		if (cnt == 9) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();

	}

}