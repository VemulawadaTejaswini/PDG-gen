import java.util.Scanner;

public class Main {
	static int[] prize = {
			300_000,
			200_000,
			100_000,
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(getPrize(x, y));

		sc.close();
	}

	static int getPrize(int x, int y) {
		int sumPrize = 0;
		if (x <= prize.length) {
			sumPrize += prize[x - 1];
		}
		if (y <= prize.length) {
			sumPrize += prize[y - 1];
		}

		if (x == 1 && y == 1) {
			sumPrize += 400_000;
		}

		return sumPrize;
	}
}
