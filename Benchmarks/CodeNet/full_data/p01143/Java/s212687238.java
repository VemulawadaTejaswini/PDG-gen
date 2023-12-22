import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int P = sc.nextInt();
			if (N == 0 && M == 0 && P == 0) {
				break;
			}
			int a = 0;
			int b = 0;
			for (int i = 0; i < N; i++) {
				int t = sc.nextInt();
				if (i + 1 == M) {
					b = t;
				}
				a += t;
			}
			if (b == 0) {
				System.out.println(0);
			} else {
				int ans = (100 - P) * a / b;
				System.out.println(ans);
			}
		}
	}
}
