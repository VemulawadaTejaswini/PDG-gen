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

		int base = 0;
		int current = 0;
		for (int targetNum = 1; targetNum <= inputN; targetNum++) {
			int target = inputAs[targetNum - 1];
			base += Math.abs(target - current);
			current = target;
		}
		base += Math.abs(0 - current);

		for (int targetNum = 1; targetNum <= inputN; targetNum++) {
			int sum = base;
			if (targetNum == 1) {
				sum -= Math.abs(inputAs[0]);
				sum -= Math.abs(inputAs[1] - inputAs[0]);
				sum += Math.abs(inputAs[1]);
			} else if (targetNum == inputN) {
				sum -= Math.abs(inputAs[inputN - 1] - inputAs[inputN - 2]);
				sum -= Math.abs(inputAs[inputN - 1]);
				sum += Math.abs(inputAs[inputN - 2]);
			} else {
				sum -= Math.abs(inputAs[targetNum - 2] - inputAs[targetNum - 1]);
				sum -= Math.abs(inputAs[targetNum - 1] - inputAs[targetNum]);
				sum += Math.abs(inputAs[targetNum] - inputAs[targetNum - 2]);
			}
			System.out.println(sum);
		}

	}
}
