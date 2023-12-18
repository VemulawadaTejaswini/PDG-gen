import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numTown = input.nextInt();
		input.nextInt();
		int[] val = new int[numTown];
		for (int i = 0; i < numTown; i++) {
			val[i] = input.nextInt();
		}
		int maxdiff = 0;
		int count = 0;

		for (int i = 0; i < numTown; i++) {
			for (int j = i + 1; j < numTown; j++) {
				if (val[j] - val[i] > maxdiff) {
					maxdiff = val[j] - val[i];
					count = 1;
				} else if (val[j] - val[i] == maxdiff) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
