package ABC150;

import java.util.Scanner;

public class Main {
	static final int COIN = 500;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		System.out.println(countCoin(x, y));
	}

	static String countCoin(int x, int y) {
		if (COIN * x >= y) {
			return "Yes";
		}
		return "No";
	}
}