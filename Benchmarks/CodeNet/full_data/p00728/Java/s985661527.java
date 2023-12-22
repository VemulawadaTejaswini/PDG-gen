import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int dataSet = scanner.nextInt();
			if (dataSet == 0) {
				break;
			}
			int[] scoreArray = new int[dataSet];
			for (int i = 0; i < dataSet; i++) {
				scoreArray[i] = scanner.nextInt();
			}

			int max = 0, min = 0;
			for (int score : scoreArray) {
				if (score > max) {
					max = score;
				}
				if (score < min) {
					min = score;
				}
			}

			int sum = 0;
			for (int score : scoreArray) {
				sum += score;
			}
			sum -= max;
			sum -= min;

			System.out.printf("%d", sum / (dataSet - 2));
			System.out.println();
		}
	}
}