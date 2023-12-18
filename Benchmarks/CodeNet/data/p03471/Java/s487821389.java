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
		for (int i = N; i >= 0; i--) {
			for (int j = (N - i) * 2; j >= 0; j--) {
				if (((i * 10000) + (j * 5000) + ((N - i - j) * 5) == Y)) {
					System.out.println(i + " " + j + " " + ((N - i - j) * 5));
					sc.close();
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
		sc.close();
	}
}