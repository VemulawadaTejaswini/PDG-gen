import java.util.Scanner;

/**
 * TITLE : Otoshidama
 * URL : https://atcoder.jp/contests/abc085/tasks/abc085_c
 */
public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= N; j++) {
				for (int k = 0; k <= N; k++) {
					if (((i+j+k) == N) && ((i * 10000) + (j * 5000) + (k * 1000) == Y)) {
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