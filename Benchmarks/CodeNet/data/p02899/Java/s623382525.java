import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		final int NUM = scan.nextInt();
		int[] timing = new int[NUM + 1];
		for (int i = 1; i <= NUM; i++) {
			timing[scan.nextInt()] = i;
		}

		// answer
		for (int i = 1; i <= NUM; i++) {
			System.out.print(timing[i] + " ");
		}
		System.out.println("");

	}
}
