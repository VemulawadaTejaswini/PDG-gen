import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int WATER1 = sc.nextInt();
		final int WATER2 = sc.nextInt();
		final int SUGAR1 = sc.nextInt();
		final int SUGAR2 = sc.nextInt();
		final int SUGARLIMIT = sc.nextInt();
		final int BEAKERLIMIT = sc.nextInt();

		int water1SugarLimit = SUGARLIMIT * WATER1;
		int sugar1Count = water1SugarLimit / SUGAR1;
		int sugarTotal = SUGAR1 * sugar1Count;
		for (int sugar2Count = 0;
			 ((sugar1Count - 1) * SUGAR1) + ((sugar2Count + 1) * SUGAR2) <= water1SugarLimit && WATER1 * 100 + sugarTotal <= BEAKERLIMIT;
			 ) {
			sugarTotal -= SUGAR1;
			sugarTotal += SUGAR2;
			sugar1Count--;
			sugar2Count++;
		}

		System.out.println(String.valueOf(sugarTotal + WATER1 * 100) + " " + sugarTotal);
	}

}
