import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str1 = scan.nextLine();
		int count = Integer.parseInt(str1);

		String str2 = scan.nextLine();
		int[] heightArray = parseIntArrayFromString(str2);

		int[] minCostArray = new int[count];
		minCostArray[0] = 0;
		minCostArray[1] = Math.abs(heightArray[0] - heightArray[1]);

		for (int i = 2; i < count; i++) {

			int a = minCostArray[i - 2] + Math.abs(heightArray[i] - heightArray[i - 2]);
			int b = minCostArray[i - 1] + Math.abs(heightArray[i] - heightArray[i - 1]);

			minCostArray[i] = Math.min(a, b);
		}

		System.out.println(minCostArray[count - 1]);
	}

	private static int[] parseIntArrayFromString(String stringBeforeSplit) {

		String[] stringArray = stringBeforeSplit.split(" ");

		return Arrays.stream(stringArray)
				.mapToInt(Integer::parseInt)
				.toArray();
	}
}
