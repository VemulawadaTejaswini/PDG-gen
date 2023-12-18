import java.util.Scanner;

/**
 * TITLE : Otoshidama
 * URL : https://atcoder.jp/contests/abc051/tasks/abc051_b
 */
public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					int maisu = i+j+k;
					int goukei = (i * 10000) + (j * 5000) + (k * 1000);
					if (maisu <= N && goukei == Y) {
						System.out.println(i + " " + j + " " + k);
						sc.close();
						return;
					}
				}
			}
		}

		System.out.println("-1 -1 -1");
		sc.close();
	}
}