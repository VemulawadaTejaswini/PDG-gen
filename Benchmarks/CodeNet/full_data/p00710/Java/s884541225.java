import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, r, p, c;
		int num[], tmp;
		int i, j, k;// loop counter
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			num = new int[n];
			for (i = 0; i < n; ++i) {
				num[i] = i + 1;
			}
			r = sc.nextInt();

			if (n == 0 && r == 0) {
				break;
			}
			for (i = 0; i < r; ++i) {
				p = sc.nextInt();
				c = sc.nextInt();

				for (j = 0; j < c; ++j) {
					for (k = 0; k < p - 1; ++k) {
						tmp = num[n - p - j + k + 1];
						num[n - p - j + k + 1] = num[n - p - j + k];
						num[n - p - j + k] = tmp;
					}
				}

			}
			System.out.println(num[n - 1]);
		}
		sc.close();
	}

}
