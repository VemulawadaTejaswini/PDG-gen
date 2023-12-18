import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

       		String initailString = scanner.nextLine();
		int initialNumber = Integer.parseInt(initailString);

		String answerTime = scanner.nextLine();

		String[] strStdIn = answerTime.split(" ", 0);
		
		String secondString = scanner.nextLine();
		int secondNumber = Integer.parseInt(secondString);

		String[] strDrink = new String[secondNumber];

		for (int r = 0; r < secondNumber; r++) {
			strDrink[r] = scanner.nextLine();
		}

		String[][] drink = new String[secondNumber][2];

		for (int n = 0; n < secondNumber; n++) {
			drink[n] = strDrink[n].split(" ", 0);
		}

		for (int s = 0; s < secondNumber; s++) {
			System.out.println(calculate(drink[s][0], drink[s][1], strStdIn, initialNumber));
		}
	}

	private static int calculate(String position, String number, String[] calculate, int totalNumber) {
		
		int iPosition = Integer.parseInt(position) -1;
		int iNumber = Integer.parseInt(number);

		int amount = 0;

		for (int i = 0; i < totalNumber; i++) {
			amount += Integer.parseInt(calculate[i]);
		}

		amount = amount + iNumber - Integer.parseInt(calculate[iPosition]);

		return amount;
	}

}