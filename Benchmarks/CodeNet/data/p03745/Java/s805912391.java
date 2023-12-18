import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String arrayLength = sc.nextLine();
		String array = sc.nextLine();

		Integer[] intArray = returnIntegerArray(array);
		Boolean isPlus = null;
		int answer = 1;
		for (int i = 1; i <= Integer.parseInt(arrayLength); i++) {
			if ((isPlus == null || isPlus) && intArray[i - 1] > intArray[i]) {
				isPlus = false;
				answer++;
			} else if ((isPlus == null || !isPlus) && intArray[i - 1] < intArray[i]) {
				isPlus = true;
				answer++;
			}
		}

		System.out.println(answer);

	}

	private static Integer[] returnIntegerArray(String array) {
		String[] strArray = array.split(" ");
		Integer[] intArray = new Integer[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);

		}
		return intArray;
	}
}