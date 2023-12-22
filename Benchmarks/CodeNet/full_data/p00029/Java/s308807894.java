import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			while (input.ready()) {
				final String[] dataset = input.readLine().split(" ");
				System.out.println(getMostFrequentlyText(dataset) + " " + getMaximumLengthText(dataset));
			}
		}
	}

	private static String getMostFrequentlyText(final String[] stringArray) {
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < stringArray.length; i++) {
			if (map.containsKey(stringArray[i])) {
				map.put(stringArray[i], map.get(stringArray[i]) + 1);
			} else {
				map.put(stringArray[i], 1);
			}
		}
		int[] count = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			count[i] = map.get(stringArray[i]);
		}
		return stringArray[getIndexOfMaxValue(count)];
	}

	private static String getMaximumLengthText(String[] stringArray) {
		int[] count = new int[stringArray.length];

		for (int i = 0; i < stringArray.length; i++) {
			count[i] = stringArray[i].length();
		}
		return stringArray[getIndexOfMaxValue(count)];
	}

	private static int getIndexOfMaxValue(final int[] array) {
		int num = 0;
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (num < array[i]) {
				num = array[i];
				index = i;
			}
		}
		return index;
	}
}