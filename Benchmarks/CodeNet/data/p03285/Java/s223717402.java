import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Solution();
	}

}

class Solution {

	private int n;

	public Solution() {
		this.setScanner();
		this.run();
	}

	private void setScanner() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
	}

	private void run() {

		if (n < 4) {
			System.out.println("No");
			return;
		}

		int max = 100 / 4;

		for (int cake = 0; cake < max; cake++) {
			for (int donuts = 0; donuts < max - cake; donuts++) {
				if (4 * cake + 7 * donuts == n) {
					System.out.println("YES");
					return;
				}
			}
		}

		System.out.println("No");
	}

}