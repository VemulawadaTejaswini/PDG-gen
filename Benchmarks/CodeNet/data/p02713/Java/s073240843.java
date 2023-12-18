import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int K = scanner.nextInt();
		long answer = 0;

		for (int a = 1; a <= K; a++) {
			for (int b = 1; b <= K; b++) {
				for (int c = 1; c <= K; c++) {
					answer += gcd(gcd(a, b), c);
				}
			}
		}

		System.out.println(answer + "");
	}

	public static int gcd(int a, int b) {

		int big = Math.max(a, b);
		int small = Math.min(a, b);

		int amari = big % small;

		if (big % small == 0) {
			return small;
		}

		amari = gcd(small, amari);

		return amari;
	}
}
