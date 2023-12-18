import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int[] n = new int[N + 1];

		// 入力値を設定
		for (int i = 0; i < N; i++) {
			n[i] = sc.nextInt();
		}

		int s = n[0];
		int m = 0;
		for (int i = 1; i <= N; i++) {
			while (Math.signum(s) != Math.pow(-1, i % 2)) {
				if (Math.pow(-1, i % 2) > 0) {
					s++;
				} else {
					s--;
				}
				m++;
			}
			s += n[i];
		}
		if (m == 0) {
			sc.close();
			return;
		}
		
		s = n[0];
		int p = 0;
		for (int i = 1; i <= N; i++) {
			while (Math.signum(s) != Math.pow(-1, (i + 1) % 2)) {
				if (Math.pow(-1, (i + 1) % 2) > 0) {
					s++;
				} else {
					s--;
				}
				p++;
			}
			s += n[i];
		}

		if (m > p) {
			System.out.print(p);
		} else {
			System.out.print(m);
		}

		sc.close();
	}
}
