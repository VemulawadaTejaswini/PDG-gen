import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main myself = new Main();
		myself.execute();

	}

	/**
	 * 実処理メソッド
	 */
	public void execute() {

		int X = 0;
		int Y = 0;
		int Z = 0;

		try (Scanner scanner = new Scanner(System.in)) {

			X = scanner.nextInt();
			Y = scanner.nextInt();
			Z = scanner.nextInt();
		}

		double a = ((X - (2 * Z)) / (Y + Z));

		System.out.println((int) Math.ceil(a));

	}

}
