import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int counter = 0;
		while (scanner.hasNext()) {

			if (counter == 0) {
				counter = scanner.nextInt();
				if (counter == 0) {
					break;
				}
			}

			String answer = "";
			int calc = counter;
			int rem = 0;

			while (calc >= 8) {
				rem = calc%8;
				answer = String.valueOf(rem) + answer;

				calc = calc/8;
			}
			// 最後の数値
			answer =  String.valueOf(calc) + answer;

			// 単純に置換
			answer = answer.replace("7", "9");
			answer = answer.replace("6", "8");
			answer = answer.replace("5", "7");
			answer = answer.replace("4", "5");

			System.out.println(answer);

			counter = 0;
		}

		scanner.close();
	}



}
