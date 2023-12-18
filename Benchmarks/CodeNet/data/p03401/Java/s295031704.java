import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputN = scanner.nextInt();
		int[] inputAs = new int[inputN];
		for (int i = 0; i < inputN; i++) {
			inputAs[i] = scanner.nextInt();
		}
		scanner.close();

		int sum = 0;
		int current = 0;
		for (int i = 1; i <= inputN; i++) {
			for (int targetNum = 1; targetNum <= inputN; targetNum++) {
				if (i != targetNum) {
					int target = inputAs[targetNum - 1];
					sum += Math.abs(target - current);
					current = target;
				}
			}
			sum += Math.abs(0 - current);
			System.out.println(sum);
			sum = 0;
			current = 0;
		}
	}
}
