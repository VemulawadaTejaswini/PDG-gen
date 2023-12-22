import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int r[];
		int r2[];

		n = sc.nextInt();
		m = sc.nextInt();
		r = new int[n];
		r2 = new int[n];
		for (int i = 0; i < m; i++) {
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				r[sc.nextInt() - 1] = i;
			}
		}

		int R = sc.nextInt();
		for (int i = 0; i < R; i++) {
			int b1 = sc.nextInt();
			int b2 = sc.nextInt();
			if (r[b1 - 1] == r[b2 - 1]) {
				r2[b1 - 1] = r2[b2 - 1] = 1;
			}
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += r2[i];
		}

		System.out.println(sum);
	}
}