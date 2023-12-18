
public class Main {

	public static void main(String... args) {

		// まずい解毒剤クッキー数
		int badMedichineCount = Integer.parseInt(args[0]);

		// おいしい解毒剤クッキー数
		int goodMedichineCount = Integer.parseInt(args[1]);

		// おいしい毒入りクッキー数
		int poisonCount = Integer.parseInt(args[2]);

		if (poisonCount <= (goodMedichineCount + badMedichineCount)) {
			System.out.println(poisonCount + goodMedichineCount);
		} else {
			System.out.println((goodMedichineCount * 2) + badMedichineCount + 1);
		}

	}

}
