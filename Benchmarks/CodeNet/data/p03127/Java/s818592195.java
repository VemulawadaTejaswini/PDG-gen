import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int count = scanner.nextInt();
			scanner.nextLine();
			int result = 0;
			for (int i = 0; i < count; i++) {
				int number = scanner.nextInt();
				if (0 == i) {
					result = number;
				} else {
					result = getGreatestCommonDivisor(result, number);
				}
			}
			scanner.nextLine();
			System.out.println(result);
		}
	}

	/**
	 * 最大公約数を計算
	 * 
	 * @param x
	 * @param y
	 * @return 最大公約数
	 */
	private static int getGreatestCommonDivisor(int x, int y) {
		int tmp = 0;
		int bigNumber = (x > y) ? x : y;
		int smallNumber = (x > y) ? y : x;
		while (0 != (tmp = bigNumber % smallNumber)) {
			bigNumber = smallNumber;
			smallNumber = tmp;
		}
		return smallNumber;
	}
}
