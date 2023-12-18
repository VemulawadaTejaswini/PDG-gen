import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str1 = scan.nextLine();
		int[] str1Array = parseIntArrayFromString(str1);

		int count = str1Array[0];
		int maxJump = str1Array[1];

		String str2 = scan.nextLine();
		int[] heightArray = parseIntArrayFromString(str2);

		int[] minCostArray = new int[count];

		Arrays.fill(minCostArray, Integer.MAX_VALUE);
		minCostArray[0] = 0;

		for (int i = 1; i < count; i++) {

			int checkCount = Math.min(i, maxJump);

			for (int j = 1; j <= checkCount; j++) {

				minCostArray[i] = Math.min(
						minCostArray[i],
						minCostArray[i - j] + Math.abs(heightArray[i] - heightArray[i - j]));
			}
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
