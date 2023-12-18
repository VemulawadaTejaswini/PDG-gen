import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] divisors = {1, 6, 9, 36, 81, 216, 729, 1296, 6561, 7776, 46656, 59049};

		int amount = Integer.parseInt(scanner.nextLine());
		short[] numProcedures = new short[amount + 1];
		numProcedures[0] = 0;

		for (int aIdx = 1; aIdx <= amount; aIdx++) {
			short minNumProcedure = Short.MAX_VALUE;
			for (int dIdx = 0; dIdx < divisors.length && divisors[dIdx] <= aIdx; dIdx++) {
				short tmpNumProcedure = (short) (numProcedures[aIdx - divisors[dIdx]] + 1);
				if (minNumProcedure > tmpNumProcedure) minNumProcedure = tmpNumProcedure;
			}
			numProcedures[aIdx] = minNumProcedure;
		}

		System.out.println(numProcedures[amount]);
	}
}
