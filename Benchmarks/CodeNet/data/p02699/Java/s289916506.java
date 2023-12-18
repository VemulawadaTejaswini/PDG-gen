import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.print("How many sheep? Enter a whole number between 1 and 100.");
		int numSheep = scnr.nextInt();

		System.out.print("How many wolves? Enter a whole number between 1 and 100.");
		int numWolf = scnr.nextInt();

		if (numSheep > numWolf) {
			System.out.print("safe");
		}
		else if (numSheep < numWolf) {
			System.out.print("unsafe");
		}
		else {
			System.out.print("unsafe");
		}
	}
}
